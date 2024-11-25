public class Pattern33
{
	public static void main(String[] args) {
		int ans = 0;
		int n = 10;
		for(int i = 1; i<=n;i++){
		        
		        int even = 2*(n-i+1)-1;
		        int odd = 2*i-1;
		        
		    for(int j = 1; j<=10;j++){
		       
		        if(j == 1){
		            ans = i;
		            System.out.print(ans+" ");
		        }
		        else if(j % 2 == 0){
		            ans += even;
		            System.out.print(ans+" ");
		        }
		        else{
		            ans += odd;
		            System.out.print(ans+" ");
		        }
		        
		    }
		    System.out.println();
		}
	}
}
