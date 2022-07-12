package CodePackage;

public class Assignment11 {
	
	private static Assignment11 As=new Assignment11();
	private Assignment11() {
		
	}
   public static Assignment11 getAssignment11() {
	   return As;
   }
}
   class SingletonCheck{
	   
	   
	  public static boolean check(Assignment11 st1,Assignment11 st2) {
		if (st1.hashCode()==st2.hashCode()) {
			return true;
			
		}else
			return false;
	  }
	

}
