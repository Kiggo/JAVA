package thread_ex;

public class ThreadNameEx {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: "+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("프로그램 시작 스레드 이름: "+threadA.getName());
	}
}
