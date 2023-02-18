package com.dao;

import com.entity.KechengdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengdingdanVO;
import com.entity.view.KechengdingdanView;


/**
 * 课程订单
 * 
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
public interface KechengdingdanDao extends BaseMapper<KechengdingdanEntity> {
	
	List<KechengdingdanVO> selectListVO(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);
	
	KechengdingdanVO selectVO(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);
	
	List<KechengdingdanView> selectListView(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);

	List<KechengdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<KechengdingdanEntity> wrapper);
	
	KechengdingdanView selectView(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengdingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengdingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengdingdanEntity> wrapper);



}
