public class PracticeProblem {

	public static void main(String args[]) {

	}

public static int sumOfDigits(int x){
	x = Math.abs(x);
if (x<10){
	return x;
}

	return sumOfDigits(x/10) + sumOfDigits(x%10);
}
	
public static int factorial(int n){
	if (n == 0){
		return 1;
	}
if (n<0){
	return 0;
}
	return factorial(n-1)*n;
}

}
