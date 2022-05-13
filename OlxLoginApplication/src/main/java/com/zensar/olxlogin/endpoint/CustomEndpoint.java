package com.zensar.olxlogin.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id = "custom")
@Component
public class CustomEndpoint {

	@ReadOperation
	public String myOwnCustomEndpoint() {
		return " My Own Endpoint ";
		}

}
