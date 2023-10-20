package exceptionHandling;

public class Stackoverflowerror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task1 t = new Task1();
		t.a();
	}

}
class Task1 {
	public void a() {
		b();
	}
	public void b() {
		a();
	}
}