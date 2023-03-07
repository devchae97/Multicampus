import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		
	}
	
	public void start() {
		try {
			// ����̺�, ����, ���Ͽ� ������ ������ ����ϱ� ���ؼ��� File ��ü �����ؾ���
//			File(File parent, String child)
//			File(String parent, String child)
//			File(String pathname)
			
			File f1 = new File("d://");
			File f2 = new File("d://dev2");
			File f3 = new File("d://dev/Test.java");
			
			File f4 = new File(f2, "Test.java");
			File f5 = new File("d:/dev","Test.java");
			
			// ��� �Ǵ� ���� ���� ����
			System.out.println(f2.exists()); // true, ������ false
			System.out.println(f3.exists()); // false, ������ true
			
			// ��������
			if(!f2.exists()) {
				if(f2.mkdir()) { // mkdir(), mkdirs()
					System.out.println("���� ����");
				}else {
					System.out.println("���� ���� ����");
				}
			}
			
			// ���� ����
			if(!f4.exists()) {
				if(f4.createNewFile()) {
					System.out.println("���� ����");
				}else {
					System.out.println("���� ���� ����");
				}
			}
			
			// ������ ������¥
			long lastDate = f2.lastModified();
			Calendar date = Calendar.getInstance();
			date.setTimeInMillis(lastDate);
			
			// 2023-3-7 ���� 3:50
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String lastDateStr = fmt.format(date.getTime());
			System.out.println("������ ������ -> " + lastDateStr);
			
			// Ư������̺꿡 �ִ� ������ ���ϸ�� ���ϱ�
			File[] files = f1.listFiles();
			// getName() : ���ϸ�
			// getParent() : ����̺�� + ����
			// getPath(), getAbsolutePate() : ����̺�� + ���� + ���ϸ�
			
			for(File f : files) {
				if(f.isDirectory()) {
					if(f.isHidden()) {
						System.out.println(f.getPath() + "[��������]");
					}else {
						System.out.println(f.getPath() + "[����]");
					}
				}else if(f.isFile()) {
					if(f.isHidden()) {
						System.out.println(f.getPath() + "[��������]");
					}else {
						System.out.println(f.getPath() + "[����]");
					}
				}
			}
			
			// ����̺� ���
			File drive[] = File.listRoots();
			for(File f : drive) {
				System.out.println(f.getPath());
			}
			
			// ������ ũ��(byte)
			long fileSize = f3.length();
			System.out.println("fileSize = " + fileSize);
			
			// ���ϻ���
			boolean boo = f3.delete();
			System.out.println(boo);
			
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FileTest().start();
	}
}
