
public class GenericMain {

	public GenericMain() {
		
//		ProductVO vo1 = new ProductVO();
//		vo1.setProductName("컴퓨터");
//		
//		vo1.setProductName(new MemberVO(1234, "강짱구", "기획부", "010-1234-1234"));
//		
//		MemberVO vo = (MemberVO)vo1.getProductName();
//		System.out.println(vo.toString());
		
		ProductVO<MemberVO> vo1 = new ProductVO<MemberVO>();
		ProductVO<String> vo2 = new ProductVO<String>();
		
		vo1.setProductName(new MemberVO());
		// vo1.setProductName(new String()); // 에러
		
		vo2.setProductName("냉장고");
		// vo2.setProductName(new MemberVO()); // 에러
	}
	
	public void start() {
		
	}
	
	public static void main(String[] args) {
		new GenericMain().start();
	}
}
