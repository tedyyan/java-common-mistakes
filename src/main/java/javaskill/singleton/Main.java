package javaskill.singleton;

public class Main {
	public static void main(String[] args) {
		System.out.println(SingletonEnum.INSTANCE.getName());
		

		System.out.println(StaticSingleton.getSingleton().getName());
		
	}
}
