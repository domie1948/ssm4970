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


import com.dao.BaomingjiluDao;
import com.entity.BaomingjiluEntity;
import com.service.BaomingjiluService;
import com.entity.vo.BaomingjiluVO;
import com.entity.view.BaomingjiluView;

@Service("baomingjiluService")
public class BaomingjiluServiceImpl extends ServiceImpl<BaomingjiluDao, BaomingjiluEntity> implements BaomingjiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaomingjiluEntity> page = this.selectPage(
                new Query<BaomingjiluEntity>(params).getPage(),
                new EntityWrapper<BaomingjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaomingjiluEntity> wrapper) {
		  Page<BaomingjiluView> page =new Query<BaomingjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaomingjiluVO> selectListVO(Wrapper<BaomingjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaomingjiluVO selectVO(Wrapper<BaomingjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaomingjiluView> selectListView(Wrapper<BaomingjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaomingjiluView selectView(Wrapper<BaomingjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
