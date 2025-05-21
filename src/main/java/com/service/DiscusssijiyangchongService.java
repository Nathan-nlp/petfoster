package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssijiyangchongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssijiyangchongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssijiyangchongView;


/**
 * 四季养宠评论表
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
public interface DiscusssijiyangchongService extends IService<DiscusssijiyangchongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssijiyangchongVO> selectListVO(Wrapper<DiscusssijiyangchongEntity> wrapper);
   	
   	DiscusssijiyangchongVO selectVO(@Param("ew") Wrapper<DiscusssijiyangchongEntity> wrapper);
   	
   	List<DiscusssijiyangchongView> selectListView(Wrapper<DiscusssijiyangchongEntity> wrapper);
   	
   	DiscusssijiyangchongView selectView(@Param("ew") Wrapper<DiscusssijiyangchongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssijiyangchongEntity> wrapper);

   	

}

