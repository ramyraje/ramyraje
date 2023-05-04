package week1.day1;


public class IsPrime {

	public static void main(String[] args) {
	//Scanner sc= new Scanner(System.in);
	int num = 28;
	boolean b= false;
	for (int i=2; i<num; i++) {
		if (num%i==0) {
			b=true;
			break;
		}
	}
	if (b==false) {
		System.out.println(num + " is prime");
		
	}
		
	else {
		System.out.println(num + " is not prime");
	}
	}

}
