package com.infotech.book.ticket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.book.ticket.app.service.TicketBookingService;
import com.infotech.book.ticket.entities.Ticket;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {
	@Autowired
	private TicketBookingService ticketBookingService;

	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

	@GetMapping(value = "admin/ticket/alltickets")
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingService.getAllBookedTickets();
	}

	@GetMapping(value = "user/ticket/{ticketId}")
	public Ticket getTicketByID(@PathVariable Integer ticketId) {
		return ticketBookingService.getTicketByID(ticketId);

	}

	@DeleteMapping(value = "/ticket/delete/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		ticketBookingService.deleteTicket(ticketId);
	}

	@PutMapping(value = "/ticketUpdate/{ticketId}/{newEmail:.+}")
	public Ticket updateTicketById(@PathVariable("ticketId") Integer ticketId,@PathVariable ("newEmail") String newEmail ) {
		return ticketBookingService.updateTicketById(ticketId, newEmail);
	}
}
