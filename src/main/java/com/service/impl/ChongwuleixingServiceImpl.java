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


import com.dao.ChongwuleixingDao;
import com.entity.ChongwuleixingEntity;
import com.service.ChongwuleixingService;
import com.entity.vo.ChongwuleixingVO;
import com.entity.view.ChongwuleixingView;

@Service("chongwuleixingService")
public class ChongwuleixingServiceImpl extends ServiceImpl<ChongwuleixingDao, ChongwuleixingEntity> implements ChongwuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuleixingEntity> page = this.selectPage(
                new Query<ChongwuleixingEntity>(params).getPage(),
                new EntityWrapper<ChongwuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuleixingEntity> wrapper) {
		  Page<ChongwuleixingView> page =new Query<ChongwuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongwuleixingVO> selectListVO(Wrapper<ChongwuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuleixingVO selectVO(Wrapper<ChongwuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuleixingView> selectListView(Wrapper<ChongwuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuleixingView selectView(Wrapper<ChongwuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
