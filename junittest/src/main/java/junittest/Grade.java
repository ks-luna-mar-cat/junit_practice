package junittest;

public class Grade {
	public char calGrade(int n) {
		if(n <= 100 && n >= 90) return 'A';
		else if (n >= 80) return 'B';
		else if (n >= 70) return 'C';
		else if (n >= 60) return 'D';
		else return 'F';
	}
	
	public int sum(int n) {
		int total = 0;
		int last = n;
		
		if(n < 0) last = -n;
		for (int i = 1; i <= last; i++)
			total = total + i;
		if(n < 0) total = -total;
		return total;
	}
}
