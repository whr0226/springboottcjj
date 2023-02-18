package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiajiaolaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiajiaolaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajiaolaoshiView;


/**
 * 家教老师
 *
 * @author 
 * @email 
 * @date 2023-01-18 18:33:56
 */
public interface JiajiaolaoshiService extends IService<JiajiaolaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiajiaolaoshiVO> selectListVO(Wrapper<JiajiaolaoshiEntity> wrapper);
   	
   	JiajiaolaoshiVO selectVO(@Param("ew") Wrapper<JiajiaolaoshiEntity> wrapper);
   	
   	List<JiajiaolaoshiView> selectListView(Wrapper<JiajiaolaoshiEntity> wrapper);
   	
   	JiajiaolaoshiView selectView(@Param("ew") Wrapper<JiajiaolaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiajiaolaoshiEntity> wrapper);
   	

}

