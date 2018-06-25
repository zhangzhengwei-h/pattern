package com.zhang.decorator;

public class FouthGradeSchoolReport extends SchoolReport{

	@Override
	public void report() {
		System.out.println("report: .............");
	}

	@Override
	public void sign() {
		System.out.println("sign: .........");
	}
	
}
