package cse360assign2;



public class Calculator {

	private int total;
	private int totalstring;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return 0;
		
	}
	
	public void add (int value) {
		total = total + value;
	}
	
	public void subtract (int value) {
		total = total - value;
	}
	
	public void multiply (int value) {
		total = total * value;
	}
	
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else{
		total = total / value;
		}
	}
	
	public String getHistory () {
		return "";
	}
}
