package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhunkaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhunkaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhunkaojiluView;


/**
 * 准考记录
 *
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public interface ZhunkaojiluService extends IService<ZhunkaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhunkaojiluVO> selectListVO(Wrapper<ZhunkaojiluEntity> wrapper);
   	
   	ZhunkaojiluVO selectVO(@Param("ew") Wrapper<ZhunkaojiluEntity> wrapper);
   	
   	List<ZhunkaojiluView> selectListView(Wrapper<ZhunkaojiluEntity> wrapper);
   	
   	ZhunkaojiluView selectView(@Param("ew") Wrapper<ZhunkaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhunkaojiluEntity> wrapper);
   	
}

