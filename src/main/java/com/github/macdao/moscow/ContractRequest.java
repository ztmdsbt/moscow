package com.github.macdao.moscow;

import org.springframework.http.HttpMethod;

public class ContractRequest {
    private String uri = "/";
    private HttpMethod method = HttpMethod.GET;
    private String text;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}