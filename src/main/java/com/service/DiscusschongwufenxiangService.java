package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwufenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwufenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwufenxiangView;


/**
 * 宠物分享评论表
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
public interface DiscusschongwufenxiangService extends IService<DiscusschongwufenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwufenxiangVO> selectListVO(Wrapper<DiscusschongwufenxiangEntity> wrapper);
   	
   	DiscusschongwufenxiangVO selectVO(@Param("ew") Wrapper<DiscusschongwufenxiangEntity> wrapper);
   	
   	List<DiscusschongwufenxiangView> selectListView(Wrapper<DiscusschongwufenxiangEntity> wrapper);
   	
   	DiscusschongwufenxiangView selectView(@Param("ew") Wrapper<DiscusschongwufenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwufenxiangEntity> wrapper);

   	

}

