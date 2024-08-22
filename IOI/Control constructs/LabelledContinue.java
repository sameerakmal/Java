public class LabelledContinue
{
	public static void main(String[] args) {
		outer : for (int i = 1;i <= 5;i++){
		   inner :  for (int j = 1;j <= 5;j++){
		        if( i == 3 && j >= 2 && j <= 4){
		            continue outer;
		        }
		        System.out.print(j);
		    }
		    System.out.println();
		} 
	}
}