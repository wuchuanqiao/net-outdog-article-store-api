package net.outdog.article.api.bean;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class ApiArticle extends ApiBean {
    private int type;
    private String cover;
    private String title;
    private String context;
    private ApiAuthor author;
    private List<String> images;
    private List<ApiArticle> comments;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public ApiAuthor getAuthor() {
        return author;
    }

    public void setAuthor(ApiAuthor author) {
        this.author = author;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<ApiArticle> getComments() {
        return comments;
    }

    public void setComments(List<ApiArticle> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
