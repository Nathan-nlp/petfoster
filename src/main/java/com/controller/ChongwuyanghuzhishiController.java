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
import com.utils.UserBasedCollaborativeFiltering;

import com.entity.ChongwuyanghuzhishiEntity;
import com.entity.view.ChongwuyanghuzhishiView;

import com.service.ChongwuyanghuzhishiService;
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
 * 宠物养护知识
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
@RestController
@RequestMapping("/chongwuyanghuzhishi")
public class ChongwuyanghuzhishiController {
    @Autowired
    private ChongwuyanghuzhishiService chongwuyanghuzhishiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwuyanghuzhishiEntity chongwuyanghuzhishi,
		HttpServletRequest request){
        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();

		PageUtils page = chongwuyanghuzhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuyanghuzhishi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwuyanghuzhishiEntity chongwuyanghuzhishi, 
		HttpServletRequest request){
        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();

		PageUtils page = chongwuyanghuzhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuyanghuzhishi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwuyanghuzhishiEntity chongwuyanghuzhishi){
       	EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuyanghuzhishi, "chongwuyanghuzhishi")); 
        return R.ok().put("data", chongwuyanghuzhishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwuyanghuzhishiEntity chongwuyanghuzhishi){
        EntityWrapper< ChongwuyanghuzhishiEntity> ew = new EntityWrapper< ChongwuyanghuzhishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuyanghuzhishi, "chongwuyanghuzhishi")); 
		ChongwuyanghuzhishiView chongwuyanghuzhishiView =  chongwuyanghuzhishiService.selectView(ew);
		return R.ok("查询宠物养护知识成功").put("data", chongwuyanghuzhishiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwuyanghuzhishiEntity chongwuyanghuzhishi = chongwuyanghuzhishiService.selectById(id);
		chongwuyanghuzhishi.setClicknum(chongwuyanghuzhishi.getClicknum()+1);
		chongwuyanghuzhishiService.updateById(chongwuyanghuzhishi);
        chongwuyanghuzhishi = chongwuyanghuzhishiService.selectView(new EntityWrapper<ChongwuyanghuzhishiEntity>().eq("id", id));
        return R.ok().put("data", chongwuyanghuzhishi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwuyanghuzhishiEntity chongwuyanghuzhishi = chongwuyanghuzhishiService.selectById(id);
		chongwuyanghuzhishi.setClicknum(chongwuyanghuzhishi.getClicknum()+1);
		chongwuyanghuzhishiService.updateById(chongwuyanghuzhishi);
        chongwuyanghuzhishi = chongwuyanghuzhishiService.selectView(new EntityWrapper<ChongwuyanghuzhishiEntity>().eq("id", id));
        return R.ok().put("data", chongwuyanghuzhishi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ChongwuyanghuzhishiEntity chongwuyanghuzhishi = chongwuyanghuzhishiService.selectById(id);
        if(type.equals("1")) {
        	chongwuyanghuzhishi.setThumbsupnum(chongwuyanghuzhishi.getThumbsupnum()+1);
        } else {
        	chongwuyanghuzhishi.setCrazilynum(chongwuyanghuzhishi.getCrazilynum()+1);
        }
        chongwuyanghuzhishiService.updateById(chongwuyanghuzhishi);
        return R.ok("投票成功");
    }

    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuyanghuzhishiEntity chongwuyanghuzhishi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuyanghuzhishi);
        chongwuyanghuzhishiService.insert(chongwuyanghuzhishi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuyanghuzhishiEntity chongwuyanghuzhishi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuyanghuzhishi);
        chongwuyanghuzhishiService.insert(chongwuyanghuzhishi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwuyanghuzhishiEntity chongwuyanghuzhishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuyanghuzhishi);
        chongwuyanghuzhishiService.updateById(chongwuyanghuzhishi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwuyanghuzhishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ChongwuyanghuzhishiEntity chongwuyanghuzhishi, HttpServletRequest request,String pre){
        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
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
		PageUtils page = chongwuyanghuzhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuyanghuzhishi), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（基于用户收藏的协同算法）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ChongwuyanghuzhishiEntity chongwuyanghuzhishi, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("tablename", "chongwuyanghuzhishi"));
        Map<String, Map<String, Double>> ratings = new HashMap<>();
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity storeup : storeups) {
                Map<String, Double> userRatings = null;
                if(ratings.containsKey(storeup.getUserid().toString())) {
                    userRatings = ratings.get(storeup.getUserid().toString());
                } else {
                    userRatings = new HashMap<>();
                    ratings.put(storeup.getUserid().toString(), userRatings);
                }

                if(userRatings.containsKey(storeup.getRefid().toString())) {
                    userRatings.put(storeup.getRefid().toString(), userRatings.get(storeup.getRefid().toString())+1.0);
                } else {
                    userRatings.put(storeup.getRefid().toString(), 1.0);
                }
            }
        }
        // 创建协同过滤对象
        UserBasedCollaborativeFiltering filter = new UserBasedCollaborativeFiltering(ratings);

        // 为指定用户推荐物品
        String targetUser = userId;
        int numRecommendations = limit;
        List<String> recommendations = filter.recommendItems(targetUser, numRecommendations);

        // 输出推荐结果
        System.out.println("Recommendations for " + targetUser + ":");
        for (String item : recommendations) {
            System.out.println(item);
        }

        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
        ew.in("id", String.join(",", recommendations));
        if(recommendations!=null && recommendations.size()>0) {
            ew.last("order by FIELD(id, "+"'"+String.join("','", recommendations)+"'"+")");
        }

        PageUtils page = chongwuyanghuzhishiService.queryPage(params, ew);
        List<ChongwuyanghuzhishiEntity> pageList = (List<ChongwuyanghuzhishiEntity>)page.getList();
        if(pageList.size()<limit) {
            int toAddNum = limit-pageList.size();
            ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
            ew.notIn("id", recommendations);
            ew.orderBy("id", false);
            ew.last("limit "+toAddNum);
            pageList.addAll(chongwuyanghuzhishiService.selectList(ew));
        } else if(pageList.size()>limit) {
            pageList = pageList.subList(0, limit);
        }
        page.setList(pageList);

        return R.ok().put("data", page);
    }




    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
        List<Map<String, Object>> result = chongwuyanghuzhishiService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计(多)）
     */
    @RequestMapping("/valueMul/{xColumnName}")
    public R valueMul(@PathVariable("xColumnName") String xColumnName,@RequestParam String yColumnNameMul, HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = chongwuyanghuzhishiService.selectValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
        List<Map<String, Object>> result = chongwuyanghuzhishiService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型(多)
     */
    @RequestMapping("/valueMul/{xColumnName}/{timeStatType}")
    public R valueMulDay(@PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,@RequestParam String yColumnNameMul,HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("timeStatType", timeStatType);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = chongwuyanghuzhishiService.selectTimeStatValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
        List<Map<String, Object>> result = chongwuyanghuzhishiService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }




    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,ChongwuyanghuzhishiEntity chongwuyanghuzhishi, HttpServletRequest request){
        EntityWrapper<ChongwuyanghuzhishiEntity> ew = new EntityWrapper<ChongwuyanghuzhishiEntity>();
        int count = chongwuyanghuzhishiService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuyanghuzhishi), params), params));
        return R.ok().put("data", count);
    }



}
