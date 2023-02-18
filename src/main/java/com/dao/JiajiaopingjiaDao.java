package com.dao;

import com.entity.JiajiaopingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiajiaopingjiaVO;
import com.entity.view.JiajiaopingjiaView;


/**
 * 家教评价
 * 
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
public interface JiajiaopingjiaDao extends BaseMapper<JiajiaopingjiaEntity> {
	
	List<JiajiaopingjiaVO> selectListVO(@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);
	
	JiajiaopingjiaVO selectVO(@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);
	
	List<JiajiaopingjiaView> selectListView(@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);

	List<JiajiaopingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);
	
	JiajiaopingjiaView selectView(@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiajiaopingjiaEntity> wrapper);



}
