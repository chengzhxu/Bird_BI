package com.example.bird.demo.Dao;

import com.example.bird.demo.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query(value = "select * from spend_category where name like %?1%", nativeQuery = true)
    public List<Category> getCategoryByName(String name);


    @Query(value = "select * from spend_category ", nativeQuery = true)
    public List<Category> getAllCategory();

//    public int addCategory(String name);

}
