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

import com.entity.ChongwuchanpinEntity;
import com.entity.view.ChongwuchanpinView;

import com.service.ChongwuchanpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 宠物产品
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-25 17:19:24
 */
@RestController
@RequestMapping("/chongwuchanpin")
public class ChongwuchanpinController {
    @Autowired
    private ChongwuchanpinService chongwuchanpinService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwuchanpinEntity chongwuchanpin,
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){


        EntityWrapper<ChongwuchanpinEntity> ew = new EntityWrapper<ChongwuchanpinEntity>();
        if(pricestart!=null) ew.ge("price", pricestart);
        if(priceend!=null) ew.le("price", priceend);

        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("shangjia")) {
            chongwuchanpin.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
        }


		PageUtils page = chongwuchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuchanpin), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwuchanpinEntity chongwuchanpin, 
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<ChongwuchanpinEntity> ew = new EntityWrapper<ChongwuchanpinEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = chongwuchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuchanpin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwuchanpinEntity chongwuchanpin){
       	EntityWrapper<ChongwuchanpinEntity> ew = new EntityWrapper<ChongwuchanpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuchanpin, "chongwuchanpin")); 
        return R.ok().put("data", chongwuchanpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwuchanpinEntity chongwuchanpin){
        EntityWrapper< ChongwuchanpinEntity> ew = new EntityWrapper< ChongwuchanpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuchanpin, "chongwuchanpin")); 
		ChongwuchanpinView chongwuchanpinView =  chongwuchanpinService.selectView(ew);
		return R.ok("查询宠物产品成功").put("data", chongwuchanpinView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwuchanpinEntity chongwuchanpin = chongwuchanpinService.selectById(id);
		chongwuchanpin.setClicknum(chongwuchanpin.getClicknum()+1);
		chongwuchanpin.setClicktime(new Date());
		chongwuchanpinService.updateById(chongwuchanpin);
        chongwuchanpin = chongwuchanpinService.selectView(new EntityWrapper<ChongwuchanpinEntity>().eq("id", id));
        return R.ok().put("data", chongwuchanpin);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwuchanpinEntity chongwuchanpin = chongwuchanpinService.selectById(id);
		chongwuchanpin.setClicknum(chongwuchanpin.getClicknum()+1);
		chongwuchanpin.setClicktime(new Date());
		chongwuchanpinService.updateById(chongwuchanpin);
        chongwuchanpin = chongwuchanpinService.selectView(new EntityWrapper<ChongwuchanpinEntity>().eq("id", id));
        return R.ok().put("data", chongwuchanpin);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuchanpinEntity chongwuchanpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuchanpin);
        chongwuchanpinService.insert(chongwuchanpin);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuchanpinEntity chongwuchanpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuchanpin);
        chongwuchanpinService.insert(chongwuchanpin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwuchanpinEntity chongwuchanpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuchanpin);
        chongwuchanpinService.updateById(chongwuchanpin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwuchanpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ChongwuchanpinEntity chongwuchanpin, HttpServletRequest request,String pre){
        EntityWrapper<ChongwuchanpinEntity> ew = new EntityWrapper<ChongwuchanpinEntity>();
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
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = chongwuchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuchanpin), params), params));
        return R.ok().put("data", page);
    }










}
