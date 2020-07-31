package com.example.ztree.controller;

import com.alibaba.fastjson.JSON;
import com.example.ztree.entity.Area;
import com.example.ztree.service.AreaService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class AreaController {
    @Resource
    private AreaService areaService;

    //根据id查询数据
    @RequestMapping(value = "/area/select",method = RequestMethod.GET)
    @ResponseBody
    public Area selectArea(int id){
        return areaService.select(id);
    }

    //根据id删除数据
    @RequestMapping(value = "/area/delete",method = RequestMethod.GET)
    @ResponseBody
    public String delete(int id){
        areaService.delete(id);
        return "ok";
    }

    //查询所有数据
    @RequestMapping(value = "/area/selectall",method = RequestMethod.GET)
    @ResponseBody
    public List<Area> selectAll() {
        return areaService.selectAll();
    }


    //给index.html传参数
    @RequestMapping(value = "/testArea", method = RequestMethod.GET)
    @ResponseBody
    public String testArea(){
        List<Area> area = areaService.selectAll();
        //将查询出来的数据转化为 JSON字符串 形式
        String s = JSON.toJSONString(area);
        //控制台打印这个 JSON字符串
        System.out.println(s);
        //把 JSON字符串 响应给页面
        return s;
    }

}
