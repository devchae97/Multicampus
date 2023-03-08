
public class ThreadTest2 extends Thread{
	
	// Runnable 클래스를 이용한 스레드 구현
	// Runnable 인터페이스를 상속받고 스레드 처리가 필요한 run()에 오버라이딩하면
	// 자바가상머신의 스레드스케쥴러가 실행을 관리한다
	
	String threadName;
	
	public ThreadTest2() {
		
	}
	
	public ThreadTest2(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {
		for(int i=1; ; i++) {
			System.out.println(threadName + " -> " + i);
			try {
				Thread.sleep(1000); // 지정한 밀리초만큼
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadTest2 t1 = new ThreadTest2("first 스레드");
		ThreadTest2 t2 = new ThreadTest2("second 스레드");
		
		// 인터페이스를 상속받으면 추상메소드이기에 Thread 객체로 만들기
		Thread obj1 = new Thread(t1);
		Thread obj2 = new Thread(t2);
		
		obj1.start();
		obj2.start();
	}
}
