package com.entity.view;

import com.entity.BaomingjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报名记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
@TableName("baomingjilu")
public class BaomingjiluView  extends BaomingjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaomingjiluView(){
	}
 
 	public BaomingjiluView(BaomingjiluEntity baomingjiluEntity){
 	try {
			BeanUtils.copyProperties(this, baomingjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
