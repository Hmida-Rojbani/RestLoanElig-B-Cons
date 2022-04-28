package de.tekup.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.tekup.rest.models.CustomerRequest;
import de.tekup.rest.models.WsResponse;

@Service
public class AskServiceRest {
	
	private static final String BASE_URL="http://localhost:8080";
	@Autowired
	private FeignRestCaller restCaller;

	public WsResponse sendRequestToServer(CustomerRequest request) {
		RestTemplate template = new RestTemplate();
		
		WsResponse response = template.postForObject(BASE_URL+"/check/client/status", request, WsResponse.class);
		return response;
	}
	//second way
	public WsResponse sendRequestToServerViaFeign(CustomerRequest request) {
	
		WsResponse response = restCaller.callService(request);
		return response;
	}

}
