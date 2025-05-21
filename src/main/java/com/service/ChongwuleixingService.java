package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuleixingView;


/**
 * 宠物类型
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public interface ChongwuleixingService extends IService<ChongwuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuleixingVO> selectListVO(Wrapper<ChongwuleixingEntity> wrapper);
   	
   	ChongwuleixingVO selectVO(@Param("ew") Wrapper<ChongwuleixingEntity> wrapper);
   	
   	List<ChongwuleixingView> selectListView(Wrapper<ChongwuleixingEntity> wrapper);
   	
   	ChongwuleixingView selectView(@Param("ew") Wrapper<ChongwuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuleixingEntity> wrapper);

   	

}

