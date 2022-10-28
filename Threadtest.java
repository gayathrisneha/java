package thread.in;
class thread1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Thread name="+Thread.currentThread()+"i="+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Threadtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      thread1 ob = new thread1();
      ob.setName("sneha");
      thread1 ob2 = new thread1();
      ob2.setName("gayathri");
      ob.start();
      ob.join();
      ob2.start();
	}

}
