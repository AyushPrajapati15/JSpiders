package com.jsp.model;

public class Engine {
	private int cc;
	private String gas;
	private int noOfPiston;
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getGas() {
		return gas;
	}
	public void setGas(String gas) {
		this.gas = gas;
	}
	public int getNoOfPiston() {
		return noOfPiston;
	}
	public void setNoOfPiston(int noOfPiston) {
		this.noOfPiston = noOfPiston;
	}
	
	
	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", gas=" + gas + ", noOfPiston=" + noOfPiston + "]";
	}
	
	

}
