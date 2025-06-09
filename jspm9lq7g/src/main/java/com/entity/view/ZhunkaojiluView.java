package com.entity.view;

import com.entity.ZhunkaojiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 准考记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
@TableName("zhunkaojilu")
public class ZhunkaojiluView  extends ZhunkaojiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhunkaojiluView(){
	}
 
 	public ZhunkaojiluView(ZhunkaojiluEntity zhunkaojiluEntity){
 	try {
			BeanUtils.copyProperties(this, zhunkaojiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
