package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenfenzhengrenzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenfenzhengrenzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenfenzhengrenzhengView;


/**
 * 身份证认证
 *
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public interface ShenfenzhengrenzhengService extends IService<ShenfenzhengrenzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenfenzhengrenzhengVO> selectListVO(Wrapper<ShenfenzhengrenzhengEntity> wrapper);
   	
   	ShenfenzhengrenzhengVO selectVO(@Param("ew") Wrapper<ShenfenzhengrenzhengEntity> wrapper);
   	
   	List<ShenfenzhengrenzhengView> selectListView(Wrapper<ShenfenzhengrenzhengEntity> wrapper);
   	
   	ShenfenzhengrenzhengView selectView(@Param("ew") Wrapper<ShenfenzhengrenzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenfenzhengrenzhengEntity> wrapper);
   	
}

