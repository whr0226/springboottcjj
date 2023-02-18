package com.entity.vo;

import com.entity.JiajiaopingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 家教评价
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
public class JiajiaopingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教学方法
	 */
	
	private String jiaoxuefangfa;
		
	/**
	 * 教学态度
	 */
	
	private String jiaoxuetaidu;
		
	/**
	 * 是否满意
	 */
	
	private String shifoumanyi;
		
	/**
	 * 评价详情
	 */
	
	private String pingjiaxiangqing;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：教学方法
	 */
	 
	public void setJiaoxuefangfa(String jiaoxuefangfa) {
		this.jiaoxuefangfa = jiaoxuefangfa;
	}
	
	/**
	 * 获取：教学方法
	 */
	public String getJiaoxuefangfa() {
		return jiaoxuefangfa;
	}
				
	
	/**
	 * 设置：教学态度
	 */
	 
	public void setJiaoxuetaidu(String jiaoxuetaidu) {
		this.jiaoxuetaidu = jiaoxuetaidu;
	}
	
	/**
	 * 获取：教学态度
	 */
	public String getJiaoxuetaidu() {
		return jiaoxuetaidu;
	}
				
	
	/**
	 * 设置：是否满意
	 */
	 
	public void setShifoumanyi(String shifoumanyi) {
		this.shifoumanyi = shifoumanyi;
	}
	
	/**
	 * 获取：是否满意
	 */
	public String getShifoumanyi() {
		return shifoumanyi;
	}
				
	
	/**
	 * 设置：评价详情
	 */
	 
	public void setPingjiaxiangqing(String pingjiaxiangqing) {
		this.pingjiaxiangqing = pingjiaxiangqing;
	}
	
	/**
	 * 获取：评价详情
	 */
	public String getPingjiaxiangqing() {
		return pingjiaxiangqing;
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
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
