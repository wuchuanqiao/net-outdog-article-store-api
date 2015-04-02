package net.outdog.article.api.service;


import net.outdog.article.api.bean.ApiArticle;
import net.outdog.article.api.bean.ApiQuery;
import net.outdog.article.api.bean.ApiResult;
import net.outdog.article.api.exception.ApiException;

public interface ApiArticleReaderRemote {
    long count(String appId, ApiArticle article) throws ApiException;

    ApiArticle query(String appId, long id, int version) throws ApiException;

    ApiResult<ApiArticle> query(String appId, ApiQuery<ApiArticle> query) throws ApiException;
}
