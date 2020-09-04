package com.example.bird.demo.Service;

import com.example.bird.demo.Dao.CategoryRepository;
import com.example.bird.demo.Entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * 通过名称查找类别
     * @param name
     * @return
     */
    public List<Category> getCategoryByName(String name){
        return categoryRepository.getCategoryByName(name);
    }


    /**
     * 获取全部类别
     * @return
     */
    public List<Category> getAllCategory(){
        return categoryRepository.getAllCategory();
    }


    /**
     * 新增类别
     * @param name
     * @return
     */
//    public int addCategory(String name){
//        return categoryRepository.addCategory(name);
//    }

}
