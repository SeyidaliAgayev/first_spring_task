package com.div.firstspringtask;

import com.div.firstspringtask.config.impl.MailRuConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootConfiguration
public class Main3 implements CommandLineRunner {
    @Autowired
    @Qualifier(value = "mailru")
    MailRuConfig mailRuConfig;

    @Override
    public void run(String... args) throws Exception {
        mailRuConfig.configMail();
    }
}
