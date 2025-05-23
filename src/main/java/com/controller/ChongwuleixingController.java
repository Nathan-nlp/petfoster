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

import com.entity.ChongwuleixingEntity;
import com.entity.view.ChongwuleixingView;

import com.service.ChongwuleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 宠物类型
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
@RestController
@RequestMapping("/chongwuleixing")
public class ChongwuleixingController {
    @Autowired
    private ChongwuleixingService chongwuleixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwuleixingEntity chongwuleixing,
		HttpServletRequest request){
        EntityWrapper<ChongwuleixingEntity> ew = new EntityWrapper<ChongwuleixingEntity>();

		PageUtils page = chongwuleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwuleixingEntity chongwuleixing, 
		HttpServletRequest request){
        EntityWrapper<ChongwuleixingEntity> ew = new EntityWrapper<ChongwuleixingEntity>();

		PageUtils page = chongwuleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuleixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwuleixingEntity chongwuleixing){
       	EntityWrapper<ChongwuleixingEntity> ew = new EntityWrapper<ChongwuleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuleixing, "chongwuleixing")); 
        return R.ok().put("data", chongwuleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwuleixingEntity chongwuleixing){
        EntityWrapper< ChongwuleixingEntity> ew = new EntityWrapper< ChongwuleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuleixing, "chongwuleixing")); 
		ChongwuleixingView chongwuleixingView =  chongwuleixingService.selectView(ew);
		return R.ok("查询宠物类型成功").put("data", chongwuleixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwuleixingEntity chongwuleixing = chongwuleixingService.selectById(id);
        return R.ok().put("data", chongwuleixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwuleixingEntity chongwuleixing = chongwuleixingService.selectById(id);
        return R.ok().put("data", chongwuleixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuleixingEntity chongwuleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuleixing);
        chongwuleixingService.insert(chongwuleixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuleixingEntity chongwuleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuleixing);
        chongwuleixingService.insert(chongwuleixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwuleixingEntity chongwuleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuleixing);
        chongwuleixingService.updateById(chongwuleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwuleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
