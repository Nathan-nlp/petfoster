package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.ShangjiaEntity;
import com.entity.view.ShangjiaView;
import com.service.TokenService;
import com.service.ShangjiaService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * 商家
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
@RestController
@RequestMapping("/shangjia")
public class ShangjiaController {
    @Autowired
    private ShangjiaService shangjiaService;




    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		ShangjiaEntity u = shangjiaService.selectOne(new EntityWrapper<ShangjiaEntity>().eq("shangjiazhanghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"shangjia",  "商家" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody ShangjiaEntity shangjia){
    	//ValidatorUtils.validateEntity(shangjia);
    	ShangjiaEntity u = shangjiaService.selectOne(new EntityWrapper<ShangjiaEntity>().eq("shangjiazhanghao", shangjia.getShangjiazhanghao()));
		if(u!=null) {
			return R.error("注册商家已存在");
		}
		Long uId = new Date().getTime();
		shangjia.setId(uId);
        shangjiaService.insert(shangjia);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取商家的session商家信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        ShangjiaEntity u = shangjiaService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	ShangjiaEntity u = shangjiaService.selectOne(new EntityWrapper<ShangjiaEntity>().eq("shangjiazhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        shangjiaService.updateById(u);
        return R.ok("密码已重置为：123456");
    }



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangjiaEntity shangjia,
		HttpServletRequest request){
        EntityWrapper<ShangjiaEntity> ew = new EntityWrapper<ShangjiaEntity>();

		PageUtils page = shangjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjia), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangjiaEntity shangjia, 
		HttpServletRequest request){
        EntityWrapper<ShangjiaEntity> ew = new EntityWrapper<ShangjiaEntity>();

		PageUtils page = shangjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjia), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangjiaEntity shangjia){
       	EntityWrapper<ShangjiaEntity> ew = new EntityWrapper<ShangjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangjia, "shangjia")); 
        return R.ok().put("data", shangjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangjiaEntity shangjia){
        EntityWrapper< ShangjiaEntity> ew = new EntityWrapper< ShangjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangjia, "shangjia")); 
		ShangjiaView shangjiaView =  shangjiaService.selectView(ew);
		return R.ok("查询商家成功").put("data", shangjiaView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangjiaEntity shangjia = shangjiaService.selectById(id);
        return R.ok().put("data", shangjia);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangjiaEntity shangjia = shangjiaService.selectById(id);
        return R.ok().put("data", shangjia);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangjiaEntity shangjia, HttpServletRequest request){
        if(shangjiaService.selectCount(new EntityWrapper<ShangjiaEntity>().eq("shangjiazhanghao", shangjia.getShangjiazhanghao()))>0) {
            return R.error("商家账号已存在");
        }
    	shangjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangjia);
    	ShangjiaEntity u = shangjiaService.selectOne(new EntityWrapper<ShangjiaEntity>().eq("shangjiazhanghao", shangjia.getShangjiazhanghao()));
		if(u!=null) {
			return R.error("商家已存在");
		}
		shangjia.setId(new Date().getTime());
        shangjiaService.insert(shangjia);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangjiaEntity shangjia, HttpServletRequest request){
        if(shangjiaService.selectCount(new EntityWrapper<ShangjiaEntity>().eq("shangjiazhanghao", shangjia.getShangjiazhanghao()))>0) {
            return R.error("商家账号已存在");
        }
    	shangjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangjia);
    	ShangjiaEntity u = shangjiaService.selectOne(new EntityWrapper<ShangjiaEntity>().eq("shangjiazhanghao", shangjia.getShangjiazhanghao()));
		if(u!=null) {
			return R.error("商家已存在");
		}
		shangjia.setId(new Date().getTime());
        shangjiaService.insert(shangjia);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShangjiaEntity shangjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangjia);
        if(shangjiaService.selectCount(new EntityWrapper<ShangjiaEntity>().ne("id", shangjia.getId()).eq("shangjiazhanghao", shangjia.getShangjiazhanghao()))>0) {
            return R.error("商家账号已存在");
        }
        shangjiaService.updateById(shangjia);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangjiaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
