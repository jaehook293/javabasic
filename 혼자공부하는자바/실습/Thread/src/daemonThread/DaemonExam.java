package daemonThread;

public class DaemonExam {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); //AutoSaveThread를 데몬 스레드로 만듬
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
	}
		System.out.println("메인 스레드 종료");

	}
}