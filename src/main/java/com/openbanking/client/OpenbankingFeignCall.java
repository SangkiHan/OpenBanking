package com.openbanking.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.openbanking.config.FeignConfig;
import com.openbanking.dto.Authorize;

import feign.Response;

@FeignClient(name="${openbanking.name}", url="${openbanking.url}", configuration = FeignConfig.class)
public interface OpenbankingFeignCall {
	
	@PostMapping(value="/oauth/2.0/token", consumes = "application/x-www-form-urlencoded")
	public Response getToken(@RequestBody Authorize authorize);

}
