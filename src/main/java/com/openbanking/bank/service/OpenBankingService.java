package com.openbanking.bank.service;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import com.openbanking.bank.client.OpenbankingFeignCall;
import com.openbanking.bank.dto.Authorize;

import feign.Response;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OpenBankingService {
	
	private final OpenbankingFeignCall openbankingFeignCall;
	
	@SuppressWarnings("unused")
	public void getToken(Authorize authorize) throws IOException {
		Response feignResponse = openbankingFeignCall.getToken(authorize);
		String textBody = extractContent(feignResponse);
		return;
	}
	
	private String extractContent(Response response) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try{
            StreamUtils.copy(response.body().asInputStream(), output);
        } catch (FileNotFoundException ex) {
            return null;
        } catch (Exception ex) {
            return null;
        }
        return new String(output.toByteArray());
	}
}
