
//public class MyTaskWThreadTwo extends CA extends Thread -> Error Multiple Inheritance is not supported in Java
public class MyTaskWThreadTwo extends CA implements Runnable { // -> What we do instead is we extend a class and use the interface Runnable to make a Thread.
	

	@Override
	public void run() {
		for(int doc = 1; doc <= 10; doc++) {
			System.out.println("^^ Printing document #" + doc + " Printer 3");
		}

	}

}
