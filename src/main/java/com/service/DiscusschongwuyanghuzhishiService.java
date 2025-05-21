package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwuyanghuzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwuyanghuzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwuyanghuzhishiView;


/**
 * 宠物养护知识评论表
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
public interface DiscusschongwuyanghuzhishiService extends IService<DiscusschongwuyanghuzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwuyanghuzhishiVO> selectListVO(Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);
   	
   	DiscusschongwuyanghuzhishiVO selectVO(@Param("ew") Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);
   	
   	List<DiscusschongwuyanghuzhishiView> selectListView(Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);
   	
   	DiscusschongwuyanghuzhishiView selectView(@Param("ew") Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper);

   	

}

