package java8f;

interface A {
	void show();
}

public class LambdaDemo {

	public static void main(String[] args) {
		A obj;

		obj = new A() {
			public void show() {
				System.out.println("hello");
			}
		};

		obj = () -> System.out.println("hello");
		// (i)->System.out.println("hello"+i);
		obj.show();
	}

}
