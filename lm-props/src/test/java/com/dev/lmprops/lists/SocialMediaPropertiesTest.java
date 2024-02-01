package com.dev.lmprops.lists;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SocialMediaPropertiesTest {

    @Autowired
    private SocialMediaProperties  socialMediaProperties;

    @Test
    void shouldListAllSocialMediaAccounts() {

       var accounts =  socialMediaProperties.accounts();

       assertEquals(3, accounts.size());
    }

    @Test
    void shouldGetTwitterAccount(){
        SocialMediaAccount socialMediaAccount = socialMediaProperties.accounts().getFirst();
        assertEquals("twitter", socialMediaAccount.name());
        assertEquals("r0n4k", socialMediaAccount.userName());
        assertEquals("https://twitter.com/r0n4k", socialMediaAccount.URL());

    }
}