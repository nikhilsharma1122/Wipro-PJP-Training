package com.example.SpringBootDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.wipro.bean.Laptop;

@SpringBootApplication
@ComponentScan("com.wipro.bean")
public class SpringBootDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDiApplication.class, args);
		Laptop l = context.getBean(Laptop.class);
		l.display();
	}

}
