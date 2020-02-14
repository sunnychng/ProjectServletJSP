package model;

import java.text.DecimalFormat;

public class ConvertTemperature {

	private double userC;
	private double userF;
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	public ConvertTemperature() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ConvertTemperature(double userC, double userF) {
		super();
		this.userC = userC;
		this.userF = userF;
	}

	public double getUserC() {
		return userC;
	}

	public void setUserC(double userC) {
		this.userC = userC;
	}
	
	public double getUserF() {
		return userF;
	}

	public void setUserF(double userF) {
		this.userF = userF;
	}
	
	public double convertToCelsius(double userC) {
		return ((9*userC)/5)+32;
	}
	
	public String displayCelsiusResult() {
		String s = df.format(convertToCelsius(userC));
		return s;
	}
	
	public double convertToFahrenheit(double userF) {
		return (userF-32)*5/9;
	}
	
	public String displayFahrenheitResult() {
		String s = df.format(convertToFahrenheit(userF));
		return s;
	}
	
}
