package com.openbanking;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.openbanking.service.OpenBankingService;

@SpringBootTest
class OpenBankingApplicationTests {
	
	@Autowired private OpenBankingService bankingService;

	@Test
	void contextLoads() throws IOException {
		bankingService.feignTest();
	}

}
