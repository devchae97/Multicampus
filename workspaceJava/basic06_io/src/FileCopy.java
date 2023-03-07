import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public FileCopy() {
		
	}
	
	public void start() {
		// ���Ϻ���
		// D:\TIL\workspaceJava\basic01\src\ExGuGuDan.java
		// D:testFolder\ExGuGuDan.java
		File orgFile = new File("D:\\TIL\\workspaceJava\\basic01\\src\\ExGuGuDan.java");
		File tarFile = new File("D:\\testFolder\\ExGuGuDan.java");
		try {
			FileInputStream fis = new FileInputStream(orgFile);
			FileOutputStream fos = new FileOutputStream(tarFile);
			
			// ������ ������ �о� ������ �迭
			byte[] sourceCode = new byte[(int)orgFile.length()];
			
			// �о�� ����Ʈ �� ����
			int cnt = fis.read(sourceCode);
			
			// ����
			fos.write(sourceCode, 0, cnt);
			
			fis.close();
			fos.close();
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("������ ���� -> " + fnfe.getMessage());
		}catch(IOException io) {
			System.out.println("����� ���� -> " + io.getMessage());
		}
		System.out.println(orgFile.getPath() + "�� ������ " + tarFile.getPath() + "�� ����");
	}
	
	public static void main(String[] args) {
		new FileCopy().start();
	}
}
