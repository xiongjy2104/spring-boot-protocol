package com.github.netty.protocol.servlet;

import jakarta.servlet.SessionCookieConfig;

import java.nio.IntBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

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

    private static final String COOKIE_COMMENT_ATTR = "Comment";
    private static final String COOKIE_DOMAIN_ATTR = "Domain";
    private static final String COOKIE_MAX_AGE_ATTR = "Max-Age";
    private static final String COOKIE_PATH_ATTR = "Path";
    private static final String COOKIE_SECURE_ATTR = "Secure";
    private static final String COOKIE_HTTP_ONLY_ATTR = "HttpOnly";
    private static final String COOKIE_NAME_ATTR = "Name";

    private static final int DEFAULT_MAX_AGE = -1;
    private static final boolean DEFAULT_HTTP_ONLY = false;
    private static final boolean DEFAULT_SECURE = false;
    private final Map<String,String> attributes = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    public ServletSessionCookieConfig() {
    }

    @Deprecated
    @Override
    public String getComment() {
        return getAttribute(COOKIE_COMMENT_ATTR);
    }

    @Deprecated
    @Override
    public void setComment(String comment) {
        this.comment = comment;
        setAttribute(COOKIE_COMMENT_ATTR, comment);
    }

    @Override
    public void setAttribute(final String name, final String value) {
        attributes.put(name, value);
    }

    @Override
    public String getAttribute(final String name) {
        return attributes.get(name);
    }

    @Override
    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(attributes);
    }

    @Override
    public String getDomain() {
//        return domain;
        return attributes.get(COOKIE_DOMAIN_ATTR);
    }

    @Override
    public void setDomain(String domain) {
        this.domain = domain;
        setAttribute(COOKIE_DOMAIN_ATTR, domain);
    }

    @Override
    public int getMaxAge() {
//        return maxAge;
        String v= attributes.get(COOKIE_MAX_AGE_ATTR);
        return (v==null)?DEFAULT_MAX_AGE:Integer.parseInt(v);
    }

    @Override
    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
        setAttribute(COOKIE_MAX_AGE_ATTR,  String.valueOf(maxAge));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
        setAttribute(COOKIE_NAME_ATTR,  name);
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
        setAttribute(COOKIE_PATH_ATTR,  path);
    }

    @Override
    public boolean isHttpOnly() {
        return httpOnly;
    }

    @Override
    public void setHttpOnly(boolean httpOnly) {
        this.httpOnly = httpOnly;
        setAttribute(COOKIE_HTTP_ONLY_ATTR, String.valueOf(httpOnly));
    }

    @Override
    public boolean isSecure() {
        return secure;
    }

    @Override
    public void setSecure(boolean secure) {
        this.secure = secure;
        setAttribute(COOKIE_SECURE_ATTR, String.valueOf(secure));
    }




}
