package com.github.netty.protocol.servlet;

import jakarta.servlet.SessionCookieConfig;

import java.util.Map;

/**
 * Configuration of session cookies
 *
 * @author wangzihao
 * 2018/7/14/014
 */
public class ServletSessionCookieConfig implements SessionCookieConfig {
    private boolean httpOnly;
    private boolean secure;
    /**
     * Unit seconds
     */
    private int maxAge = -1;
    private String comment;
    private String domain;
    private String name;
    private String path;

    public ServletSessionCookieConfig() {
    }


    @Override
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public void setAttribute(String s, String s1) {

    }

    @Override
    public String getAttribute(String s) {
        return "";
    }

    @Override
    public Map<String, String> getAttributes() {
        return Map.of();
    }

    @Override
    public String getDomain() {
        return domain;
    }

    @Override
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public int getMaxAge() {
        return maxAge;
    }

    @Override
    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean isHttpOnly() {
        return httpOnly;
    }

    @Override
    public void setHttpOnly(boolean httpOnly) {
        this.httpOnly = httpOnly;
    }

    @Override
    public boolean isSecure() {
        return secure;
    }

    @Override
    public void setSecure(boolean secure) {
        this.secure = secure;
    }

}
