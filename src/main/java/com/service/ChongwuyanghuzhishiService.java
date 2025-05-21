package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuyanghuzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuyanghuzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuyanghuzhishiView;


/**
 * 宠物养护知识
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public interface ChongwuyanghuzhishiService extends IService<ChongwuyanghuzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuyanghuzhishiVO> selectListVO(Wrapper<ChongwuyanghuzhishiEntity> wrapper);
   	
   	ChongwuyanghuzhishiVO selectVO(@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);
   	
   	List<ChongwuyanghuzhishiView> selectListView(Wrapper<ChongwuyanghuzhishiEntity> wrapper);
   	
   	ChongwuyanghuzhishiView selectView(@Param("ew") Wrapper<ChongwuyanghuzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuyanghuzhishiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChongwuyanghuzhishiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChongwuyanghuzhishiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChongwuyanghuzhishiEntity> wrapper);



}

