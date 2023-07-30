//1ST WAY BY EXTENDING THREAD

// class mythread extends Thread{
//  public void run()
//     {
//         int i=10;
//         while(i<20)
//         {
//         System.out.println("cokkie");
//         i++;
//         }
//     }

// }
// class netflix extends Thread{
//     public void run()
//     {
//         int i=10;
//         while(i<20)
//         {
//         System.out.println("runnig");
//         i++;
//         }
//     }
// }

// public class threadd{
//     public static void main(String[] args) {
//         mythread t1=new mythread();
//         netflix t2=new netflix();
//         t1.start();
//         t2.start();
//     }
// }

//2nd way by implementing intrface.

// class thread1 implements Runnable{
// public void run()
// {
//     int i=1;
//     while(i<20)
//     System.out.println("thread ");
//     i++;
// }
// }

// class thread2 implements Runnable{
// public void run()
// {
//     int i=1;
//     while(i<20)
//     System.out.println("thread 2");
//     i++;
// }
// }

// public class threadd{
//     public static void main(String[] args) {
//         thread1 bullet1=new thread1();
//         Thread gun1=new Thread(bullet1);

//         thread2 bullet2=new thread2();
//         Thread gun2=new Thread(bullet2);

//         gun1.start();
//         gun2.start();
        
//     }
// }

//constructors in threads

class th extends Thread{
    public th(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("i am a thread");
    }
}

public class threadd{
    public static void main(String[] args) {
        th t=new th("harry");
 t.start();
    }
}

//getid() is also a method

//PRIORITY IN THREADS
// class th extends Thread{
//     public th(String name)
//     {
//         super(name);
//     }
//     public void run()
//     {
//         int i=1;
//         while(i<20)
//         {
//         System.out.println("kartik");
//         i++;
//         }
//         try {
//                 Thread.sleep(10000);
//         } catch (Exception e) {
//            System.out.println(e);
//         }
    
   
//     }
// }

// class th1 extends Thread{
//     public void run()
//     {
//         int i=1;
//         while(i<20)
//         {
//         System.out.println("dnaish");
//         i++;
//         }
   
//     }
// }


// public class threadd{
//     public static void main(String[] args) {
        // th t=new th("harry");
        // th1 t3=new th1();
        // t3.setPriority(Thread.MAX_PRIORITY);
        // t.start();
        // try {
        // t.join(); 
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // t3.start();

//     }
// }
