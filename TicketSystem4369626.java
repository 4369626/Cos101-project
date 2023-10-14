package anythingForProject;


public class TicketSystem4369626{
	
	
	public class Match{}
	public class Seat{}
	public class Status{}
	
	 int ticketID;
	 Match match;
	 Seat seat;
	 double price;
	 Status status;
	
	
	public TicketSystem4369626(int ticketID, Match match, Seat seat, double price, Status status) {
		this.ticketID= ticketID;
		this.match = match;
		this.seat = seat;
		this.price = price;
		this.status = status;
	}
	
	public int getTicketID() {
		return ticketID;
	}
	public Match getMatch() {
		return match;
	}
	
	public Seat getSeat() {
		return seat;
	}
	public double getPrice() {
		return price;
	}
	public Status getStatus() {
		return status;
	}
	
	
	public void setTicketID(int ticketID) {
		this.ticketID= ticketID;
	}
	
	public void setMatch(Match match) {
		this.match = match;
	}
	
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setStatus (Status status) {
		this.status = status;
	}
	
	public String toString() {
		return "Ticket ID: " + ticketID +
				"\nMatch: " + match +
				"\nSeat: " + seat +
				"\nPrice: " + price +
				"\nStatus: " + status;
	}
	
	
	

}
