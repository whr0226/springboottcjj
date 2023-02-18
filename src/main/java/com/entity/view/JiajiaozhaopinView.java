package com.entity.view;

import com.entity.JiajiaozhaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家教招聘
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-18 18:33:56
 */
@TableName("jiajiaozhaopin")
public class JiajiaozhaopinView  extends JiajiaozhaopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiajiaozhaopinView(){
	}
 
 	public JiajiaozhaopinView(JiajiaozhaopinEntity jiajiaozhaopinEntity){
 	try {
			BeanUtils.copyProperties(this, jiajiaozhaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
