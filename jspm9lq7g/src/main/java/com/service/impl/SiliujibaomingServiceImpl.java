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


import com.dao.SiliujibaomingDao;
import com.entity.SiliujibaomingEntity;
import com.service.SiliujibaomingService;
import com.entity.vo.SiliujibaomingVO;
import com.entity.view.SiliujibaomingView;

@Service("siliujibaomingService")
public class SiliujibaomingServiceImpl extends ServiceImpl<SiliujibaomingDao, SiliujibaomingEntity> implements SiliujibaomingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SiliujibaomingEntity> page = this.selectPage(
                new Query<SiliujibaomingEntity>(params).getPage(),
                new EntityWrapper<SiliujibaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SiliujibaomingEntity> wrapper) {
		  Page<SiliujibaomingView> page =new Query<SiliujibaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SiliujibaomingVO> selectListVO(Wrapper<SiliujibaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SiliujibaomingVO selectVO(Wrapper<SiliujibaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SiliujibaomingView> selectListView(Wrapper<SiliujibaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SiliujibaomingView selectView(Wrapper<SiliujibaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
