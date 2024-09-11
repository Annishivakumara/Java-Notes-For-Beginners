import java.util.*;

public class Foreachloop
{
public static void main(String [] args)
{
Scanner sc= new Scanner(System.in);
int size=sc.nextInt();
String [] arr= new String[size];
for(String s:arr)
{
System.out.println(s+"\t");
}
}
}
