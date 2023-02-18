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


import com.dao.JiajiaopingjiaDao;
import com.entity.JiajiaopingjiaEntity;
import com.service.JiajiaopingjiaService;
import com.entity.vo.JiajiaopingjiaVO;
import com.entity.view.JiajiaopingjiaView;

@Service("jiajiaopingjiaService")
public class JiajiaopingjiaServiceImpl extends ServiceImpl<JiajiaopingjiaDao, JiajiaopingjiaEntity> implements JiajiaopingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiajiaopingjiaEntity> page = this.selectPage(
                new Query<JiajiaopingjiaEntity>(params).getPage(),
                new EntityWrapper<JiajiaopingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiajiaopingjiaEntity> wrapper) {
		  Page<JiajiaopingjiaView> page =new Query<JiajiaopingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiajiaopingjiaVO> selectListVO(Wrapper<JiajiaopingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiajiaopingjiaVO selectVO(Wrapper<JiajiaopingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiajiaopingjiaView> selectListView(Wrapper<JiajiaopingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiajiaopingjiaView selectView(Wrapper<JiajiaopingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiajiaopingjiaEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiajiaopingjiaEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiajiaopingjiaEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
