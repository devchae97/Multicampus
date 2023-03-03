
public class TestClassMain {

	public static void main(String[] args) {
		ClassTest ct = new ClassTest();

		ClassTest ct2 = new ClassTest(5000);
	
		ClassTest ct3 = new ClassTest("½ÅÂ¯±¸", 10);
	
		ClassTest ct4 = new ClassTest(99, "½ÅÂ¯¾Æ");
		
		// °´Ã¼ ³» ¸Þ¼Òµå¸¦ È£Ãâ : °´Ã¼¸í.¸Þ¼Òµå¸í
		ct.sum();
		System.out.println(ct2.total(50));
		
		// °´Ã¼ ³»ÀÇ ¸âº­º¯¼ö¿¡ Á¢±Ù
		// °´Ã¼¸í.¸â¹öº¯¼ö
		System.out.println("ct2.num -> " + ct2.num);
		System.out.println("ct3.MAX -> " + ct3.MAX); // Math.Pi
	}
}
