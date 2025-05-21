package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwuchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwuchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwuchanpinView;


/**
 * 宠物产品评论表
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
public interface DiscusschongwuchanpinService extends IService<DiscusschongwuchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwuchanpinVO> selectListVO(Wrapper<DiscusschongwuchanpinEntity> wrapper);
   	
   	DiscusschongwuchanpinVO selectVO(@Param("ew") Wrapper<DiscusschongwuchanpinEntity> wrapper);
   	
   	List<DiscusschongwuchanpinView> selectListView(Wrapper<DiscusschongwuchanpinEntity> wrapper);
   	
   	DiscusschongwuchanpinView selectView(@Param("ew") Wrapper<DiscusschongwuchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwuchanpinEntity> wrapper);

   	

}

