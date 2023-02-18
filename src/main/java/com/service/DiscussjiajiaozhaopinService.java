package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiajiaozhaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiajiaozhaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiajiaozhaopinView;


/**
 * 家教招聘评论表
 *
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
public interface DiscussjiajiaozhaopinService extends IService<DiscussjiajiaozhaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiajiaozhaopinVO> selectListVO(Wrapper<DiscussjiajiaozhaopinEntity> wrapper);
   	
   	DiscussjiajiaozhaopinVO selectVO(@Param("ew") Wrapper<DiscussjiajiaozhaopinEntity> wrapper);
   	
   	List<DiscussjiajiaozhaopinView> selectListView(Wrapper<DiscussjiajiaozhaopinEntity> wrapper);
   	
   	DiscussjiajiaozhaopinView selectView(@Param("ew") Wrapper<DiscussjiajiaozhaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiajiaozhaopinEntity> wrapper);
   	

}

