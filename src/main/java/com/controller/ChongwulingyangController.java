package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.ChongwulingyangEntity;
import com.entity.ChongwulingyangEntity;
import com.entity.ChongwuxinxiEntity;
import com.entity.StoreupEntity;
import com.entity.view.ChongwulingyangView;
import com.service.ChongwulingyangService;
import com.service.ChongwuxinxiService;
import com.service.StoreupService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.UserBasedCollaborativeFiltering;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 宠物领养
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
@RestController
@RequestMapping("/chongwulingyang")
public class ChongwulingyangController {
    @Autowired
    private ChongwulingyangService chongwulingyangService;

    @Autowired
    private StoreupService storeupService;


    @Autowired
    private ChongwuxinxiService chongwuxinxiService;
    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwulingyangEntity chongwulingyang,
		HttpServletRequest request){
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();

        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("shangjia")) {
            chongwulingyang.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("yonghu")) {
            chongwulingyang.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
        }

		PageUtils page = chongwulingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwulingyang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwulingyangEntity chongwulingyang, 
		HttpServletRequest request){
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();

        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yonghu")) {
            chongwulingyang.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
        }


		PageUtils page = chongwulingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwulingyang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwulingyangEntity chongwulingyang){
       	EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwulingyang, "chongwulingyang")); 
        return R.ok().put("data", chongwulingyangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwulingyangEntity chongwulingyang){
        EntityWrapper< ChongwulingyangEntity> ew = new EntityWrapper< ChongwulingyangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwulingyang, "chongwulingyang")); 
		ChongwulingyangView chongwulingyangView =  chongwulingyangService.selectView(ew);
		return R.ok("查询宠物领养成功").put("data", chongwulingyangView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwulingyangEntity chongwulingyang = chongwulingyangService.selectById(id);
		chongwulingyangService.updateById(chongwulingyang);
        chongwulingyang = chongwulingyangService.selectView(new EntityWrapper<ChongwulingyangEntity>().eq("id", id));
        return R.ok().put("data", chongwulingyang);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwulingyangEntity chongwulingyang = chongwulingyangService.selectById(id);
		chongwulingyangService.updateById(chongwulingyang);
        chongwulingyang = chongwulingyangService.selectView(new EntityWrapper<ChongwulingyangEntity>().eq("id", id));
        return R.ok().put("data", chongwulingyang);
    }
    


    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwulingyangEntity chongwulingyang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwulingyang);
        chongwulingyangService.insert(chongwulingyang);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwulingyangEntity chongwulingyang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwulingyang);
        chongwulingyangService.insert(chongwulingyang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwulingyangEntity chongwulingyang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwulingyang);
        chongwulingyangService.updateById(chongwulingyang);//全部更新
        return R.ok();
    }


    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ChongwulingyangEntity> list = new ArrayList<ChongwulingyangEntity>();
        for(Long id : ids) {
            ChongwulingyangEntity chongwulingyang = chongwulingyangService.selectById(id);
            chongwulingyang.setSfsh(sfsh);
            chongwulingyang.setShhf(shhf);
            chongwulingyang.setShifoulingyang("是");
            list.add(chongwulingyang);


            if("是".equals(sfsh)) {
                Map<String, Object> params = new HashMap<>();
                params.put("chongwumingcheng", chongwulingyang.getChongwumingcheng());
                params.put("shangjiazhanghao", chongwulingyang.getShangjiazhanghao());

                List<ChongwuxinxiEntity> chongwuxinxiList = chongwuxinxiService.selectByMap(params);
                if(chongwuxinxiList != null && !chongwuxinxiList.isEmpty()) {
                    ChongwuxinxiEntity chongwuxinxi = chongwuxinxiList.get(0);
                    chongwuxinxi.setShifoulingyang("是");
                    chongwuxinxiService.updateById(chongwuxinxi);
                }
            }
        }
        chongwulingyangService.updateBatchById(list);
        return R.ok();
    }



    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwulingyangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ChongwulingyangEntity chongwulingyang, HttpServletRequest request,String pre){
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
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
		PageUtils page = chongwulingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwulingyang), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（基于用户收藏的协同算法）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ChongwulingyangEntity chongwulingyang, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("tablename", "chongwulingyang"));
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

        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
        ew.in("id", String.join(",", recommendations));
        if(recommendations!=null && recommendations.size()>0) {
            ew.last("order by FIELD(id, "+"'"+String.join("','", recommendations)+"'"+")");
        }

        PageUtils page = chongwulingyangService.queryPage(params, ew);
        List<ChongwulingyangEntity> pageList = (List<ChongwulingyangEntity>)page.getList();
        if(pageList.size()<limit) {
            int toAddNum = limit-pageList.size();
            ew = new EntityWrapper<ChongwulingyangEntity>();
            ew.notIn("id", recommendations);
            ew.orderBy("id", false);
            ew.last("limit "+toAddNum);
            pageList.addAll(chongwulingyangService.selectList(ew));
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
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
        List<Map<String, Object>> result = chongwulingyangService.selectValue(params, ew);
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
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = chongwulingyangService.selectValue(params, ew);
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
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
        List<Map<String, Object>> result = chongwulingyangService.selectTimeStatValue(params, ew);
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
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = chongwulingyangService.selectTimeStatValue(params, ew);
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
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
        List<Map<String, Object>> result = chongwulingyangService.selectGroup(params, ew);
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
    public R count(@RequestParam Map<String, Object> params,ChongwulingyangEntity chongwulingyang, HttpServletRequest request){
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
        int count = chongwulingyangService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwulingyang), params), params));
        return R.ok().put("data", count);
    }



}
