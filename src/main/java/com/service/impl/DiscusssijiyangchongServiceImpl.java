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


import com.dao.DiscusssijiyangchongDao;
import com.entity.DiscusssijiyangchongEntity;
import com.service.DiscusssijiyangchongService;
import com.entity.vo.DiscusssijiyangchongVO;
import com.entity.view.DiscusssijiyangchongView;

@Service("discusssijiyangchongService")
public class DiscusssijiyangchongServiceImpl extends ServiceImpl<DiscusssijiyangchongDao, DiscusssijiyangchongEntity> implements DiscusssijiyangchongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssijiyangchongEntity> page = this.selectPage(
                new Query<DiscusssijiyangchongEntity>(params).getPage(),
                new EntityWrapper<DiscusssijiyangchongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssijiyangchongEntity> wrapper) {
		  Page<DiscusssijiyangchongView> page =new Query<DiscusssijiyangchongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusssijiyangchongVO> selectListVO(Wrapper<DiscusssijiyangchongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssijiyangchongVO selectVO(Wrapper<DiscusssijiyangchongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssijiyangchongView> selectListView(Wrapper<DiscusssijiyangchongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssijiyangchongView selectView(Wrapper<DiscusssijiyangchongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
