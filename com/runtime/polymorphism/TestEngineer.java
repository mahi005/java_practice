package com.runtime.polymorphism;

class TestEngineer {
void test() {
	
	}
}
class ManualTestEngineer extends TestEngineer{
	void test() {
		System.out.println("manual");
	}
}

class AutoMationTestEngineer extends TestEngineer{
	void test() {
		System.out.println("AutoMationTest");
	}
}
