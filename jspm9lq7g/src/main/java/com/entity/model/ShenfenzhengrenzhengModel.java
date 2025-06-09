package com.entity.model;

import com.entity.ShenfenzhengrenzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 身份证认证
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public class ShenfenzhengrenzhengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 身份证正面照
	 */
	
	private String shenfenzhengzhengmianzhao;
		
	/**
	 * 身份证背面照
	 */
	
	private String shenfenzhengbeimianzhao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：身份证正面照
	 */
	 
	public void setShenfenzhengzhengmianzhao(String shenfenzhengzhengmianzhao) {
		this.shenfenzhengzhengmianzhao = shenfenzhengzhengmianzhao;
	}
	
	/**
	 * 获取：身份证正面照
	 */
	public String getShenfenzhengzhengmianzhao() {
		return shenfenzhengzhengmianzhao;
	}
				
	
	/**
	 * 设置：身份证背面照
	 */
	 
	public void setShenfenzhengbeimianzhao(String shenfenzhengbeimianzhao) {
		this.shenfenzhengbeimianzhao = shenfenzhengbeimianzhao;
	}
	
	/**
	 * 获取：身份证背面照
	 */
	public String getShenfenzhengbeimianzhao() {
		return shenfenzhengbeimianzhao;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
