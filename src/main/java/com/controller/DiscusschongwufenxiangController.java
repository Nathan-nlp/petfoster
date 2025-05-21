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

import com.entity.DiscusschongwufenxiangEntity;
import com.entity.view.DiscusschongwufenxiangView;

import com.service.DiscusschongwufenxiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 宠物分享评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
@RestController
@RequestMapping("/discusschongwufenxiang")
public class DiscusschongwufenxiangController {
    @Autowired
    private DiscusschongwufenxiangService discusschongwufenxiangService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschongwufenxiangEntity discusschongwufenxiang,
		HttpServletRequest request){
        EntityWrapper<DiscusschongwufenxiangEntity> ew = new EntityWrapper<DiscusschongwufenxiangEntity>();

		PageUtils page = discusschongwufenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwufenxiang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschongwufenxiangEntity discusschongwufenxiang, 
		HttpServletRequest request){
        EntityWrapper<DiscusschongwufenxiangEntity> ew = new EntityWrapper<DiscusschongwufenxiangEntity>();

		PageUtils page = discusschongwufenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwufenxiang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschongwufenxiangEntity discusschongwufenxiang){
       	EntityWrapper<DiscusschongwufenxiangEntity> ew = new EntityWrapper<DiscusschongwufenxiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschongwufenxiang, "discusschongwufenxiang")); 
        return R.ok().put("data", discusschongwufenxiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschongwufenxiangEntity discusschongwufenxiang){
        EntityWrapper< DiscusschongwufenxiangEntity> ew = new EntityWrapper< DiscusschongwufenxiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschongwufenxiang, "discusschongwufenxiang")); 
		DiscusschongwufenxiangView discusschongwufenxiangView =  discusschongwufenxiangService.selectView(ew);
		return R.ok("查询宠物分享评论表成功").put("data", discusschongwufenxiangView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschongwufenxiangEntity discusschongwufenxiang = discusschongwufenxiangService.selectById(id);
        return R.ok().put("data", discusschongwufenxiang);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschongwufenxiangEntity discusschongwufenxiang = discusschongwufenxiangService.selectById(id);
        return R.ok().put("data", discusschongwufenxiang);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschongwufenxiangEntity discusschongwufenxiang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discusschongwufenxiang);
        discusschongwufenxiangService.insert(discusschongwufenxiang);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschongwufenxiangEntity discusschongwufenxiang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discusschongwufenxiang);
        discusschongwufenxiangService.insert(discusschongwufenxiang);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscusschongwufenxiangEntity discusschongwufenxiang = discusschongwufenxiangService.selectOne(new EntityWrapper<DiscusschongwufenxiangEntity>().eq("", username));
        return R.ok().put("data", discusschongwufenxiang);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscusschongwufenxiangEntity discusschongwufenxiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschongwufenxiang);
        discusschongwufenxiangService.updateById(discusschongwufenxiang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschongwufenxiangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscusschongwufenxiangEntity discusschongwufenxiang, HttpServletRequest request,String pre){
        EntityWrapper<DiscusschongwufenxiangEntity> ew = new EntityWrapper<DiscusschongwufenxiangEntity>();
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
		PageUtils page = discusschongwufenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwufenxiang), params), params));
        return R.ok().put("data", page);
    }










}
