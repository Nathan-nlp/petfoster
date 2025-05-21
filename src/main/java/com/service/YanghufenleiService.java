package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YanghufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YanghufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YanghufenleiView;


/**
 * 养护分类
 *
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public interface YanghufenleiService extends IService<YanghufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YanghufenleiVO> selectListVO(Wrapper<YanghufenleiEntity> wrapper);
   	
   	YanghufenleiVO selectVO(@Param("ew") Wrapper<YanghufenleiEntity> wrapper);
   	
   	List<YanghufenleiView> selectListView(Wrapper<YanghufenleiEntity> wrapper);
   	
   	YanghufenleiView selectView(@Param("ew") Wrapper<YanghufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YanghufenleiEntity> wrapper);

   	

}

