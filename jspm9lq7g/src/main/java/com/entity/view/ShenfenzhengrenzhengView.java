package com.entity.view;

import com.entity.ShenfenzhengrenzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 身份证认证
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
@TableName("shenfenzhengrenzheng")
public class ShenfenzhengrenzhengView  extends ShenfenzhengrenzhengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenfenzhengrenzhengView(){
	}
 
 	public ShenfenzhengrenzhengView(ShenfenzhengrenzhengEntity shenfenzhengrenzhengEntity){
 	try {
			BeanUtils.copyProperties(this, shenfenzhengrenzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
