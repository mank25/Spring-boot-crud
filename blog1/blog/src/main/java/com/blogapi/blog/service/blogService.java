package com.blogapi.blog.service;

import com.blogapi.blog.model.blogModel;

import java.util.List;

public interface blogService {
    public String createBlog(blogModel blogmodel);
    public String updateBlog(blogModel blogmodel);
    public String deleteBlog(String blogid);
    public blogModel getBlog(String blogid);
    public List<blogModel> getAllblog();


}
