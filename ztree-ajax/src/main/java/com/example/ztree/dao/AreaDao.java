package com.example.ztree.dao;

import com.example.ztree.entity.Area;

import java.util.List;

public interface AreaDao {
    //方法名对应xml里面的标签id
    Integer insert(Area area);
    Area select(Integer integer);
    int update(Area area);
    int delete(int areaId);
    List<Area> selectAll();

}
