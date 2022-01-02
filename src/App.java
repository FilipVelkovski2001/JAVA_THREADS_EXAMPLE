
public class App {

	// Main method represents main thread
	public static void main(String[] args) {
		// Whatever we write in here will be executed by the main thread
		// Execution Context 
		// Threads always execute code in a sequence 
		
		// Job1
		System.out.println("== Application Started! ==");
		
		// Job 2 Without a Thread
		// MyTask task = new MyTask();
		// task.executeTask();
		
		// Job 2 With a Thread
		
		MyTaskWThread task = new MyTaskWThread(); // -> Child Thread / Worker Thread
		task.start(); // -> .start() shall internally execute run() method
		
		// Till Job 2 is not finished, below written jobs are waiting and are not executed 
		// In case Job 2 is a long running operation, i.e. several documents are supposed to be printed 
		// In such case OS/JVM shall give a message that app is not responding 
		// Some sluggish behaviour in app can be observed -> App seems to hang 
		
		// Now main() and MyTaskWThread() are executing both parallely or concurrently!!
		// When you run a threads they are going to wirk paralelly with the main method!
		
		// Job 3
		// Running a thread with the Runnable Interface
		Runnable r = new MyTaskWThreadTwo();
		Thread taskTwo = new Thread(r);
		taskTwo.start();
		
		// Job 4
		// Some code to print documents
		
		for(int doc = 1; doc <= 10; doc++) {
			System.out.println("Printing document #" + doc + " Printer 1");
		}
		
		// Job 3
		System.out.println("== Application Finished ==");

	}

}
