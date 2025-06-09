package com.dao;

import com.entity.SiliujibaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SiliujibaomingVO;
import com.entity.view.SiliujibaomingView;


/**
 * 四六级报名
 * 
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public interface SiliujibaomingDao extends BaseMapper<SiliujibaomingEntity> {
	
	List<SiliujibaomingVO> selectListVO(@Param("ew") Wrapper<SiliujibaomingEntity> wrapper);
	
	SiliujibaomingVO selectVO(@Param("ew") Wrapper<SiliujibaomingEntity> wrapper);
	
	List<SiliujibaomingView> selectListView(@Param("ew") Wrapper<SiliujibaomingEntity> wrapper);

	List<SiliujibaomingView> selectListView(Pagination page,@Param("ew") Wrapper<SiliujibaomingEntity> wrapper);
	
	SiliujibaomingView selectView(@Param("ew") Wrapper<SiliujibaomingEntity> wrapper);
	
}
