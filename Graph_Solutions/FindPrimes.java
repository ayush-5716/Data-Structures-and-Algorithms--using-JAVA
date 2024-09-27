import java.util.Scanner;

public class FindPrimes{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		
		for(int i=1; i < range ; i++ ){
			if( isPrime(i) ) {
				System.out.print( i  + " " );
			}
		}
		
	}
	
	public static boolean isPrime(int n){
		// Corner case
        if (n <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;

	}

}
