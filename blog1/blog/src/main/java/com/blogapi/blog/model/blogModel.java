package com.blogapi.blog.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="blog_api_info")
public class blogModel {
    @Id
    private String blogid;
    private String title;
    private String content;
    private String author;

    public blogModel() {
    }
    public blogModel(String blogid, String title, String content, String author) {
        this.blogid = blogid;
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public String getBlogid() {
        return blogid;
    }

    public void setBlogid(String blogid) {
        this.blogid = blogid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {  return author; }

    public void setAuthor(String author) {
        this.author = author;
    }
}
