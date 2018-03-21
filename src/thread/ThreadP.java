package thread;

public class ThreadP {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadS s=new ThreadS();
		
		Thread t=new Thread(s);
		Thread t1=new Thread();
		t.start();
		t1.start();
		t.sleep(1000);
		
		t.getName();
		t1.setName("main thread");
		t1.setPriority(1);
		
		System.out.println("thread name t "+t);
		System.out.println("thread name t1 "+t1);
		System.out.println(Thread.currentThread().getPriority());
		

	}

}

class ThreadS implements Runnable
{

	@Override
	public void run() {
		System.out.println("concurrent threads starting running...");
		
	}
	
}
