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


import com.dao.ChongwuyanghuzhishiDao;
import com.entity.ChongwuyanghuzhishiEntity;
import com.service.ChongwuyanghuzhishiService;
import com.entity.vo.ChongwuyanghuzhishiVO;
import com.entity.view.ChongwuyanghuzhishiView;

@Service("chongwuyanghuzhishiService")
public class ChongwuyanghuzhishiServiceImpl extends ServiceImpl<ChongwuyanghuzhishiDao, ChongwuyanghuzhishiEntity> implements ChongwuyanghuzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuyanghuzhishiEntity> page = this.selectPage(
                new Query<ChongwuyanghuzhishiEntity>(params).getPage(),
                new EntityWrapper<ChongwuyanghuzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuyanghuzhishiEntity> wrapper) {
		  Page<ChongwuyanghuzhishiView> page =new Query<ChongwuyanghuzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongwuyanghuzhishiVO> selectListVO(Wrapper<ChongwuyanghuzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuyanghuzhishiVO selectVO(Wrapper<ChongwuyanghuzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuyanghuzhishiView> selectListView(Wrapper<ChongwuyanghuzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuyanghuzhishiView selectView(Wrapper<ChongwuyanghuzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ChongwuyanghuzhishiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ChongwuyanghuzhishiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ChongwuyanghuzhishiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
