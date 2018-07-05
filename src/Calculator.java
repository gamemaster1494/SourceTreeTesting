import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	private List<String> history = new ArrayList<String>();
	
	public String getLastOperation(){
		//TODO: Complete method
		return "NOT DONE";
	}
	
	public String[] getHistory(int num){
		//TODO: Complete method;
		String[] theHistory = new String[num];
		
		return theHistory;
	}
	
	public int add(int x, int y) {
		int result = x + y;
		history.add(x + " + " + y + " = " + result);
		return result;
	}
	
	public int subtract(int x, int y) {
		int result = x - y;
		history.add(x + " - " + y + " = " + result);
		return result;
	}
	
	public int divide(int x, int y) {
		int result = x / y;
		history.add(x + " / " + y + " = " + result);
		return result;
	}
	
	public int multiply(int x, int y) {
		int result = x * y;
		history.add(x + " * " + y + " = " + result);
		return result;
	}


	public double add(double x, double y) {
		double result = x + y;
		history.add(x + " + " + y + " = " + result);
		return result;
	}
	
	public double subtract(double x, double y) {
		double result = x - y;
		history.add(x + " - " + y + " = " + result);
		return result;
	}
	
	public double divide(double x, double y) {
		double result = x / y;
		history.add(x + " / " + y + " = " + result);
		return result;
	}
	
	public double multiply(double x, double y) {
		double result = x * y;
		history.add(x + " * " + y + " = " + result);
		return result;
	}
	
	public long add(long x, long y) {
		long result = x + y;
		history.add(x + " + " + y + " = " + result);
		return result;
	}
	
	public long subtract(long x, long y) {
		long result = x - y;
		history.add(x + " - " + y + " = " + result);
		return result;
	}
	
	public long divide(long x, long y) {
		long result = x / y;
		history.add(x + " / " + y + " = " + result);
		return result;
	}
	
	public long multiply(long x, long y) {
		long result = x * y;
		history.add(x + " * " + y + " = " + result);
		return result;
	}
}
