package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuxinxiView;


/**
 * 宠物信息
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public interface ChongwuxinxiService extends IService<ChongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuxinxiVO> selectListVO(Wrapper<ChongwuxinxiEntity> wrapper);
   	
   	ChongwuxinxiVO selectVO(@Param("ew") Wrapper<ChongwuxinxiEntity> wrapper);
   	
   	List<ChongwuxinxiView> selectListView(Wrapper<ChongwuxinxiEntity> wrapper);
   	
   	ChongwuxinxiView selectView(@Param("ew") Wrapper<ChongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuxinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChongwuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChongwuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChongwuxinxiEntity> wrapper);



}

