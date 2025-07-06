package AdvancedClass;

class CRational{
	public int n;
	public int d;
	public void setN(int num) {
		n=num;
	}
	
	public void setD(int num) {
		d=num;
	}

	public void setND(int num, int den) {
		n=num;
		d=den;
	}
	
	public CRational add(CRational r) {
		CRational result = new CRational();
		result.n=n*r.d+d*r.n;
		result.d=d*r.d;
		return result;
	}
	
	public CRational sub(CRational r) {
		CRational result = new CRational();
		result.n=n*r.d-d*r.n;
		result.d=d*r.d;
		return result;
	}
	
	public CRational mul(CRational r) {
		CRational result = new CRational();
		result.n=n*r.n;
		result.d=d*r.d;
		return result;
	}
	
	public CRational div(CRational r) {
		CRational result = new CRational();
		result.n=n*r.d;
		result.d=d*r.n;
		return result;
	}
	
	public static CRational compare(CRational r1,CRational r2) {
		if((r1.n*r2.d)>(r2.n*r1.d)) {
			return r1;
		}else {
			return r2;
		}
	}
	
	public boolean larger(CRational r) {
		if((n*r.d)>(r.n*d)) {
			return true;
		}else {
			return false;
		}
	}

}


public class Hw9_10 {
	public static void show(CRational x) {
		System.out.println(x.n+"/"+x.d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRational aaa=new CRational();
		aaa.setN(2);
		aaa.setD(5);
		show(aaa);
		System.out.println("-----------------");
		System.out.print("NO.1：");
		aaa.setND(4, 23);
		show(aaa);
		
		CRational bbb=new CRational();
		System.out.print("NO.2：");
		bbb.setND(7,29);
		show(bbb);
		System.out.print("+：");
		show(bbb.add(aaa));
		System.out.print("-：");
		show(bbb.sub(aaa));
		System.out.print("*：");
		show(bbb.mul(aaa));
		System.out.print("/：");
		show(bbb.div(aaa));
		
		System.out.print("which's bigger：");
		show(CRational.compare(aaa, bbb));
		
		System.out.print(aaa.larger(bbb));
		
	}

}
