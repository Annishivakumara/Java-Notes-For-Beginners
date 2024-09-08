import java .util.*;

           public class   Gamingapplyance{
                   public static  void main(String [] args){

                   Scanner sc= new Scanner(System.in);
                  String  option;
          System.out.println("Enter the number");
          int num=sc.nextInt();
          do{

          if(num!=0){
            System.out.println("Positive Number");
             }
            else{
            System.out.println("Nagitive Number");
                  }
             System.out.println(" Play again ");
             option=sc.next();
             }while(option.equals("Yes"));

             System.out.println("Thank you for playing this game");
               }}
