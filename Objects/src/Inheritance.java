
public class Inheritance {
	String type="singleinheritance";
	void print(){
		System.out.print("inheritance example program");
 	}
	public static class Example extends Inheritance{
	   String exam = "multilevel";
	   public static void main(String args[]){
		Example obj = new Example();
		System.out.println(obj.type);
		System.out.println(obj.exam);
		obj.print();
	   }
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
