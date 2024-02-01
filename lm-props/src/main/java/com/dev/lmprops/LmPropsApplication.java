package com.dev.lmprops;

import com.dev.lmprops.lists.SocialMediaProperties;
import com.dev.lmprops.maps.BookMarkProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({SocialMediaProperties.class, BookMarkProperties.class})
@SpringBootApplication
public class LmPropsApplication {

    public static void main(String[] args) {
        var values = SpringApplication.run(LmPropsApplication.class, args);

      /*  String[] beans = values.getBeanDefinitionNames();

        for (String string : beans) {
            System.out.println("beans = " + string);

        }*/
    }

}
