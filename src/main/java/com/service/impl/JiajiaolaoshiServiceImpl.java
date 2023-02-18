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


import com.dao.JiajiaolaoshiDao;
import com.entity.JiajiaolaoshiEntity;
import com.service.JiajiaolaoshiService;
import com.entity.vo.JiajiaolaoshiVO;
import com.entity.view.JiajiaolaoshiView;

@Service("jiajiaolaoshiService")
public class JiajiaolaoshiServiceImpl extends ServiceImpl<JiajiaolaoshiDao, JiajiaolaoshiEntity> implements JiajiaolaoshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiajiaolaoshiEntity> page = this.selectPage(
                new Query<JiajiaolaoshiEntity>(params).getPage(),
                new EntityWrapper<JiajiaolaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiajiaolaoshiEntity> wrapper) {
		  Page<JiajiaolaoshiView> page =new Query<JiajiaolaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiajiaolaoshiVO> selectListVO(Wrapper<JiajiaolaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiajiaolaoshiVO selectVO(Wrapper<JiajiaolaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiajiaolaoshiView> selectListView(Wrapper<JiajiaolaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiajiaolaoshiView selectView(Wrapper<JiajiaolaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
