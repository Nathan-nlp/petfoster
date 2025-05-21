package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusschongwuxinxiEntity;
import com.entity.view.DiscusschongwuxinxiView;

import com.service.DiscusschongwuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 宠物信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
@RestController
@RequestMapping("/discusschongwuxinxi")
public class DiscusschongwuxinxiController {
    @Autowired
    private DiscusschongwuxinxiService discusschongwuxinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschongwuxinxiEntity discusschongwuxinxi,
		HttpServletRequest request){
        EntityWrapper<DiscusschongwuxinxiEntity> ew = new EntityWrapper<DiscusschongwuxinxiEntity>();

		PageUtils page = discusschongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschongwuxinxiEntity discusschongwuxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscusschongwuxinxiEntity> ew = new EntityWrapper<DiscusschongwuxinxiEntity>();

		PageUtils page = discusschongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwuxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschongwuxinxiEntity discusschongwuxinxi){
       	EntityWrapper<DiscusschongwuxinxiEntity> ew = new EntityWrapper<DiscusschongwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschongwuxinxi, "discusschongwuxinxi")); 
        return R.ok().put("data", discusschongwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschongwuxinxiEntity discusschongwuxinxi){
        EntityWrapper< DiscusschongwuxinxiEntity> ew = new EntityWrapper< DiscusschongwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschongwuxinxi, "discusschongwuxinxi")); 
		DiscusschongwuxinxiView discusschongwuxinxiView =  discusschongwuxinxiService.selectView(ew);
		return R.ok("查询宠物信息评论表成功").put("data", discusschongwuxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschongwuxinxiEntity discusschongwuxinxi = discusschongwuxinxiService.selectById(id);
        return R.ok().put("data", discusschongwuxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschongwuxinxiEntity discusschongwuxinxi = discusschongwuxinxiService.selectById(id);
        return R.ok().put("data", discusschongwuxinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschongwuxinxiEntity discusschongwuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discusschongwuxinxi);
        discusschongwuxinxiService.insert(discusschongwuxinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschongwuxinxiEntity discusschongwuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discusschongwuxinxi);
        discusschongwuxinxiService.insert(discusschongwuxinxi);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscusschongwuxinxiEntity discusschongwuxinxi = discusschongwuxinxiService.selectOne(new EntityWrapper<DiscusschongwuxinxiEntity>().eq("", username));
        return R.ok().put("data", discusschongwuxinxi);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscusschongwuxinxiEntity discusschongwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschongwuxinxi);
        discusschongwuxinxiService.updateById(discusschongwuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschongwuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscusschongwuxinxiEntity discusschongwuxinxi, HttpServletRequest request,String pre){
        EntityWrapper<DiscusschongwuxinxiEntity> ew = new EntityWrapper<DiscusschongwuxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discusschongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwuxinxi), params), params));
        return R.ok().put("data", page);
    }










}
