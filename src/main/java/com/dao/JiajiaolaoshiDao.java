package com.dao;

import com.entity.JiajiaolaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiajiaolaoshiVO;
import com.entity.view.JiajiaolaoshiView;


/**
 * 家教老师
 * 
 * @author 
 * @email 
 * @date 2023-01-18 18:33:56
 */
public interface JiajiaolaoshiDao extends BaseMapper<JiajiaolaoshiEntity> {
	
	List<JiajiaolaoshiVO> selectListVO(@Param("ew") Wrapper<JiajiaolaoshiEntity> wrapper);
	
	JiajiaolaoshiVO selectVO(@Param("ew") Wrapper<JiajiaolaoshiEntity> wrapper);
	
	List<JiajiaolaoshiView> selectListView(@Param("ew") Wrapper<JiajiaolaoshiEntity> wrapper);

	List<JiajiaolaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<JiajiaolaoshiEntity> wrapper);
	
	JiajiaolaoshiView selectView(@Param("ew") Wrapper<JiajiaolaoshiEntity> wrapper);
	

}
