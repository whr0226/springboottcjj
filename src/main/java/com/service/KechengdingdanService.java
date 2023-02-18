package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengdingdanView;


/**
 * 课程订单
 *
 * @author 
 * @email 
 * @date 2023-01-18 18:33:57
 */
public interface KechengdingdanService extends IService<KechengdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengdingdanVO> selectListVO(Wrapper<KechengdingdanEntity> wrapper);
   	
   	KechengdingdanVO selectVO(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);
   	
   	List<KechengdingdanView> selectListView(Wrapper<KechengdingdanEntity> wrapper);
   	
   	KechengdingdanView selectView(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengdingdanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KechengdingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KechengdingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KechengdingdanEntity> wrapper);



}

