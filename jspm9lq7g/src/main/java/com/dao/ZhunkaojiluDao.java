package com.dao;

import com.entity.ZhunkaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhunkaojiluVO;
import com.entity.view.ZhunkaojiluView;


/**
 * 准考记录
 * 
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public interface ZhunkaojiluDao extends BaseMapper<ZhunkaojiluEntity> {
	
	List<ZhunkaojiluVO> selectListVO(@Param("ew") Wrapper<ZhunkaojiluEntity> wrapper);
	
	ZhunkaojiluVO selectVO(@Param("ew") Wrapper<ZhunkaojiluEntity> wrapper);
	
	List<ZhunkaojiluView> selectListView(@Param("ew") Wrapper<ZhunkaojiluEntity> wrapper);

	List<ZhunkaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<ZhunkaojiluEntity> wrapper);
	
	ZhunkaojiluView selectView(@Param("ew") Wrapper<ZhunkaojiluEntity> wrapper);
	
}
