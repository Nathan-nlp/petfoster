package com.dao;

import com.entity.YanghufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YanghufenleiVO;
import com.entity.view.YanghufenleiView;


/**
 * 养护分类
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public interface YanghufenleiDao extends BaseMapper<YanghufenleiEntity> {
	
	List<YanghufenleiVO> selectListVO(@Param("ew") Wrapper<YanghufenleiEntity> wrapper);
	
	YanghufenleiVO selectVO(@Param("ew") Wrapper<YanghufenleiEntity> wrapper);
	
	List<YanghufenleiView> selectListView(@Param("ew") Wrapper<YanghufenleiEntity> wrapper);

	List<YanghufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YanghufenleiEntity> wrapper);

	
	YanghufenleiView selectView(@Param("ew") Wrapper<YanghufenleiEntity> wrapper);
	

}
