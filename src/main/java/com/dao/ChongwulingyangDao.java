package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ChongwulingyangEntity;
import com.entity.view.ChongwulingyangView;
import com.entity.vo.ChongwulingyangVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 宠物领养
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public interface ChongwulingyangDao extends BaseMapper<ChongwulingyangEntity> {
	
	List<ChongwulingyangVO> selectListVO(@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);
	
	ChongwulingyangVO selectVO(@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);
	
	List<ChongwulingyangView> selectListView(@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);

	List<ChongwulingyangView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);

	
	ChongwulingyangView selectView(@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);



}
