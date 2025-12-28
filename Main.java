
class A extends Thread{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("Hello hi");
			try {
				Thread.sleep(10);	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Ok Bye");
			try {
				Thread.sleep(10);	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		
		b1.start();
		a1.start();
		
		try {
			a1.join();
			b1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Both Thread finished");
		}
	}
}
