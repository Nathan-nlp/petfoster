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


import com.dao.ChongwuchanpinDao;
import com.entity.ChongwuchanpinEntity;
import com.service.ChongwuchanpinService;
import com.entity.vo.ChongwuchanpinVO;
import com.entity.view.ChongwuchanpinView;

@Service("chongwuchanpinService")
public class ChongwuchanpinServiceImpl extends ServiceImpl<ChongwuchanpinDao, ChongwuchanpinEntity> implements ChongwuchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuchanpinEntity> page = this.selectPage(
                new Query<ChongwuchanpinEntity>(params).getPage(),
                new EntityWrapper<ChongwuchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuchanpinEntity> wrapper) {
		  Page<ChongwuchanpinView> page =new Query<ChongwuchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongwuchanpinVO> selectListVO(Wrapper<ChongwuchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuchanpinVO selectVO(Wrapper<ChongwuchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuchanpinView> selectListView(Wrapper<ChongwuchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuchanpinView selectView(Wrapper<ChongwuchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
