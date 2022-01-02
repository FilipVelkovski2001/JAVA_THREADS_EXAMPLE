
public class MyTaskWThread extends Thread {

	// With thread implemented
	@Override
	public void run() {
		for(int doc = 1; doc <= 10; doc++) {
			System.out.println("Printing document #" + doc + " Printer 2");
		}
		
	}

}
