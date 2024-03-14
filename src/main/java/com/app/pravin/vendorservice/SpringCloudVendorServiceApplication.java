package com.app.pravin.vendorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //used for register classes
@EnableFeignClients   // TO generage the client code
@RefreshScope
public class SpringCloudVendorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudVendorServiceApplication.class, args);
	}

}
