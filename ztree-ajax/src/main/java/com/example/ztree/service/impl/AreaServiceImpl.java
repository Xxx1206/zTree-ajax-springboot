package com.example.ztree.service.impl;

import com.example.ztree.dao.AreaDao;
import com.example.ztree.entity.Area;
import com.example.ztree.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "areaService")
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaDao areaDao;

    @Override
    public Integer insert(Area area) {
        return areaDao.insert(area);
    }

    @Override
    public Area select(Integer integer) {
        return areaDao.select(integer);
    }

    @Override
    public int update(Area area) {
        return areaDao.update(area);
    }

    @Override
    public int delete(int areaId) {
        return areaDao.delete(areaId);
    }

    @Override
    public List<Area> selectAll() {
        return areaDao.selectAll();
    }

}
