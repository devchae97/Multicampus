import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		
	}
	
	public void start() {
		
		//input, output
		//input(byte), reader(문자) 단위로 읽어온다
		
		try {
			//byte단위 문자를 입력받기
			InputStream in = System.in;
			
//			while(true) {
//				int inData = in.read(); // -1 : 읽은값이 없을때
//				if(inData==-1) break;
//				System.out.println((char)inData);
			
			// read(byte[] a)
			byte data[] = new byte[10];
			int cnt = in.read(data);
			System.out.println("cnt -> " + cnt);
			System.out.println("text -> " + new String(data, 0, cnt-2));
			
		}catch(IOException ie) {
			System.out.println("입력에러 발생");
		}
	}
	
	public static void main(String[] args) {
		new InputStreamTest().start();
	}
}
