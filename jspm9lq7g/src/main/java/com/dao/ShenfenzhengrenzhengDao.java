package com.dao;

import com.entity.ShenfenzhengrenzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenfenzhengrenzhengVO;
import com.entity.view.ShenfenzhengrenzhengView;


/**
 * 身份证认证
 * 
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public interface ShenfenzhengrenzhengDao extends BaseMapper<ShenfenzhengrenzhengEntity> {
	
	List<ShenfenzhengrenzhengVO> selectListVO(@Param("ew") Wrapper<ShenfenzhengrenzhengEntity> wrapper);
	
	ShenfenzhengrenzhengVO selectVO(@Param("ew") Wrapper<ShenfenzhengrenzhengEntity> wrapper);
	
	List<ShenfenzhengrenzhengView> selectListView(@Param("ew") Wrapper<ShenfenzhengrenzhengEntity> wrapper);

	List<ShenfenzhengrenzhengView> selectListView(Pagination page,@Param("ew") Wrapper<ShenfenzhengrenzhengEntity> wrapper);
	
	ShenfenzhengrenzhengView selectView(@Param("ew") Wrapper<ShenfenzhengrenzhengEntity> wrapper);
	
}
