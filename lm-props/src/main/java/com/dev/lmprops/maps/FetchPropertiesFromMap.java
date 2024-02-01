package com.dev.lmprops.maps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FetchPropertiesFromMap {

    @Autowired
    private BookMarkProperties bookMarkProperties;


    public void fetchProperties() {

        var properties = bookMarkProperties.websites();

        System.out.println("properties = " + properties);
    }

}
