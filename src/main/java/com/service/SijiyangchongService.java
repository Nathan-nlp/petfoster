package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SijiyangchongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SijiyangchongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SijiyangchongView;


/**
 * 四季养宠
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:24
 */
public interface SijiyangchongService extends IService<SijiyangchongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SijiyangchongVO> selectListVO(Wrapper<SijiyangchongEntity> wrapper);
   	
   	SijiyangchongVO selectVO(@Param("ew") Wrapper<SijiyangchongEntity> wrapper);
   	
   	List<SijiyangchongView> selectListView(Wrapper<SijiyangchongEntity> wrapper);
   	
   	SijiyangchongView selectView(@Param("ew") Wrapper<SijiyangchongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SijiyangchongEntity> wrapper);

   	

}

