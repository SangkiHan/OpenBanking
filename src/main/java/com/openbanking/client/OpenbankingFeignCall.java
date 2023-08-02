package com.openbanking.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.openbanking.config.FeignConfig;

import feign.Response;

@FeignClient(name="${openbanking.name}", url="${openbanking.url}", configuration = FeignConfig.class)
public interface OpenbankingFeignCall {
	
	@GetMapping(value="/oauth/2.0/authorize")
	public Response authorize();

}
