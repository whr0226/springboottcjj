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


import com.dao.KechengdingdanDao;
import com.entity.KechengdingdanEntity;
import com.service.KechengdingdanService;
import com.entity.vo.KechengdingdanVO;
import com.entity.view.KechengdingdanView;

@Service("kechengdingdanService")
public class KechengdingdanServiceImpl extends ServiceImpl<KechengdingdanDao, KechengdingdanEntity> implements KechengdingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengdingdanEntity> page = this.selectPage(
                new Query<KechengdingdanEntity>(params).getPage(),
                new EntityWrapper<KechengdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengdingdanEntity> wrapper) {
		  Page<KechengdingdanView> page =new Query<KechengdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengdingdanVO> selectListVO(Wrapper<KechengdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengdingdanVO selectVO(Wrapper<KechengdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengdingdanView> selectListView(Wrapper<KechengdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengdingdanView selectView(Wrapper<KechengdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KechengdingdanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KechengdingdanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KechengdingdanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
