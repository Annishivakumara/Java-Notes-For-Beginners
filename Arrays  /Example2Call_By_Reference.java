class Myclass{
public void math(int [] a)
{
System.out.println("BEFORE MODIFICATION " +a[0]);
a[0]=11;
System.out.println("AFTER MOFIFICATION "+a[0]);
}
}
public class main{
public static void main(String [] args){
int [] n= {10,20,30,40};

System.out.println("BEFORE MODIFICATION " +n[0]);
Myclass ob1= new Myclass ();
ob1=meth(n);
System.out.println("AFTER MOFIFICATION "+n[0]);
}
}
