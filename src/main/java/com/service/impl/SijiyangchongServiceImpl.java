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


import com.dao.SijiyangchongDao;
import com.entity.SijiyangchongEntity;
import com.service.SijiyangchongService;
import com.entity.vo.SijiyangchongVO;
import com.entity.view.SijiyangchongView;

@Service("sijiyangchongService")
public class SijiyangchongServiceImpl extends ServiceImpl<SijiyangchongDao, SijiyangchongEntity> implements SijiyangchongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SijiyangchongEntity> page = this.selectPage(
                new Query<SijiyangchongEntity>(params).getPage(),
                new EntityWrapper<SijiyangchongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SijiyangchongEntity> wrapper) {
		  Page<SijiyangchongView> page =new Query<SijiyangchongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<SijiyangchongVO> selectListVO(Wrapper<SijiyangchongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SijiyangchongVO selectVO(Wrapper<SijiyangchongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SijiyangchongView> selectListView(Wrapper<SijiyangchongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SijiyangchongView selectView(Wrapper<SijiyangchongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
