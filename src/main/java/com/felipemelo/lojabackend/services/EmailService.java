package com.felipemelo.lojabackend.services;

import org.springframework.mail.SimpleMailMessage;

import com.felipemelo.lojabackend.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationMail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
