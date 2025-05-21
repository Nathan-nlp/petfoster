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

import com.entity.SijiyangchongEntity;
import com.entity.view.SijiyangchongView;

import com.service.SijiyangchongService;
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
 * 四季养宠
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-25 17:19:24
 */
@RestController
@RequestMapping("/sijiyangchong")
public class SijiyangchongController {
    @Autowired
    private SijiyangchongService sijiyangchongService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SijiyangchongEntity sijiyangchong,
		HttpServletRequest request){
        EntityWrapper<SijiyangchongEntity> ew = new EntityWrapper<SijiyangchongEntity>();

		PageUtils page = sijiyangchongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sijiyangchong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SijiyangchongEntity sijiyangchong, 
		HttpServletRequest request){
        EntityWrapper<SijiyangchongEntity> ew = new EntityWrapper<SijiyangchongEntity>();

		PageUtils page = sijiyangchongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sijiyangchong), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SijiyangchongEntity sijiyangchong){
       	EntityWrapper<SijiyangchongEntity> ew = new EntityWrapper<SijiyangchongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( sijiyangchong, "sijiyangchong")); 
        return R.ok().put("data", sijiyangchongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SijiyangchongEntity sijiyangchong){
        EntityWrapper< SijiyangchongEntity> ew = new EntityWrapper< SijiyangchongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( sijiyangchong, "sijiyangchong")); 
		SijiyangchongView sijiyangchongView =  sijiyangchongService.selectView(ew);
		return R.ok("查询四季养宠成功").put("data", sijiyangchongView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SijiyangchongEntity sijiyangchong = sijiyangchongService.selectById(id);
		sijiyangchong.setClicktime(new Date());
		sijiyangchongService.updateById(sijiyangchong);
        sijiyangchong = sijiyangchongService.selectView(new EntityWrapper<SijiyangchongEntity>().eq("id", id));
        return R.ok().put("data", sijiyangchong);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SijiyangchongEntity sijiyangchong = sijiyangchongService.selectById(id);
		sijiyangchong.setClicktime(new Date());
		sijiyangchongService.updateById(sijiyangchong);
        sijiyangchong = sijiyangchongService.selectView(new EntityWrapper<SijiyangchongEntity>().eq("id", id));
        return R.ok().put("data", sijiyangchong);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SijiyangchongEntity sijiyangchong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(sijiyangchong);
        sijiyangchongService.insert(sijiyangchong);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SijiyangchongEntity sijiyangchong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(sijiyangchong);
        sijiyangchongService.insert(sijiyangchong);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SijiyangchongEntity sijiyangchong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(sijiyangchong);
        sijiyangchongService.updateById(sijiyangchong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        sijiyangchongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,SijiyangchongEntity sijiyangchong, HttpServletRequest request,String pre){
        EntityWrapper<SijiyangchongEntity> ew = new EntityWrapper<SijiyangchongEntity>();
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
		PageUtils page = sijiyangchongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sijiyangchong), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,SijiyangchongEntity sijiyangchong, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "sijifenlei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "sijiyangchong").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<SijiyangchongEntity> sijiyangchongList = new ArrayList<SijiyangchongEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                sijiyangchongList.addAll(sijiyangchongService.selectList(new EntityWrapper<SijiyangchongEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<SijiyangchongEntity> ew = new EntityWrapper<SijiyangchongEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = sijiyangchongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sijiyangchong), params), params));
        List<SijiyangchongEntity> pageList = (List<SijiyangchongEntity>)page.getList();
        if(sijiyangchongList.size()<limit) {
            int toAddNum = (limit-sijiyangchongList.size())<=pageList.size()?(limit-sijiyangchongList.size()):pageList.size();
            for(SijiyangchongEntity o1 : pageList) {
                boolean addFlag = true;
                for(SijiyangchongEntity o2 : sijiyangchongList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    sijiyangchongList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(sijiyangchongList.size()>limit) {
            sijiyangchongList = sijiyangchongList.subList(0, limit);
        }
        page.setList(sijiyangchongList);
        return R.ok().put("data", page);
    }








}
