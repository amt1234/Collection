package thread;

public class ThreadExtend {

	
	public static void main(String[] args) {
		Mythread1 mt=new Mythread1();
		mt.start();
		
		mt.run();//by doing this same stack is allowed not differednt
		

	}

}
