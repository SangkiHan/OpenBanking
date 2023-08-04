package com.openbanking.bank.service;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openbanking.bank.client.OpenbankingFeignCall;
import com.openbanking.bank.dto.Authorize;

import feign.Response;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OpenBankingService {
	
	private final OpenbankingFeignCall openbankingFeignCall;
	private final ObjectMapper mapper;
	
	@SuppressWarnings("unused")
	public void getToken(Authorize authorize) throws IOException {
		Response feignResponse = openbankingFeignCall.getToken(authorize);
		String textBody = extractContent(feignResponse);
		JsonNode body = mapper.readTree(textBody);
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
