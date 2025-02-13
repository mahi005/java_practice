package com.runtime.polymorphism;

class Facebook{
	void display() {
		System.out.println("okay report");
	}
}

class Facebookmobile extends Facebook{
	void display() {
		System.out.println("2 okay");
	}
}

class Facebookwebsite extends Facebook{
	void display(){
		System.out.println("3 okay");
	}
}

class DisplayAdapter{
	static void adapt(Facebook fb) {
		if(fb != null) {
			fb.display();
		}
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Facebook fb;
		fb=new Facebookmobile();
		fb.display();
		fb=new Facebookwebsite();
		fb.display();
		
		DisplayAdapter.adapt(new Facebookmobile());
		DisplayAdapter.adapt(new Facebookwebsite());
	}
}
