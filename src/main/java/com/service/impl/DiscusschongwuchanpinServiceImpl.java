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


import com.dao.DiscusschongwuchanpinDao;
import com.entity.DiscusschongwuchanpinEntity;
import com.service.DiscusschongwuchanpinService;
import com.entity.vo.DiscusschongwuchanpinVO;
import com.entity.view.DiscusschongwuchanpinView;

@Service("discusschongwuchanpinService")
public class DiscusschongwuchanpinServiceImpl extends ServiceImpl<DiscusschongwuchanpinDao, DiscusschongwuchanpinEntity> implements DiscusschongwuchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwuchanpinEntity> page = this.selectPage(
                new Query<DiscusschongwuchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwuchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwuchanpinEntity> wrapper) {
		  Page<DiscusschongwuchanpinView> page =new Query<DiscusschongwuchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusschongwuchanpinVO> selectListVO(Wrapper<DiscusschongwuchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwuchanpinVO selectVO(Wrapper<DiscusschongwuchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwuchanpinView> selectListView(Wrapper<DiscusschongwuchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwuchanpinView selectView(Wrapper<DiscusschongwuchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
