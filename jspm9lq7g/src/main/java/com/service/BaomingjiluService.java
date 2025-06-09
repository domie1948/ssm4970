package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaomingjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaomingjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaomingjiluView;


/**
 * 报名记录
 *
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public interface BaomingjiluService extends IService<BaomingjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaomingjiluVO> selectListVO(Wrapper<BaomingjiluEntity> wrapper);
   	
   	BaomingjiluVO selectVO(@Param("ew") Wrapper<BaomingjiluEntity> wrapper);
   	
   	List<BaomingjiluView> selectListView(Wrapper<BaomingjiluEntity> wrapper);
   	
   	BaomingjiluView selectView(@Param("ew") Wrapper<BaomingjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaomingjiluEntity> wrapper);
   	
}

