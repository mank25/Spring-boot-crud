package com.blogapi.blog.service.impl;

import com.blogapi.blog.model.blogModel;
import com.blogapi.blog.repository.blogmodelRepository;
import com.blogapi.blog.service.blogService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class blogServiceImpl implements blogService {

    blogmodelRepository blogmodelRepository;

    public blogServiceImpl(com.blogapi.blog.repository.blogmodelRepository blogmodelRepository) {
        this.blogmodelRepository = blogmodelRepository;
    }

    @Override
    public String createBlog(blogModel blogmodel) {
        blogmodelRepository.save(blogmodel);
        return "Blog Created Successfully";
    }

    @Override
    public String updateBlog(blogModel blogmodel) {
        blogmodelRepository.save(blogmodel);
        return "Blog Updated Successfully";
    }

    @Override
    public String deleteBlog(String blogid) {
        blogmodelRepository.deleteById(blogid);
        return "Blog Deleted Successfully";
    }

    @Override
    public blogModel getBlog(String blogid) {
        return blogmodelRepository.findById(blogid).get();
    }

    @Override
    public List<blogModel> getAllblog() {
        return blogmodelRepository.findAll();
    }
}
