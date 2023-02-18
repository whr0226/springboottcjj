package com.dao;

import com.entity.DiscussjiajiaozhaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiajiaozhaopinVO;
import com.entity.view.DiscussjiajiaozhaopinView;


/**
 * 家教招聘评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
public interface DiscussjiajiaozhaopinDao extends BaseMapper<DiscussjiajiaozhaopinEntity> {
	
	List<DiscussjiajiaozhaopinVO> selectListVO(@Param("ew") Wrapper<DiscussjiajiaozhaopinEntity> wrapper);
	
	DiscussjiajiaozhaopinVO selectVO(@Param("ew") Wrapper<DiscussjiajiaozhaopinEntity> wrapper);
	
	List<DiscussjiajiaozhaopinView> selectListView(@Param("ew") Wrapper<DiscussjiajiaozhaopinEntity> wrapper);

	List<DiscussjiajiaozhaopinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiajiaozhaopinEntity> wrapper);
	
	DiscussjiajiaozhaopinView selectView(@Param("ew") Wrapper<DiscussjiajiaozhaopinEntity> wrapper);
	

}
