package junittest;

public class Calculator {
	public int sum(int num1) {
		return num1 + 39;
	}
	
	public int subt(int num1) {
		return num1 - 2;
	}
	
	public int div(int num1) {
		return num1 / 3;
	}
	
	public boolean isNumber(String strNum) {
		if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
