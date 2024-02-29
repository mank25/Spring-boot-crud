package com.blogapi.blog.controller;

import com.blogapi.blog.model.blogModel;
import com.blogapi.blog.service.blogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogapi")
public class blogapiController
{
    blogService blogService;

    public blogapiController(com.blogapi.blog.service.blogService blogService) {
        this.blogService = blogService;
    }
    //one bolg by id
    @GetMapping("{blogid}")
    public blogModel getblogmodelDetails(@PathVariable("blogid") String blogid)
    {
        return blogService.getBlog(blogid);
        //new blog("b1","title1","content1","Mayank Sharma")
    }
    //all blog
    @GetMapping()
    public List<blogModel> getAllblogmeodelDetails()
    {
        return blogService.getAllblog();
        //new blog("b1","title1","content1","Mayank Sharma")
    }
    @PostMapping
    public String createblogmodelDetails(@RequestBody blogModel blogmodel){
        blogService.createBlog(blogmodel);
        return "blog created Successfully";
    }
    @PutMapping
    public String updateblogmodelDetails(@RequestBody blogModel blogmodel){
        blogService.updateBlog(blogmodel);
        return "blog Updated Successfully";
    }

    @DeleteMapping("{blogid}")
    public String deleteblogmodelDetails(@PathVariable("blogid") String blogid)
    {
        blogService.deleteBlog(blogid);
        return "blog deleted successfully";
        //new blog("b1","title1","content1","Mayank Sharma")
    }

}
