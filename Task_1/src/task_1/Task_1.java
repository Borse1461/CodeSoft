package task_1;
import java.util.Random;
import java.util.Scanner;

class Number_Game{
    public static void guess(){
        int score=0;
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("A number is chosen randomaly number between 0 to 100. You have to guss the number. You have 5 trials");
        for(int i=1;i<=5;i++){
            int random_no=rand.nextInt(100);
            System.out.println("Atempt "+i+" Enter number ");
            int guess_no=sc.nextInt();
            if(guess_no>random_no){
                System.out.println("Greater than actual number");
            }
            else if(guess_no<random_no){
                System.out.println("Less than actual number");
            }
            else{
                System.out.println("Congrats!!!");
                score=score+2;
            }
        }
        if(score<5){
            System.out.println("Looser... Total Score is "+score);
        }
        else if(score>=5&&score<=8){
            System.out.println("Ok... Total Score is "+score);
        }
        else if(score>=8){
            System.out.println("Winner... Total Score is "+score);
        }
}
}
public class Task_1 {

    public static void main(String[] args) {
        Number_Game n=new Number_Game();
        n.guess();
    }
    
}
