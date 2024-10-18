package before1018;
abstract class A{
	public abstract int b(); //멤버중에 하나라도 abstract이면 추상 클래스가 된다.
	
	
public void d() {
	System.out.println("Hello World");
}
public abstract int c{
	
}

}
class B extends A{
	public int b () {
		return 1;
	}
	
}
public class Ex01 {
	B obj = new B();
}
