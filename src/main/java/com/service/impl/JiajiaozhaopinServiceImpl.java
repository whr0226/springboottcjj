package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiajiaozhaopinDao;
import com.entity.JiajiaozhaopinEntity;
import com.service.JiajiaozhaopinService;
import com.entity.vo.JiajiaozhaopinVO;
import com.entity.view.JiajiaozhaopinView;

@Service("jiajiaozhaopinService")
public class JiajiaozhaopinServiceImpl extends ServiceImpl<JiajiaozhaopinDao, JiajiaozhaopinEntity> implements JiajiaozhaopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiajiaozhaopinEntity> page = this.selectPage(
                new Query<JiajiaozhaopinEntity>(params).getPage(),
                new EntityWrapper<JiajiaozhaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiajiaozhaopinEntity> wrapper) {
		  Page<JiajiaozhaopinView> page =new Query<JiajiaozhaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiajiaozhaopinVO> selectListVO(Wrapper<JiajiaozhaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiajiaozhaopinVO selectVO(Wrapper<JiajiaozhaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiajiaozhaopinView> selectListView(Wrapper<JiajiaozhaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiajiaozhaopinView selectView(Wrapper<JiajiaozhaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
