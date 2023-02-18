package com.entity.model;

import com.entity.JiajiaozhaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 家教招聘
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-18 18:33:56
 */
public class JiajiaozhaopinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程图片
	 */
	
	private String kechengtupian;
		
	/**
	 * 学历要求
	 */
	
	private String xueliyaoqiu;
		
	/**
	 * 专业要求
	 */
	
	private String zhuanyeyaoqiu;
		
	/**
	 * 辅导需求
	 */
	
	private String fudaoxuqiu;
		
	/**
	 * 辅导价格
	 */
	
	private Integer fudaojiage;
		
	/**
	 * 辅导时间
	 */
	
	private String fudaoshijian;
		
	/**
	 * 招聘详情
	 */
	
	private String zhaopinxiangqing;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：课程图片
	 */
	 
	public void setKechengtupian(String kechengtupian) {
		this.kechengtupian = kechengtupian;
	}
	
	/**
	 * 获取：课程图片
	 */
	public String getKechengtupian() {
		return kechengtupian;
	}
				
	
	/**
	 * 设置：学历要求
	 */
	 
	public void setXueliyaoqiu(String xueliyaoqiu) {
		this.xueliyaoqiu = xueliyaoqiu;
	}
	
	/**
	 * 获取：学历要求
	 */
	public String getXueliyaoqiu() {
		return xueliyaoqiu;
	}
				
	
	/**
	 * 设置：专业要求
	 */
	 
	public void setZhuanyeyaoqiu(String zhuanyeyaoqiu) {
		this.zhuanyeyaoqiu = zhuanyeyaoqiu;
	}
	
	/**
	 * 获取：专业要求
	 */
	public String getZhuanyeyaoqiu() {
		return zhuanyeyaoqiu;
	}
				
	
	/**
	 * 设置：辅导需求
	 */
	 
	public void setFudaoxuqiu(String fudaoxuqiu) {
		this.fudaoxuqiu = fudaoxuqiu;
	}
	
	/**
	 * 获取：辅导需求
	 */
	public String getFudaoxuqiu() {
		return fudaoxuqiu;
	}
				
	
	/**
	 * 设置：辅导价格
	 */
	 
	public void setFudaojiage(Integer fudaojiage) {
		this.fudaojiage = fudaojiage;
	}
	
	/**
	 * 获取：辅导价格
	 */
	public Integer getFudaojiage() {
		return fudaojiage;
	}
				
	
	/**
	 * 设置：辅导时间
	 */
	 
	public void setFudaoshijian(String fudaoshijian) {
		this.fudaoshijian = fudaoshijian;
	}
	
	/**
	 * 获取：辅导时间
	 */
	public String getFudaoshijian() {
		return fudaoshijian;
	}
				
	
	/**
	 * 设置：招聘详情
	 */
	 
	public void setZhaopinxiangqing(String zhaopinxiangqing) {
		this.zhaopinxiangqing = zhaopinxiangqing;
	}
	
	/**
	 * 获取：招聘详情
	 */
	public String getZhaopinxiangqing() {
		return zhaopinxiangqing;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
