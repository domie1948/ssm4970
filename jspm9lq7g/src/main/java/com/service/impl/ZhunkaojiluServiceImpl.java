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


import com.dao.ZhunkaojiluDao;
import com.entity.ZhunkaojiluEntity;
import com.service.ZhunkaojiluService;
import com.entity.vo.ZhunkaojiluVO;
import com.entity.view.ZhunkaojiluView;

@Service("zhunkaojiluService")
public class ZhunkaojiluServiceImpl extends ServiceImpl<ZhunkaojiluDao, ZhunkaojiluEntity> implements ZhunkaojiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhunkaojiluEntity> page = this.selectPage(
                new Query<ZhunkaojiluEntity>(params).getPage(),
                new EntityWrapper<ZhunkaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhunkaojiluEntity> wrapper) {
		  Page<ZhunkaojiluView> page =new Query<ZhunkaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhunkaojiluVO> selectListVO(Wrapper<ZhunkaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhunkaojiluVO selectVO(Wrapper<ZhunkaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhunkaojiluView> selectListView(Wrapper<ZhunkaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhunkaojiluView selectView(Wrapper<ZhunkaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
