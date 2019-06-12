package com.infotech.book.ticket;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.book.ticket.app.service.TicketBookingService;
import com.infotech.book.ticket.entities.Ticket;

@SpringBootApplication
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		TicketBookingService ticketBookingService = configurableApplicationContext.getBean("ticketBookingService",TicketBookingService.class);
		
		Ticket ticket = new Ticket();
		ticket.setPasssangerName("Mohit Basak");
		ticket.setSourceStation("Delhi");
		ticket.setDestStation("Kishanganj");
		ticket.setEmail("basak979@gmail.com");
		ticket.setBookingDate(new Date());
		
		ticketBookingService.createTicket(ticket);
		
		/*for(String name:configurableApplicationContext.getBeanDefinitionNames() ){
			System.out.println(name);
		}
		*/
	}
}
