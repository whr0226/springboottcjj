package com.entity.view;

import com.entity.KechengdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
@TableName("kechengdingdan")
public class KechengdingdanView  extends KechengdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengdingdanView(){
	}
 
 	public KechengdingdanView(KechengdingdanEntity kechengdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, kechengdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
