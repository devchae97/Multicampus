
public class SubTest extends SuperTest{

	public SubTest(int a) {
		super(a);
	}
	
	public SubTest() {
//		a = 10;
//		this.a = 10;
//		super.a = 10;
		
		// this(10)과 super(10)은 첫 행에 써야함
		// this(10);
		super(10);
		System.out.println("super.a -> " + super.a);
	}
	
	public static void main(String[] args) {
		SubTest st = new SubTest();
		System.out.println(st.a);
	}
}
