package com.dao;

import com.entity.BaomingjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaomingjiluVO;
import com.entity.view.BaomingjiluView;


/**
 * 报名记录
 * 
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public interface BaomingjiluDao extends BaseMapper<BaomingjiluEntity> {
	
	List<BaomingjiluVO> selectListVO(@Param("ew") Wrapper<BaomingjiluEntity> wrapper);
	
	BaomingjiluVO selectVO(@Param("ew") Wrapper<BaomingjiluEntity> wrapper);
	
	List<BaomingjiluView> selectListView(@Param("ew") Wrapper<BaomingjiluEntity> wrapper);

	List<BaomingjiluView> selectListView(Pagination page,@Param("ew") Wrapper<BaomingjiluEntity> wrapper);
	
	BaomingjiluView selectView(@Param("ew") Wrapper<BaomingjiluEntity> wrapper);
	
}
