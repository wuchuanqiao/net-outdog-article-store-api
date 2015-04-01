package net.outdog.article.api.service;


import net.outdog.article.api.bean.ApiArticle;
import net.outdog.article.api.bean.ApiQuery;

import java.util.List;

public interface ApiArticleReaderRemote {
    long count(String appId, ApiArticle article);

    List<ApiArticle> query(String appId, ApiQuery<ApiArticle> query);
}
