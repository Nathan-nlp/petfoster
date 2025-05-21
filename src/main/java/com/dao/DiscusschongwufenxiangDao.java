package com.dao;

import com.entity.DiscusschongwufenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwufenxiangVO;
import com.entity.view.DiscusschongwufenxiangView;


/**
 * 宠物分享评论表
 * 
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
public interface DiscusschongwufenxiangDao extends BaseMapper<DiscusschongwufenxiangEntity> {
	
	List<DiscusschongwufenxiangVO> selectListVO(@Param("ew") Wrapper<DiscusschongwufenxiangEntity> wrapper);
	
	DiscusschongwufenxiangVO selectVO(@Param("ew") Wrapper<DiscusschongwufenxiangEntity> wrapper);
	
	List<DiscusschongwufenxiangView> selectListView(@Param("ew") Wrapper<DiscusschongwufenxiangEntity> wrapper);

	List<DiscusschongwufenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwufenxiangEntity> wrapper);

	
	DiscusschongwufenxiangView selectView(@Param("ew") Wrapper<DiscusschongwufenxiangEntity> wrapper);
	

}
