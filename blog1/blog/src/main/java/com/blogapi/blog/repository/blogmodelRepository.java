package com.blogapi.blog.repository;
import com.blogapi.blog.model.blogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface blogmodelRepository extends JpaRepository<blogModel, String>
{

}
