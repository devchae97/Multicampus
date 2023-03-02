package basic02_api;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String name = "채한준";
		String name2 = "채한준";
		String addr = new String("서울시 서초구 서초동");
		String addr2 = new String("서울시 서초구 서초동");
		
		// == : 비교하고자 하는 두 개 대상의 주소값을 비교
		if(name==name2) {
			System.out.println("name과 name2는 동일하다.");
		}else {
			System.out.println("name과 name2는 다르다.");
		}
		// 동일하다.
		
		if(addr==addr2) {
			System.out.println("addr과 addr2는 동일하다.");
		}else {
			System.out.println("addr과 addr2는 다르다.");
		}
		// 다르다., 객체의 주소가 서로 다르다.
		
		String addr3 = addr2;
		if(addr2==addr3) {
			System.out.println("addr2와 addr3는 동일하다.");
		}else {
			System.out.println("addr2와 addr3는 다르다.");
		}
		// 동일하다. 객체의 주소가 서로 같다.
		
		//--------------------------------------------------
		
		// equals() : 객체내의 값을 비교 (대소문자 구별)
		String addr4 = new String("서울시 서초구 서초동(dong)");
		String addr5 = new String("서울시 서초구 서초동(Dong)");
		boolean boo = addr5.equals(addr4); // = addr4.equals(addr5)
		
		if(boo) {
			System.out.println("addr4 와 addr5는 동일하다.");
		}else {
			System.out.println("addr4 와 addr5는 다르다.");
		}
		// addr4 와 addr5는 다르다. 대소문자가 다르다.
		
		// equalsIgnoreCase() : 값을 비교해준다. (대소문자 구별 X)
		if(addr4.equalsIgnoreCase(addr5)) {
			System.out.println(("동일하다. (대소문자 구별X)"));
		}else {
			System.out.println("다르다. (대소문자 구별O)");
		}
		// 동일하다. (대소문자 구별X)
		
		//--------------------------------------------------
		
		String str = "A";
		str = str + "B";
		String str2 = str + 100;
		
		System.out.println("charAt() -> " + addr4.charAt(5)); // 초, index 위치의 문자를 반환
		System.out.println("concat() -> " + addr4.concat(name)); // 서울시 서초구 서초동(dong)채한준, 문자연결
		addr4 = addr4.concat(name);
		System.out.println("concat() -> " + addr4.concat(name)); // 서울시 서초구 서초동(dong)채한준채한준
		
		String txt = "Hello!";
		byte txtCode[] = txt.getBytes(); // getBytes() : 문자열을 인코딩된 Byte형태로 넘겨준다. default charset
		System.out.println(Arrays.toString(txtCode)); // [72, 101, 108, 108, 111, 33]
		// 아스키코드 H:72, e:101, l:108, o:111, !:33
		
		int idx = addr4.indexOf("서"); // 서울시 서초구 서초동(dong)채한준
		System.out.println("indexOf -> " + idx); // 0
		System.out.println("lastIndexOf -> " + addr4.lastIndexOf("서")); // 8
		System.out.println("indexOf -> " + addr4.indexOf("서",5)); // 8, index5 이후로 서를 찾아라
		System.out.println("indexOf -> " + addr4.indexOf("강남구")); // -1, 없는 문자일때 -1
		System.out.println("length -> " + addr4.length()); // 20
		System.out.println(("repeat -> " + addr4.repeat(4))); // 서울시 서초구 서초동(dong)채한준 X4
		System.out.println("*".repeat(50)); // * X50
		
		addr4 = addr4.replaceAll("서초구", "SeoChoGu");
		System.out.println("replaceAll -> " + addr4); // replaceAll -> 서울시 SeoChoGu 서초동(dong)채한준
		
		String tel = "010---1234-5678";
		String telSplit[] = tel.split("-");
		System.out.println(Arrays.toString(telSplit)); // [010, , , 1234, 5678]
		
		// substring : 문자열에서 일부의 문자열을 얻을 때
		//							 0123456789012345678
		String addrsub = new String("Seoul SeoChoGu 서초동");
		String sub1 = addrsub.substring(6, 14); // 시작위치 6, 끝 위치 14 앞
		System.out.println("substring(int,int) -> " + sub1); // SeoChoGu
		String sub2 = addrsub.substring(10);
		System.out.println("substring(int) -> " + sub2); // hoGu 서초동, 시작위치 10, 끝까지 구한다
		
		System.out.println("lower -> " + addrsub.toLowerCase()); // seoul seochogu 서초동, 문자열을 소문자로 변환해 반환
		System.out.println("upper -> " + addrsub.toUpperCase()); // SEOUL SEOCHOGU 서초동, 문자열을 대문자로 변환해 반환
		
		String x = String.valueOf(2500) + 500; // 객체를 String으로 형변환
		System.out.println(x); // 2500500
		
		char c[] = {'J', 'a', 'v', 'a'}; // "Java"
		System.out.println(c); // Java
		System.out.println(String.valueOf(c)); // Java
		
		int d[] = {23,45,67,88};
		System.out.println(d); // [I@4361bd48, 주소값
		
		String data = "		Test		Programming		";
		System.out.println("data -> " + data.trim() + "?"); // 양쪽 끝의 공백문자 지우기
	}
}
