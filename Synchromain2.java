package thread.in;
class PrintTable1{
	void multiplicationTable(int num) {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}}
		System.out.println("This block is not synchronized"+Thread.currentThread());
	}
}

public class Synchromain2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		PrintTable1 t=new PrintTable1();
		Thread t1=new Thread() {
			public void run() {
				t.multiplicationTable(4);
			}
		};
		t1.start();
		Thread t2=new Thread() {
			public void run() {
				t.multiplicationTable(2);
			}
		};
		t2.start();
		Thread t3=new Thread() {
			public void run() {
				t.multiplicationTable(5);
			}
		};
		t3.start();

	}
}

	


