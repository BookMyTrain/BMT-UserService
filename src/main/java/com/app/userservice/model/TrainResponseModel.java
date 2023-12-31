package com.app.userservice.model;

import java.io.Serializable;

public class TrainResponseModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9047442382942293409L;
	private String name;
	private String trainnumber;
	private String source;
	private String destination;
	private String date;

	
	@Override
	public String toString() {
		return "TrainDto [name=" + name + ", trainnumber=" + trainnumber + ", source=" + source + ", destination="
				+ destination + ", date=" + date + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrainnumber() {
		return trainnumber;
	}

	public void setTrainnumber(String trainnumber) {
		this.trainnumber = trainnumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
