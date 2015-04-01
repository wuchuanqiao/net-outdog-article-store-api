package net.outdog.article.api.service;

import net.outdog.article.api.bean.ApiArticle;

public interface ApiArticleWriterRemote {
    long generate(String appId, ApiArticle article);

    boolean delete(String appId, long id, int version);

    boolean modify(String appId, long id, int version, ApiArticle after);
}
