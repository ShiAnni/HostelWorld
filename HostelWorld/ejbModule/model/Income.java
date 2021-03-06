package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="income")
public class Income implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int state;
	private String hotel_login;
	private int rid;
	private String associator_login;
	private BigDecimal former_money;
	private BigDecimal money;
	private Date time;
	private Room room;
	private int accpoint;
	private int payType;
	private BigDecimal reserveMoney;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getHotel_login() {
		return hotel_login;
	}
	public void setHotel_login(String hotel_login) {
		this.hotel_login = hotel_login;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getAssociator_login() {
		return associator_login;
	}
	public void setAssociator_login(String associator_login) {
		this.associator_login = associator_login;
	}
	public BigDecimal getFormer_money() {
		return former_money;
	}
	public void setFormer_money(BigDecimal former_money) {
		this.former_money = former_money;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="rid", insertable = false, updatable = false)
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public int getAccpoint() {
		return accpoint;
	}
	public void setAccpoint(int accpoint) {
		this.accpoint = accpoint;
	}
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}
	public BigDecimal getReserveMoney() {
		return reserveMoney;
	}
	public void setReserveMoney(BigDecimal reserveMoney) {
		this.reserveMoney = reserveMoney;
	}
	
}
