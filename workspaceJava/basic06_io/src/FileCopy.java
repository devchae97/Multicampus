import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public FileCopy() {
		
	}
	
	public void start() {
		// 파일복사
		// D:\TIL\workspaceJava\basic01\src\ExGuGuDan.java
		// D:testFolder\ExGuGuDan.java
		File orgFile = new File("D:\\TIL\\workspaceJava\\basic01\\src\\ExGuGuDan.java");
		File tarFile = new File("D:\\testFolder\\ExGuGuDan.java");
		try {
			FileInputStream fis = new FileInputStream(orgFile);
			FileOutputStream fos = new FileOutputStream(tarFile);
			
			// 파일의 내용을 읽어 저장할 배열
			byte[] sourceCode = new byte[(int)orgFile.length()];
			
			// 읽어온 바이트 수 리턴
			int cnt = fis.read(sourceCode);
			
			// 쓰기
			fos.write(sourceCode, 0, cnt);
			
			fis.close();
			fos.close();
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("파일이 없음 -> " + fnfe.getMessage());
		}catch(IOException io) {
			System.out.println("입출력 에러 -> " + io.getMessage());
		}
		System.out.println(orgFile.getPath() + "의 내용을 " + tarFile.getPath() + "로 복사");
	}
	
	public static void main(String[] args) {
		new FileCopy().start();
	}
}
