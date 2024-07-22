import java.util.Scanner;

class guesser{
    int gnum;
      int guessingnum()
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("guesser,kindly guess a number.");
        gnum = scan.nextInt();
        return gnum;

     }
}

class player{
    int pnum;
    int predictingnum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("player,kindly predict a number.");
        pnum = scan.nextInt();
        return pnum;        
    }
}

class umpire{
    int numfromg;
    int numfromp1;
    int numfromp2;
    int numfromp3;
    void finalg()
    {
        guesser g = new guesser();
        numfromg = g.guessingnum();
    
    }
    void finalp()
    {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        numfromp1 = p1.predictingnum();
        numfromp2 = p2.predictingnum();
        numfromp3 = p3.predictingnum();
    }
    void compare()
    {
        if(numfromg == numfromp1){
            System.out.println("player 1 wins");
        }
        else if(numfromg == numfromp2){
            System.out.println("player 2 wins");
        }
        else if(numfromg == numfromp3)
        {
            System.out.println("player 3 wins");
        }
    }
}
class LaunchGame{
    public static void main(String[] args) {
        umpire u = new umpire();
        u.finalg();
        u.finalp();
        u.compare();

    }
}
