package Compareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Device implements Comparable<Device>{
	String name;
	
	public Device(String name) {
        this.name = name;
    }
	
	@Override
	public int compareTo(Device other) {
		return this.name.compareToIgnoreCase(other.name);
	}
}

class SmartPhone extends Device {
	int memory;
	public SmartPhone(String name,int memory) {
		super(name);
		this.memory=memory;
	}
	
	public String toString() {
		return "SmartPhone："+name+","+"memory："+memory;
	}
}

class Laptop extends Device {
	int batteryLife;
	public Laptop(String name,int batteryLife) {
		super(name);
		this.batteryLife=batteryLife;
	}
	
	public String toString() {
		return "Laptop："+name+","+"batteryLife："+batteryLife;
	}
}

class Tablet extends Device {
	double screenSize;
	public Tablet(String name,double screenSize) {
		super(name);
		this.screenSize=screenSize;
	}
	
	public String toString() {
		return "Tablet："+name+","+"screenSize："+screenSize;
	}
}

public class DeviceList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Device> devices = new ArrayList<>();

		devices.add(new SmartPhone("iPhone 15", 6));
		devices.add(new SmartPhone("Pixel 7", 8));
		devices.add(new Laptop("MacBook Air", 18));
		devices.add(new Laptop("ThinkPad X1", 20));
		devices.add(new Tablet("iPad Pro", 12.9));
		devices.add(new Tablet("Galaxy Tab", 11.0));
		
		Collections.sort(devices);
		
		for(Device d:devices) {
			System.out.println(d);
		}
	}

}
