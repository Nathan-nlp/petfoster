package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuchanpinView;


/**
 * 宠物产品
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:24
 */
public interface ChongwuchanpinService extends IService<ChongwuchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuchanpinVO> selectListVO(Wrapper<ChongwuchanpinEntity> wrapper);
   	
   	ChongwuchanpinVO selectVO(@Param("ew") Wrapper<ChongwuchanpinEntity> wrapper);
   	
   	List<ChongwuchanpinView> selectListView(Wrapper<ChongwuchanpinEntity> wrapper);
   	
   	ChongwuchanpinView selectView(@Param("ew") Wrapper<ChongwuchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuchanpinEntity> wrapper);

   	

}

