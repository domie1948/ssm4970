package com.entity.view;

import com.entity.SiliujibaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 四六级报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
@TableName("siliujibaoming")
public class SiliujibaomingView  extends SiliujibaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SiliujibaomingView(){
	}
 
 	public SiliujibaomingView(SiliujibaomingEntity siliujibaomingEntity){
 	try {
			BeanUtils.copyProperties(this, siliujibaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
