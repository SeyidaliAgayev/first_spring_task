package com.div.firstspringtask;

import com.div.firstspringtask.config.impl.GmailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootConfiguration
public class Main implements CommandLineRunner {
    @Autowired
    @Qualifier(value = "gmail")
    GmailConfig gmailConfig;

    public static void main(String[] args) {

    }

    @Override
    public void run(String... args) throws Exception {
        gmailConfig.configMail();
    }
}
