  for(int j = 0; j < n; j++){
                if(j == 0 || j == n-1 || (((i == j) || (i + j == n-1)) && i <= 3)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
