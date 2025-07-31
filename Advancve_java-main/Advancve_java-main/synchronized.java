class Reserve{
     public void book(String name , int seat){
         System.out.println(name+" seat Bookes "+seat);
     }
}
class BookThread extends Thread{
     Reserve r;
     String name;
     int seat;
     public BookThread(Reserve r , String name , int seat){
         this.r=r;
         this.name=name;
         this.seat=seat;
     }
     public void run(){
         synchronized(r){
             r.book(name, seat);
         }
     }
}
public class Main{
    public static void main(String [] args){
        Reserve r=new Reserve();
        BookThread b1= new BookThread(r,"SHIVU",3);
        BookThread b2=new BookThread(r,"SHAHSI", 4);
        b1.start();
        b2.start();
    }
}
