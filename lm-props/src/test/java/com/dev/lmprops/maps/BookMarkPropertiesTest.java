package com.dev.lmprops.maps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookMarkPropertiesTest {

    @Autowired
     BookMarkProperties bookMarkProperties;

    @Test
    void websites() {

      var websites =   bookMarkProperties.websites();
      assertEquals(4, websites.size());
    }
}