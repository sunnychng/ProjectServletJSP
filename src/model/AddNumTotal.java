package model;

import java.text.DecimalFormat;

public class AddNumTotal {
	
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private double total;
	private double average;
	
	public AddNumTotal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddNumTotal(int num1, int num2, int num3, int num4) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		setTotal(total);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
		calculateTotal(total);
	}

	public double calculateTotal(double total) {
		this.total = num1 + num2 + num3 + num4;
		return total;
	}
	
	public double calculateAverage(double total) {
		this.average = total / 4;
		return average;
	}
	
	public double displayAverage() {
		//DecimalFormat df = new DecimalFormat("#.##");
		//String s = df.format(calculateAverage(total));
		//return s;
		return calculateAverage(Math.round((total) * 10.0) / 10.0);
	}

	@Override
	public String toString() {
		/*return "AddNumTotal [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", total=" + setTotal(num1, num2, num3, num4)
				+ ", average=" + average + ", getNum1()=" + getNum1() + ", getNum2()=" + getNum2() + ", getNum3()="
				+ getNum3() + ", getNum4()=" + getNum4() + "]";
		*/
		
		//return "AddNumTotal [total= ," + setTotal(num1, num2, num3, num4) + "]";
		return "Total = " + getTotal();
	}
	
}
