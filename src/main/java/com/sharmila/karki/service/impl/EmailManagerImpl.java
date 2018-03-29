package com.sharmila.karki.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sendgrid.Content;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sharmila.karki.domain.CustomEmail;
import com.sharmila.karki.service.EmailManager;

@Service
public class EmailManagerImpl implements EmailManager {
	
	@Value("${spring.sendgrid.api-key}")
	private String sendGridEnv;

	@Override
	public CustomEmail sendEmail(CustomEmail email) {
		String from="sharmilakarki1025@gmail.com";
		String to="sweet.anemone@gmail.com";
		String body=" I am testing send grid ";
		String subject="Sendgrid test ";
		
		com.sendgrid.Email emailSendFrom=new com.sendgrid.Email(from);
		
		com.sendgrid.Email emailSendTo=new com.sendgrid.Email(to);

		Content content = new Content("text/plain", body);
	  
	    Mail mail = new Mail(emailSendFrom, subject, emailSendTo, content);
	    Response response = getEmailResponse(mail);
	    
	    CustomEmail email1 = new CustomEmail.Builder().response(response.getBody()).build();
		
	    return email1;
	}
	

	
	private Response getEmailResponse(Mail mail) {
		Request request = new Request();
		Response response = null;
		SendGrid sg = new SendGrid(sendGridEnv);
		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			response = sg.api(request);
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody());
			System.out.println(response.getHeaders());
		} catch (IOException e) {
			e.printStackTrace();

		}
		return response;
	}
}
