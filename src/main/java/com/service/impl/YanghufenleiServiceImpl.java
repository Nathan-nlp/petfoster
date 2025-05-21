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


import com.dao.YanghufenleiDao;
import com.entity.YanghufenleiEntity;
import com.service.YanghufenleiService;
import com.entity.vo.YanghufenleiVO;
import com.entity.view.YanghufenleiView;

@Service("yanghufenleiService")
public class YanghufenleiServiceImpl extends ServiceImpl<YanghufenleiDao, YanghufenleiEntity> implements YanghufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YanghufenleiEntity> page = this.selectPage(
                new Query<YanghufenleiEntity>(params).getPage(),
                new EntityWrapper<YanghufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YanghufenleiEntity> wrapper) {
		  Page<YanghufenleiView> page =new Query<YanghufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YanghufenleiVO> selectListVO(Wrapper<YanghufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YanghufenleiVO selectVO(Wrapper<YanghufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YanghufenleiView> selectListView(Wrapper<YanghufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YanghufenleiView selectView(Wrapper<YanghufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
