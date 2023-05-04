package week1.day1;

public class PrintFibbinocci {

	public static void main(String[] args) {
	int firstnum=0,secondnum=1,sum,i;
	System.out.println(firstnum);
	System.out.println(secondnum);
	for (i=2;i<=11;i++) {
		sum=firstnum+secondnum;
		firstnum=secondnum; 
		secondnum=sum; 
		System.out.println(""+sum);
	}

	}

}
