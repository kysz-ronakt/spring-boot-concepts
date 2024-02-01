package com.dev.lmprops.maps;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties("bookmarks")
public record BookMarkProperties(Map<String, Website> websites) {


}
