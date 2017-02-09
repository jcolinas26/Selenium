package test1;

public class Mindera2 {
	
	public static void sleep(int sec){
		
		//Wait for x Sec
		try {
			Thread.sleep(sec);
			System.out.println("Wait for " + sec + "  sec");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
