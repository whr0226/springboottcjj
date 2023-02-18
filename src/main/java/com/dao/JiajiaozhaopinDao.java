package com.dao;

import com.entity.JiajiaozhaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiajiaozhaopinVO;
import com.entity.view.JiajiaozhaopinView;


/**
 * 家教招聘
 * 
 * @author 
 * @email 
 * @date 2023-01-18 18:33:56
 */
public interface JiajiaozhaopinDao extends BaseMapper<JiajiaozhaopinEntity> {
	
	List<JiajiaozhaopinVO> selectListVO(@Param("ew") Wrapper<JiajiaozhaopinEntity> wrapper);
	
	JiajiaozhaopinVO selectVO(@Param("ew") Wrapper<JiajiaozhaopinEntity> wrapper);
	
	List<JiajiaozhaopinView> selectListView(@Param("ew") Wrapper<JiajiaozhaopinEntity> wrapper);

	List<JiajiaozhaopinView> selectListView(Pagination page,@Param("ew") Wrapper<JiajiaozhaopinEntity> wrapper);
	
	JiajiaozhaopinView selectView(@Param("ew") Wrapper<JiajiaozhaopinEntity> wrapper);
	

}
