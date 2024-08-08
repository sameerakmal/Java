public class Pattern30 {
	public static void main(String[] args) {
		for (int i = 1;i<= 5 ;i++ ) {
		    for(int k = 1;k<= 5-i;k++){
		        System.out.print(" ");
		        
		    }
		    for(int j = 1; j <= i; j++){
		        System.out.print(j);
		    }
		    for(int j = i-1; j >= 1; j--){
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
