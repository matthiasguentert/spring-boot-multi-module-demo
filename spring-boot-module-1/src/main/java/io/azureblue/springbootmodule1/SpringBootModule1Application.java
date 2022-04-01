package io.azureblue.springbootmodule1;

import io.azureblue.Utilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootModule1Application {

    public static void main(String[] args) {
        System.out.println(Utilities.getVersion());
        SpringApplication.run(SpringBootModule1Application.class, args);
    }

}
