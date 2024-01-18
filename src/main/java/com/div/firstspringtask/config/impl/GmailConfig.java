package com.div.firstspringtask.config.impl;

import com.div.firstspringtask.config.MailConfigInter;
import org.springframework.stereotype.Service;

@Service(value = "gmail")
public class GmailConfig implements MailConfigInter {
    @Override
    public void configMail() {
        System.out.println("Configured Gmail");
    }
}
