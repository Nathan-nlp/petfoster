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


import com.dao.ChongwufenxiangDao;
import com.entity.ChongwufenxiangEntity;
import com.service.ChongwufenxiangService;
import com.entity.vo.ChongwufenxiangVO;
import com.entity.view.ChongwufenxiangView;

@Service("chongwufenxiangService")
public class ChongwufenxiangServiceImpl extends ServiceImpl<ChongwufenxiangDao, ChongwufenxiangEntity> implements ChongwufenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwufenxiangEntity> page = this.selectPage(
                new Query<ChongwufenxiangEntity>(params).getPage(),
                new EntityWrapper<ChongwufenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwufenxiangEntity> wrapper) {
		  Page<ChongwufenxiangView> page =new Query<ChongwufenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongwufenxiangVO> selectListVO(Wrapper<ChongwufenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwufenxiangVO selectVO(Wrapper<ChongwufenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwufenxiangView> selectListView(Wrapper<ChongwufenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwufenxiangView selectView(Wrapper<ChongwufenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ChongwufenxiangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ChongwufenxiangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ChongwufenxiangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
