package net.outdog.article.api.service;


import net.outdog.article.api.bean.ApiArticle;
import net.outdog.article.api.bean.ApiQuery;

import java.util.List;

public interface ApiArticleReaderRemote {
    long count(ApiArticle article);
    List<ApiArticle> query(ApiQuery<ApiArticle> query);
}
