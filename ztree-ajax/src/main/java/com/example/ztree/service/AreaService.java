package com.example.ztree.service;

import com.example.ztree.entity.Area;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AreaService {

    List<Area> selectAll();
    Integer insert(Area area);
    Area select(Integer integer);
    int update(Area area);
    int delete(int area_id);

}
