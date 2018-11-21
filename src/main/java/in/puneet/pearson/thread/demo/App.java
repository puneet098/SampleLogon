package in.puneet.pearson.thread.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.puneet.pearson.thread.ch2.MyRunnable;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	/*MyThread t1= new MyThread("A");
    	MyThread t2 = new MyThread("B");
    	((Thread) t1).start();
    	((Thread) t2).start();*/
    	//This is runnable example let's see
    	MyRunnable mr = new MyRunnable();
    	Thread t3= new Thread(mr);
    	t3.setName("c");
    	
    	Thread t4 = new Thread(mr);
    	t4.setName("d");
    	
    	Thread t5 = new Thread(mr);
    	t5.setName("e");
    	
    	t3.start();
    	t4.start();
    	t5.start();
        System.out.println( "Hello World!" );
    }
}
