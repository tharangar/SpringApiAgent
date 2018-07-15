package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the rowdata database table.
 * 
 */
@Entity
@Table(name="rowdata")
@NamedQuery(name="Rowdata.findAll", query="SELECT r FROM Rowdata r")
public class Rowdata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String acc;

	private String course;

	private String device;

	private String fual;

	private String gps;

	private String input1;

	private String input2;

	private String input3;

	private String input4;

	private String lat;

	private String logsource;

	private String lon;

	private String milage;

	@Temporal(TemporalType.TIMESTAMP)
	private Date regtime;

	private String speed;

	private int status;

	@Temporal(TemporalType.TIMESTAMP)
	private Date stime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date time;

	public Rowdata() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcc() {
		return this.acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDevice() {
		return this.device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getFual() {
		return this.fual;
	}

	public void setFual(String fual) {
		this.fual = fual;
	}

	public String getGps() {
		return this.gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getInput1() {
		return this.input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return this.input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public String getInput3() {
		return this.input3;
	}

	public void setInput3(String input3) {
		this.input3 = input3;
	}

	public String getInput4() {
		return this.input4;
	}

	public void setInput4(String input4) {
		this.input4 = input4;
	}

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLogsource() {
		return this.logsource;
	}

	public void setLogsource(String logsource) {
		this.logsource = logsource;
	}

	public String getLon() {
		return this.lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getMilage() {
		return this.milage;
	}

	public void setMilage(String milage) {
		this.milage = milage;
	}

	public Date getRegtime() {
		return this.regtime;
	}

	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	public String getSpeed() {
		return this.speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getStime() {
		return this.stime;
	}

	public void setStime(Date stime) {
		this.stime = stime;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}