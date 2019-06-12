package com.infotech.book.ticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.entities.Ticket;

@Service
public class TicketBookingService {
	@Autowired
	private TicketBookingDao ticketBookingDao;

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}

	public Ticket getTicketByID(Integer ticketId) {
		Optional<Ticket> findById = ticketBookingDao.findById(ticketId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);		
	}

	public Ticket updateTicketById(Integer ticketId, String newEmail) {
		Ticket ticketfromDB = ticketBookingDao.findById(ticketId).get();
		ticketfromDB.setEmail(newEmail);
		return  ticketBookingDao.findById(ticketId).get();
		
	}
}
