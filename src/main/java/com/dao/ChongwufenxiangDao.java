package com.dao;

import com.entity.ChongwufenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwufenxiangVO;
import com.entity.view.ChongwufenxiangView;


/**
 * 宠物分享
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public interface ChongwufenxiangDao extends BaseMapper<ChongwufenxiangEntity> {
	
	List<ChongwufenxiangVO> selectListVO(@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);
	
	ChongwufenxiangVO selectVO(@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);
	
	List<ChongwufenxiangView> selectListView(@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);

	List<ChongwufenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);

	
	ChongwufenxiangView selectView(@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChongwufenxiangEntity> wrapper);



}
