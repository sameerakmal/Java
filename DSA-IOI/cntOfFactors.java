public class cntOfFactors
{
	public static void main(String[] args) {
		int n = 16;
		int cnt = 0;
		for(int i = 1; i <= Math.sqrt(n); i++){
		    if(n % i == 0){
		        if(i == n / i) cnt++;
		        else cnt+= 2;
		    }
		}
		System.out.println(cnt);
	}

    boolean checkPrime(int n){
        if
    }
}