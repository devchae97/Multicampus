import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		
	}
	
	public void start() {
		try {
			// 드라이브, 폴더, 파일에 관련한 정보를 사용하기 위해서는 File 객체 생성해야함
//			File(File parent, String child)
//			File(String parent, String child)
//			File(String pathname)
			
			File f1 = new File("d://");
			File f2 = new File("d://dev2");
			File f3 = new File("d://dev/Test.java");
			
			File f4 = new File(f2, "Test.java");
			File f5 = new File("d:/dev","Test.java");
			
			// 경로 또는 파일 존재 유무
			System.out.println(f2.exists()); // true, 없으면 false
			System.out.println(f3.exists()); // false, 있으면 true
			
			// 폴더생성
			if(!f2.exists()) {
				if(f2.mkdir()) { // mkdir(), mkdirs()
					System.out.println("폴더 생성");
				}else {
					System.out.println("폴더 생성 실패");
				}
			}
			
			// 파일 생성
			if(!f4.exists()) {
				if(f4.createNewFile()) {
					System.out.println("파일 생성");
				}else {
					System.out.println("파일 생성 실패");
				}
			}
			
			// 마지막 수정날짜
			long lastDate = f2.lastModified();
			Calendar date = Calendar.getInstance();
			date.setTimeInMillis(lastDate);
			
			// 2023-3-7 오후 3:50
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String lastDateStr = fmt.format(date.getTime());
			System.out.println("마지막 수정일 -> " + lastDateStr);
			
			// 특정드라이브에 있는 폴더와 파일목록 구하기
			File[] files = f1.listFiles();
			// getName() : 파일명
			// getParent() : 드라이브명 + 폴더
			// getPath(), getAbsolutePate() : 드라이브명 + 폴더 + 파일명
			
			for(File f : files) {
				if(f.isDirectory()) {
					if(f.isHidden()) {
						System.out.println(f.getPath() + "[숨김폴더]");
					}else {
						System.out.println(f.getPath() + "[폴더]");
					}
				}else if(f.isFile()) {
					if(f.isHidden()) {
						System.out.println(f.getPath() + "[숨김파일]");
					}else {
						System.out.println(f.getPath() + "[폴더]");
					}
				}
			}
			
			// 드라이브 목록
			File drive[] = File.listRoots();
			for(File f : drive) {
				System.out.println(f.getPath());
			}
			
			// 파일의 크기(byte)
			long fileSize = f3.length();
			System.out.println("fileSize = " + fileSize);
			
			// 파일삭제
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
