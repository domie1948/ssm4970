package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SiliujibaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SiliujibaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SiliujibaomingView;


/**
 * 四六级报名
 *
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public interface SiliujibaomingService extends IService<SiliujibaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SiliujibaomingVO> selectListVO(Wrapper<SiliujibaomingEntity> wrapper);
   	
   	SiliujibaomingVO selectVO(@Param("ew") Wrapper<SiliujibaomingEntity> wrapper);
   	
   	List<SiliujibaomingView> selectListView(Wrapper<SiliujibaomingEntity> wrapper);
   	
   	SiliujibaomingView selectView(@Param("ew") Wrapper<SiliujibaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SiliujibaomingEntity> wrapper);
   	
}

