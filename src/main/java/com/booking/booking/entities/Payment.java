package com.booking.booking.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {
	 @Id
	    private String fullname;
	    private String email;
	    private int cardnumber;
	    private Date expirydate;
	    private int amount;

	    public String getFullname() {
	        return fullname;
	    }

	    public void setFullname(String fullname) {
	        this.fullname = fullname;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public int getCardnumber() {
	        return cardnumber;
	    }

	    public void setCardnumber(int cardnumber) {
	        this.cardnumber = cardnumber;
	    }

	    public Date getExpirydate() {
	        return expirydate;
	    }

	    public void setExpirydate(Date expirydate) {
	        this.expirydate = expirydate;
	    }

	    public int getAmount() {
	        return amount;
	    }

	    public void setAmount(int amount) {
	        this.amount = amount;
	    }

	    @Override
	    public String toString() {
	        return "Payment [fullname=" + fullname + ", email=" + email + ", cardnumber=" + cardnumber + ", expirydate="
	                + expirydate + ", amount=" + amount + "]";
	    }

	    public Payment(String fullname, String email, int cardnumber, Date expirydate, int amount) {
	        super();
	        this.fullname = fullname;
	        this.email = email;
	        this.cardnumber = cardnumber;
	        this.expirydate = expirydate;
	        this.amount = amount;
	    }

	    public Payment() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	
	
}
