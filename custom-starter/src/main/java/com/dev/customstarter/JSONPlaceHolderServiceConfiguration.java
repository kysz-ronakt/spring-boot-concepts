package com.dev.customstarter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@AutoConfiguration
@EnableConfigurationProperties(JSONPlaceHolderServiceConfiguration.class)
public class JSONPlaceHolderServiceConfiguration {
}
