
public class Pattern34
{   
	public static void main(String[] args) {
		int odd = 2;
		int n = 6;
		for(int i = 1; i<=n;i++){
		        int ans = 0;
		        int even = 2*((n-1)-i+1)-1 + 2;
				int num = 0;
				int a = 0;
				
		       
		    for(int j = 1; j<=i;j++){
		       
		        if(j == 1){
		            ans = i;
		            System.out.print(ans+" ");
		        }
		        else if(j % 2 == 0){
		            ans += even;
		            System.out.print(ans+" ");
		        }
		        else{
                    if(j == 3){
                        ans = ans + odd;
		                System.out.print(ans+" ");
						a = odd;
                        odd = odd + 2;	
                    }
                    else{
						num = a - 4;
                        ans = ans + num;
                        System.out.print(ans+" ");
						a = num;
                    }    
		        }  
		    }
		    System.out.println();
		}
	}
}
