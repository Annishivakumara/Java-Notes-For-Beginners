class dubba {
    int dosaNo;
    public void put(int dosaNo){
        this.dosaNo=dosaNo;
        System.out.println("PUT DOSA"+dosaNo);
    }
    public void get(){
        System.out.println("GOT DOSA"+dosaNo);
    }
}
class DasaMaster  implements Runnable{
    dubba dubba;
    DasaMaster(dubba bubba){
        this.dubba=dubba;
        new Thread(this, "Master Thread").start();
    }
    public  void run(){
        int  dubbaNo=0;
        while (true)
        dubba.put(++dubbaNo);
    }
}
class suppleir  implements Runnable{
    dubba dubba;
    suppleir(dubba bubba){
        this.dubba=bubba;
        new Thread(this, "Suplier Thread").start();
    }
    public void run(){
        while(true)
        dubba.get();
    }
        
}
public class Main{
    public static void main(String [] args){
    dubba b= new dubba();
    new DasaMaster(b);
    new suppleir(b);
    }
}
