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


import com.dao.DiscusschongwuyanghuzhishiDao;
import com.entity.DiscusschongwuyanghuzhishiEntity;
import com.service.DiscusschongwuyanghuzhishiService;
import com.entity.vo.DiscusschongwuyanghuzhishiVO;
import com.entity.view.DiscusschongwuyanghuzhishiView;

@Service("discusschongwuyanghuzhishiService")
public class DiscusschongwuyanghuzhishiServiceImpl extends ServiceImpl<DiscusschongwuyanghuzhishiDao, DiscusschongwuyanghuzhishiEntity> implements DiscusschongwuyanghuzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwuyanghuzhishiEntity> page = this.selectPage(
                new Query<DiscusschongwuyanghuzhishiEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwuyanghuzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper) {
		  Page<DiscusschongwuyanghuzhishiView> page =new Query<DiscusschongwuyanghuzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusschongwuyanghuzhishiVO> selectListVO(Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwuyanghuzhishiVO selectVO(Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwuyanghuzhishiView> selectListView(Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwuyanghuzhishiView selectView(Wrapper<DiscusschongwuyanghuzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
