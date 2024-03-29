package com.app.pravin.vendorservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.app.pravin.vendorservice.bean.CartInfo;


//The commented code is for Eureka client and loadbalancer client
//@Component


@FeignClient("CART-SERVICE")
public interface VendorService 
{
	
	@GetMapping("/cart/message")
	public ResponseEntity<String> showCartMessage();
	
	
	
	@GetMapping("/cart/info/{id}")
	public ResponseEntity<CartInfo> getCrtInfo(@PathVariable String id);
	
}	
	
	/*
	@Autowired
	LoadBalancerClient client;
	RestTemplate rt = new RestTemplate();
	
	public String getData()
	{
		ServiceInstance si = client.choose("CART-SERVICE");
		
		String url = si.getUri()+"/cart/message";
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		
		return response.getBody();
	}
	*/
//}
