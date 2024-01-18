package com.div.firstspringtask.config.impl;

import com.div.firstspringtask.config.MailConfigInter;
import org.springframework.stereotype.Service;

@Service(value = "hotmail")
public class HotMailConfig implements MailConfigInter {
    @Override
    public void configMail() {
        System.out.println("Configured HotMail");
    }
}
