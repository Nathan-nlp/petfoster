package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusschongwufenxiangDao;
import com.entity.DiscusschongwufenxiangEntity;
import com.service.DiscusschongwufenxiangService;
import com.entity.vo.DiscusschongwufenxiangVO;
import com.entity.view.DiscusschongwufenxiangView;

@Service("discusschongwufenxiangService")
public class DiscusschongwufenxiangServiceImpl extends ServiceImpl<DiscusschongwufenxiangDao, DiscusschongwufenxiangEntity> implements DiscusschongwufenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwufenxiangEntity> page = this.selectPage(
                new Query<DiscusschongwufenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwufenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwufenxiangEntity> wrapper) {
		  Page<DiscusschongwufenxiangView> page =new Query<DiscusschongwufenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusschongwufenxiangVO> selectListVO(Wrapper<DiscusschongwufenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwufenxiangVO selectVO(Wrapper<DiscusschongwufenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwufenxiangView> selectListView(Wrapper<DiscusschongwufenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwufenxiangView selectView(Wrapper<DiscusschongwufenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
