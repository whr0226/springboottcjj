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


import com.dao.DiscussjiajiaozhaopinDao;
import com.entity.DiscussjiajiaozhaopinEntity;
import com.service.DiscussjiajiaozhaopinService;
import com.entity.vo.DiscussjiajiaozhaopinVO;
import com.entity.view.DiscussjiajiaozhaopinView;

@Service("discussjiajiaozhaopinService")
public class DiscussjiajiaozhaopinServiceImpl extends ServiceImpl<DiscussjiajiaozhaopinDao, DiscussjiajiaozhaopinEntity> implements DiscussjiajiaozhaopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiajiaozhaopinEntity> page = this.selectPage(
                new Query<DiscussjiajiaozhaopinEntity>(params).getPage(),
                new EntityWrapper<DiscussjiajiaozhaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiajiaozhaopinEntity> wrapper) {
		  Page<DiscussjiajiaozhaopinView> page =new Query<DiscussjiajiaozhaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiajiaozhaopinVO> selectListVO(Wrapper<DiscussjiajiaozhaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiajiaozhaopinVO selectVO(Wrapper<DiscussjiajiaozhaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiajiaozhaopinView> selectListView(Wrapper<DiscussjiajiaozhaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiajiaozhaopinView selectView(Wrapper<DiscussjiajiaozhaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
