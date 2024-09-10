import java .util.*;
public class  Seriesofnumbers{
public static void main(String [] args){
Scanner sc= new Scanner (System.in);
// class intialization

int num=sc.nextLine(),i=1;
//looping 

while(i<=num){
num=num+i;
System.out.println(num);
num--;
}
}}
