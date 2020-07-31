package com.example.ztree;

import com.example.ztree.dao.AreaDao;
import com.example.ztree.entity.Area;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ZtreeApplicationTests {
    @Resource
    private AreaDao areaDao;

    @Test
    void selectTest() {
        Area area = areaDao.select(1000000);
        System.out.println(area);
    }

    @Test
    void selectAllTest() {
        List<Area> areas = areaDao.selectAll();
        System.out.println(areas);
    }


}
