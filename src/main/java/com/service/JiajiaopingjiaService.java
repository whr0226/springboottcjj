package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiajiaopingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiajiaopingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajiaopingjiaView;


/**
 * 家教评价
 *
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
public interface JiajiaopingjiaService extends IService<JiajiaopingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiajiaopingjiaVO> selectListVO(Wrapper<JiajiaopingjiaEntity> wrapper);
   	
   	JiajiaopingjiaVO selectVO(@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);
   	
   	List<JiajiaopingjiaView> selectListView(Wrapper<JiajiaopingjiaEntity> wrapper);
   	
   	JiajiaopingjiaView selectView(@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiajiaopingjiaEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiajiaopingjiaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiajiaopingjiaEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiajiaopingjiaEntity> wrapper);



}

