package com.entity.view;

import com.entity.JiajiaopingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家教评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
@TableName("jiajiaopingjia")
public class JiajiaopingjiaView  extends JiajiaopingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiajiaopingjiaView(){
	}
 
 	public JiajiaopingjiaView(JiajiaopingjiaEntity jiajiaopingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, jiajiaopingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
