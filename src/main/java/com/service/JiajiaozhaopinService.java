package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiajiaozhaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiajiaozhaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajiaozhaopinView;


/**
 * 家教招聘
 *
 * @author 
 * @email 
 * @date 2023-01-18 18:33:56
 */
public interface JiajiaozhaopinService extends IService<JiajiaozhaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiajiaozhaopinVO> selectListVO(Wrapper<JiajiaozhaopinEntity> wrapper);
   	
   	JiajiaozhaopinVO selectVO(@Param("ew") Wrapper<JiajiaozhaopinEntity> wrapper);
   	
   	List<JiajiaozhaopinView> selectListView(Wrapper<JiajiaozhaopinEntity> wrapper);
   	
   	JiajiaozhaopinView selectView(@Param("ew") Wrapper<JiajiaozhaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiajiaozhaopinEntity> wrapper);
   	

}

