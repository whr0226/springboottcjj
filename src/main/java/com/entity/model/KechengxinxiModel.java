package com.entity.model;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课程信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
public class KechengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程图片
	 */
	
	private String kechengtupian;
		
	/**
	 * 课程类别
	 */
	
	private String kechengleibie;
		
	/**
	 * 上课时间
	 */
	
	private String shangkeshijian;
		
	/**
	 * 课时价格
	 */
	
	private Integer keshijiage;
		
	/**
	 * 工作状态
	 */
	
	private String gongzuozhuangtai;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 学历
	 */
	
	private String xueli;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
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
	 * 设置：课程类别
	 */
	 
	public void setKechengleibie(String kechengleibie) {
		this.kechengleibie = kechengleibie;
	}
	
	/**
	 * 获取：课程类别
	 */
	public String getKechengleibie() {
		return kechengleibie;
	}
				
	
	/**
	 * 设置：上课时间
	 */
	 
	public void setShangkeshijian(String shangkeshijian) {
		this.shangkeshijian = shangkeshijian;
	}
	
	/**
	 * 获取：上课时间
	 */
	public String getShangkeshijian() {
		return shangkeshijian;
	}
				
	
	/**
	 * 设置：课时价格
	 */
	 
	public void setKeshijiage(Integer keshijiage) {
		this.keshijiage = keshijiage;
	}
	
	/**
	 * 获取：课时价格
	 */
	public Integer getKeshijiage() {
		return keshijiage;
	}
				
	
	/**
	 * 设置：工作状态
	 */
	 
	public void setGongzuozhuangtai(String gongzuozhuangtai) {
		this.gongzuozhuangtai = gongzuozhuangtai;
	}
	
	/**
	 * 获取：工作状态
	 */
	public String getGongzuozhuangtai() {
		return gongzuozhuangtai;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：学历
	 */
	 
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}
