abstract class Example {
			   public void print(){
		      System.out.println("java is programming language");   
		   }
}
		 class Add extends Example{
		   
		    public void print(){
		        System.out.println("platform independent");
		    }
		    public static void main(String args[]){
		    	Example obj = new Add();
		    	obj.print();
		    	
		    }
				}

