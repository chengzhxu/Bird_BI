package com.example.bird.demo.Controller;


import com.example.bird.demo.Entity.Category;
import com.example.bird.demo.Service.CategoryService;
import com.example.bird.demo.Tool.Response;
import com.example.bird.demo.Tool.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")

public class CategoryController {
    @Autowired
    CategoryService categoryService;


    /**
     * 获取类别列表
     */
    @RequestMapping("/getCategoryList")
    @ResponseBody
    public ResponseResult<List<Category>> getCategoryList(String name){
        List<Category> category = null;

        if(name != null){
            category = categoryService.getCategoryByName(name);
        }else{
            category = categoryService.getAllCategory();
        }

        return Response.makeOKRsp(category);
    }

}
