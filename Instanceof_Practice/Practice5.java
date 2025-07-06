package Instanceof_Practice;

import java.util.ArrayList;
import java.util.Collections;

abstract class Device implements Comparable<Device>{
	String name;
	@Override
    public int compareTo(Device other) {
        return this.name.compareToIgnoreCase(other.name);
    }
	
	abstract void powerOn();
	abstract void powerOff();
}

interface Connectable{
	void connect();
}

interface Updatable{
	void updateFirmware();
}

class SmartPhone extends Device implements Connectable, Updatable{
	
	public SmartPhone(String SmartPhoneName) {
		this.name=SmartPhoneName;
	}
	
	@Override
	public void powerOn() {
		System.out.println(name+" 開機");
	}
	
	@Override
	public void connect() {
		System.out.println(name+" 已連線");
	}
	
	@Override
	public void updateFirmware() {
		System.out.println(name+" 韌體更新完成");
	}
	
	@Override
	public void powerOff() {
		System.out.println(name+" 關機");
	}
}

class SmartWatch extends Device implements Connectable{
	
	public SmartWatch(String SmartWatchName) {
		this.name=SmartWatchName;
	}
	
	@Override
	public void powerOn() {
		System.out.println(name+" 啟動中");
	}
	
	@Override
	public void connect() {
		System.out.println(name+" 藍牙已連線");
	}
	
	@Override
	public void powerOff() {
		System.out.println(name+" 關閉");
	}
}
class Tablet extends Device implements Updatable{
	
	public Tablet(String TabletName) {
		this.name=TabletName;
	}
	
	@Override
	public void powerOn() {
		System.out.println(name+" 啟動中");
	}
	
	@Override
	public void updateFirmware() {
		System.out.println(name+" 韌體更新完成");
	}
	
	@Override
	public void powerOff() {
		System.out.println(name+" 關機");
	}
}

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Device> dn=new ArrayList<>();
		dn.add(new SmartPhone("iPhone"));
		dn.add(new SmartWatch("Apple Watch"));
		dn.add(new SmartPhone("Samsung"));
		dn.add(new Tablet("iPad"));
		
		for(Device d:dn) {
			d.powerOn();
			if(d instanceof Connectable) {
				((Connectable) d).connect();
			}
			if(d instanceof Updatable) {
				((Updatable) d).updateFirmware();
			}
			d.powerOff();
		}
		System.out.println("---------------");
		System.out.println("支援韌體更新的裝置：");
		for(Device d:dn) {
			if(d instanceof Updatable) {
				System.out.println(d.name);
			}
		}
		System.out.println("---------------");
		Collections.sort(dn);
		System.out.println("排序後裝置名稱：");
		for (Device d : dn) {
			System.out.println(d.name);
		}
	}

}
