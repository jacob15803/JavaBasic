import java.util.*;
class sl extends Thread{
    public void run(){
        hello t1=new hello();
        
        world t2=new world();
        t2.start();
        t1.start();
    }

}
class hello extends Thread{
    public void run(){
        for(int i =0;i<5;i++)
         {try{
        Thread.sleep(500);}
        catch(Exception e){

        }
        System.out.println("Hello");}
        

    }
}

class world extends Thread{
    public void run(){
        for(int i =0;i<5;i++)
         {try{
        Thread.sleep(1000);
        }
        catch(Exception e)
        {

        }
        System.out.println("World");}
       
    }
}

class Mthread{
  public static void main(String[] args) {
    sl t1=new sl();
    t1.start();
        
    }
}
