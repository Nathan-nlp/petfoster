package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwufenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwufenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwufenxiangView;


/**
 * 宠物分享
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public interface ChongwufenxiangService extends IService<ChongwufenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwufenxiangVO> selectListVO(Wrapper<ChongwufenxiangEntity> wrapper);
   	
   	ChongwufenxiangVO selectVO(@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);
   	
   	List<ChongwufenxiangView> selectListView(Wrapper<ChongwufenxiangEntity> wrapper);
   	
   	ChongwufenxiangView selectView(@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwufenxiangEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChongwufenxiangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChongwufenxiangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChongwufenxiangEntity> wrapper);



}

