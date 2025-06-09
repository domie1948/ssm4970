package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 四六级报名
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
@TableName("siliujibaoming")
public class SiliujibaomingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SiliujibaomingEntity() {
		
	}
	
	public SiliujibaomingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 考试编号
	 */
					
	private String kaoshibianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：考试编号
	 */
	public void setKaoshibianhao(String kaoshibianhao) {
		this.kaoshibianhao = kaoshibianhao;
	}
	/**
	 * 获取：考试编号
	 */
	public String getKaoshibianhao() {
		return kaoshibianhao;
	}
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
