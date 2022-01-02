class Printer{
	//synchronized void printDocuments(int num, String docName) {
	void printDocuments(int num, String docName) {
		for(int i = 1;i <= num; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing document: "+ docName +" "+ i);
		}
	}
}

class MyThread extends Thread{
	
	Printer pRef;
	
	MyThread(Printer p){
		pRef = p;
	}
	
	@Override 
	public void run() {
		synchronized(pRef) {
			pRef.printDocuments(10, "John's profile.pdf");	// This is acquiring the lock as a code block
		}
		
	}
}

class YourThread extends Thread{
	
	Printer pRef;
	
	YourThread(Printer p){
		pRef = p;
	}
	
	@Override 
	public void run() {
		pRef.printDocuments(10, "Fiona's profile.pdf");	
	}
}

public class SyncApp {

	//Main is representing main method
	public static void main(String[] args) {

		System.out.println("== Application Started ==");
		
		//We have only one single object of Printer
	    Printer printer = new Printer();
	    //printer.printDocuments(10, "JavaDocs.pdf");
	    
	    
	    //Scenario is that we have multiple threads working on the same Printer object
	    //If multiple threads are going to work on the same single Object we must Synchronize them
	    MyThread mRef = new MyThread(printer); //MyThread is having reference to Printer Object
		mRef.start();
		/* try {
			mRef.join(); -> Rather than using a join we can use the synchronized keyword in the printDocuments method
		} catch (InterruptedException e) {
			 TODO Auto-generated catch block 
			e.printStackTrace();
		}
		*/
		YourThread yRef = new YourThread(printer);
		yRef.start();
	    
		System.out.println("== Application Finished ==");
	}

}
