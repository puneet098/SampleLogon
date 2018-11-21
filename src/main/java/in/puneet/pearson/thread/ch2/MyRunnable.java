/**
 * 
 */
package in.puneet.pearson.thread.ch2;

/**
 * @author user
 *
 */
public class MyRunnable implements Runnable {
	
	@SuppressWarnings("unused")
	private String tName;

	
		

	/**
	 * @param tName the tName to set
	 */
	public void settName(String tName) {
		this.tName = tName;
	}




	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for(int x =0; x<10 ; x++) {
			System.out.println("Run by "+ Thread.currentThread().getName() +" x = "+x
					+"Thread Name State :" +Thread.currentThread().getState()
					+"Thread Alive state: "+ Thread.currentThread().isAlive());
			
		}

	}

}
