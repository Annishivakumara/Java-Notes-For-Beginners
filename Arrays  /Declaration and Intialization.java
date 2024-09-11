
1    First Approch
public class main
{
public static void main(String [] args)
{
String [] arr= new String [3] { "PYTHON", "SHIVU" , "SUM"};
System.out.println(arr[0]);
}
}

out put :-
 * Eror becuse  it's not  possible to definr both size and value
 * Either we can Define the size or values  but  defining both is not possible

 2    Second Approch 
 Accesing  Element by using for Loop 

public class Myclass
{
public static void main(String [] args)
{
String [] arr= {"python" , "java", "c"};
for(int i=0;i<=3;i++){
System.out.println(arr[i]+"\t");
}
}

out  put
Python 
