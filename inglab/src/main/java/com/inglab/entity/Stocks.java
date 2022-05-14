package com.inglab.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "stocks")
public class Stocks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private int num_gainers;
	
	@Column(nullable = false)
	private int num_losers;		
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date timestamp;

	@PrePersist
	private void onCreate() {
	    timestamp = new Date();
	}
	
	public Stocks() {}

	public Stocks(int num_gainers, int num_losers) {
		super();
		this.num_gainers = num_gainers;
		this.num_losers = num_losers;
	}

	public int getNum_gainers() {
		return num_gainers;
	}

	public void setNum_gainers(int num_gainers) {
		this.num_gainers = num_gainers;
	}

	public int getNum_losers() {
		return num_losers;
	}

	public void setNum_losers(int num_losers) {
		this.num_losers = num_losers;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
