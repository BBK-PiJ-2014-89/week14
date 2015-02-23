import java.util.ArrayList;
import java.util.List;

public class Hailstone {
	public static List<Integer> Collatz(int n){
		List<Integer> intList=new ArrayList<Integer>();
		while(n!=1){
			intList.add(n);
			if(n%2==0){
				n=n/2;
			}else {
				n=3*n+1;
			}
		}
		intList.add(1);
		return intList;
	}

	public static void main(String[] args) {
		System.out.println(Collatz(58));
	}

}
