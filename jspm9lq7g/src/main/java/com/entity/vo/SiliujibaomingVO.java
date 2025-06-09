package com.entity.vo;

import com.entity.SiliujibaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 四六级报名
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
public class SiliujibaomingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 类别
	 */
	
	private String leibie;
		
	/**
	 * 考试时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoshishijian;
		
	/**
	 * 考试地点
	 */
	
	private String kaoshididian;
		
	/**
	 * 报考价格
	 */
	
	private Integer baokaojiage;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 项目说明
	 */
	
	private String xiangmushuoming;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：类别
	 */
	 
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
				
	
	/**
	 * 设置：考试时间
	 */
	 
	public void setKaoshishijian(Date kaoshishijian) {
		this.kaoshishijian = kaoshishijian;
	}
	
	/**
	 * 获取：考试时间
	 */
	public Date getKaoshishijian() {
		return kaoshishijian;
	}
				
	
	/**
	 * 设置：考试地点
	 */
	 
	public void setKaoshididian(String kaoshididian) {
		this.kaoshididian = kaoshididian;
	}
	
	/**
	 * 获取：考试地点
	 */
	public String getKaoshididian() {
		return kaoshididian;
	}
				
	
	/**
	 * 设置：报考价格
	 */
	 
	public void setBaokaojiage(Integer baokaojiage) {
		this.baokaojiage = baokaojiage;
	}
	
	/**
	 * 获取：报考价格
	 */
	public Integer getBaokaojiage() {
		return baokaojiage;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：项目说明
	 */
	 
	public void setXiangmushuoming(String xiangmushuoming) {
		this.xiangmushuoming = xiangmushuoming;
	}
	
	/**
	 * 获取：项目说明
	 */
	public String getXiangmushuoming() {
		return xiangmushuoming;
	}
			
}
