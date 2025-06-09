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


import com.dao.ShenfenzhengrenzhengDao;
import com.entity.ShenfenzhengrenzhengEntity;
import com.service.ShenfenzhengrenzhengService;
import com.entity.vo.ShenfenzhengrenzhengVO;
import com.entity.view.ShenfenzhengrenzhengView;

@Service("shenfenzhengrenzhengService")
public class ShenfenzhengrenzhengServiceImpl extends ServiceImpl<ShenfenzhengrenzhengDao, ShenfenzhengrenzhengEntity> implements ShenfenzhengrenzhengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenfenzhengrenzhengEntity> page = this.selectPage(
                new Query<ShenfenzhengrenzhengEntity>(params).getPage(),
                new EntityWrapper<ShenfenzhengrenzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenfenzhengrenzhengEntity> wrapper) {
		  Page<ShenfenzhengrenzhengView> page =new Query<ShenfenzhengrenzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenfenzhengrenzhengVO> selectListVO(Wrapper<ShenfenzhengrenzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenfenzhengrenzhengVO selectVO(Wrapper<ShenfenzhengrenzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenfenzhengrenzhengView> selectListView(Wrapper<ShenfenzhengrenzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenfenzhengrenzhengView selectView(Wrapper<ShenfenzhengrenzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
