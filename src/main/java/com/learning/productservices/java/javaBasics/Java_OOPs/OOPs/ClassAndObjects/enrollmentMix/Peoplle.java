package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
class Peoplle {
	private String id;
	private String name;
	private String address;
	
	Peoplle(String id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void setID(String id){
		this.id = id;
	}
	public String getID(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String addr){
		address = addr;
	}
	public String getAddress(){
		return address;
	}
	public String toString(){
		return "\nID: " + id + "\nName: " + name + "\nAddress: " + address;
	}
}
class Renter extends Peoplle {
	private String renterId;
	private String phone;
	
	Renter(String id, String name, String address, String rent, String tel){
		super(id,name,address);
		renterId = rent;
		phone = tel;
    }
    
	public void setRenterID(String rent){
		renterId = rent;
	} 
	public String getRenterID(){
		return renterId;
	}
	public void setPhone(String tel){
		phone = tel;
	}
	public String getPhone(){
		return phone;
	}
	public String toString(){
		return super.toString() + "\nRenter: " + renterId + "\nPhone: " + phone;
	}
}
class Officer extends Peoplle {
	private String officerId;
	private double salary;
	
	Officer(String id, String name, String address,String office, double slr){
		super(id,name,address);
		officerId = office;
		salary = slr;
	}
	public void setOfficerID(String office){
		officerId = office;
	}
	public String getOfficerID(){
		return officerId;
	}
	public void setSalary(double slr){
		salary = slr;
	}
	public double getSalary(){
		return salary;
	}
	public String toString(){
		return super.toString() + "\nOfficerID: " + officerId + "\nSalary: " + salary;
	}
}
class Monthly {
	private String month;
	private int year;
	private double afterWaterUnit;
	private double afterElectUint;
	private Room room;
	private Officer office;
	
	Monthly(String month, int year,double water, double elect,Room room, Officer office){
		this.month = month;
		this.year = year;
		this.afterWaterUnit = water;
		this.afterElectUint = elect;
	    this.room = room; 
		this.office = office;
	}
	public void setMonth(String month){
		this.month = month;
	}
	public String getMonth(){
		return month;
	}
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	public void setAfterWaterUnit(double water){
		afterWaterUnit = water;
	}
	public double getAfterWaterUnit(){
		return afterWaterUnit;
	}
	public void setAfterElectUnit(double elect){
		afterElectUint = elect;
	}
	public double getAfterElectUnit(){
		return afterElectUint;
	}
	public void setRoom(Room room){
		this.room = room;
	}
	public Room getRoom(){
		return room;
	}
	public void setOffice(Officer office){
		this.office = office;
	}
	public Officer getOffice(){
		return office;
	}
	public double calPayment(){
        double rent = 0.0;
		rent = (afterWaterUnit * 20) + (afterElectUint * 5.0);
		return rent;
		
	}
	public String toString(){
		return "\nMonth: " + month + "\nYear: " + year + 
		"\nAfterWaterUnit: " + afterWaterUnit + 
		"\nAfterElectUnit: " + afterElectUint + 
		"\nRoom: " + room + "\nOffice: " + office;
	}
}
class Room {
	private String roomId;
	private double waterUnit;
	private double electUnit;
	private double rent;
	private Renter renter;
	
	Room(String id, double water, double elect, double rent ,Renter renter){
		roomId = id;
		waterUnit = water;
		electUnit = elect;
        this.rent = rent;
        this.renter = renter;
	}
	public void setRoomID(String id){
		roomId = id;
	}
	public String getRoomID(){
		return roomId;
	}
	public void setWaterUnit(double water){
		waterUnit = water;
	}
	public double getWaterUnit(){
		return waterUnit;
	}
	public void setElectUnit(double elect){
		electUnit = elect;
	}
	public double getElectUnit(){
		return electUnit;
	}
	public void setRent(Renter rentt){
		this.renter = rentt;
	}
	public Renter getRent(){
		return renter;
	}
	public String toString(){
		return "\nRoom ID: " + roomId + "\nWater Unit: " + waterUnit +
		" \nElectUnit: " + electUnit + "\nRent: " + rent + "\nRenter: " + renter;
	}
}

class UesRoom {
	public static void main(String[] args){
        List<Renter> ren = new ArrayList<Renter>(); //Use no get
        List<Monthly> mon = new ArrayList<Monthly>();
        List<Room> rom = new ArrayList<Room>();

		Renter renter1 = new Renter("b7777777777","Wayo Chaiyaphet","77/77 Kalasin","777","0777777777");
		System.out.println("\n" + renter1.toString());
		
		Officer officer1 = new Officer("232323","Pana nama","23/23 Sakhon nakhon","2323",15000);
		System.out.println("\n" + officer1.toString());
        
        Room roomm = new Room("222",8.5,6.5,12000,renter1);
        System.out.println("\n" + roomm.toString());

		Monthly month1 = new Monthly("January",1,7.5,5.5,roomm,officer1);
        System.out.println("\n" + month1.toString());
        
		rom.add(roomm);
		mon.add(month1);
		
		double sum = 0.0;
		double rent = 0.0;
		double afterWaterUnit = 0.0;
		double afterElectUint = 0.0;
		double waterUnit = 0.0;
		double electUnit = 0.0;
		
		for(Monthly Omon : mon){
			Omon.toString();
			afterWaterUnit = Omon.getAfterWaterUnit();
			afterElectUint = Omon.getAfterElectUnit();
			waterUnit = roomm.getWaterUnit();
			electUnit = roomm.getElectUnit();
			
        }
        sum = rent + (afterWaterUnit - waterUnit) * 20 + (afterElectUint - electUnit) * 5;
		System.out.println("Sum Rent: " + sum);
		
		DecimalFormat formatter = new DecimalFormat("#0.00 ");
        double sumPay = month1.calPayment();
        System.out.println("Sum Rent Pay: " + sumPay);
        
		afterWaterUnit = waterUnit;
        afterElectUint = electUnit;
        System.out.println("Undate new value water: " + afterWaterUnit);
        System.out.println("Undate new value elect: " + afterElectUint);

	}
}