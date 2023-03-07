import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectOutputStreamTest {
	
	public ObjectOutputStreamTest() {
		
	}
	
	public void start() {
		// ��ü�� ���Ϸ� ����
		Calendar now = Calendar.getInstance();
		MemberVO vo = new MemberVO(1000, "������", "������", "010-1234-5678");
		
		//�⵵ ����
		now.set(1997, 01, 13);
		vo.setUsername("��¯��");
		
		try {
			// ���Ϸ� ��ü ����
			File f = new File("d://testFolder/object.txt");
			FileOutputStream fos = new FileOutputStream(f);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(now);
			oos.writeObject(vo);
			
			oos.close();
			fos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ObjectOutputStreamTest().start();
	}
}
