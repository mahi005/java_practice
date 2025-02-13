package com.runtime.polymorphism;

public class Mainclass3 {
public static void main(String[] args) {
	TestEngineer ref;
	ref = new ManualTestEngineer();
	ref.test();
	
	ref = new AutoMationTestEngineer();
	ref.test();
	
	TestEngine.runTest(new ManualTestEngineer());
	
	TestEngine.runTest(new AutoMationTestEngineer());
	
}
}
