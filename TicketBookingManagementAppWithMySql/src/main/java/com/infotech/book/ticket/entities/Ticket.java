package com.infotech.book.ticket.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_Id")
	private Integer ticketId;

	@Column(name = "passsanger_Name", nullable = false)
	private String passsangerName;

	@Column(name = "booking_Date")
	private Date bookingDate;

	@Column(name = "source_Station")
	private String sourceStation;

	@Column(name = "dest_Station")
	private String destStation;

	@Column(name = "email")
	private String email;

	public Integer getTicket_id() {
		return ticketId;
	}

	public void setTicket_id(Integer ticket_id) {
		this.ticketId = ticket_id;
	}

	public String getPasssangerName() {
		return passsangerName;
	}

	public void setPasssangerName(String passsangerName) {
		this.passsangerName = passsangerName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestStation() {
		return destStation;
	}

	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
