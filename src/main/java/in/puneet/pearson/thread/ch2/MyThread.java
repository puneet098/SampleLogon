/**
 * 
 */
package in.puneet.pearson.thread.ch2;

/**
 * @author user
 *
 */
public class MyThread extends Thread {
	
	private Person myPerson;
	private String nam;
	private LazyInitRase lir = new LazyInitRase();
	
	public  MyThread(String name) {
		this.myPerson = lir.getPerson() ;
		this.nam = name;
		myPerson.setName("Puneet");
	}
	public void run() {
		System.out.println("Thread running .."+nam+myPerson.getName());
	
	}
}
 