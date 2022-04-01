package io.azureblue.springbootmodule2;

import io.azureblue.Utilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootModule2Application {

    public static void main(String[] args) {
        System.out.println(Utilities.getVersion());
        SpringApplication.run(SpringBootModule2Application.class, args);
    }

}
