package net.outdog.article.api.service;

import net.outdog.article.api.bean.ApiArticle;
import net.outdog.article.api.exception.ApiException;

public interface ApiArticleWriterRemote {
    long generate(String appId, ApiArticle article) throws ApiException;

    boolean delete(String appId, long id, int version) throws ApiException;

    boolean modify(String appId, long id, int version, ApiArticle article) throws ApiException;
}
