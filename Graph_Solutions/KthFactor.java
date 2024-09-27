public class KthFactor{
	public static void main(String args[]){
		int n = 4;
		int k = 4;
		System.out.println( findKthFactor( n , k ));
		
	}
	
	public static int findKthFactor(int n, int k ){

		int nth =  0;
		for( int i= 1 ; i <= n ; i++){
			if( n%i == 0 ) {
				nth++;
				if( nth == k) return i; 
			}			
		}
		return -1;
		
		
	}
}