package example;

public class MultiThread implements Runnable {
	
	       public static void main(String[] args) {
	    	   
	        Thread sahanaThread = new Thread("Sahana");
	        Thread abhiThread  = new Thread("Abhi");
	        
	        sahanaThread.start();
	        abhiThread.start();
	        
	        System.out.println("Thread names are following:");
	        System.out.println(sahanaThread.getName());
	        System.out.println(abhiThread.getName());
	    }
	       
	    @Override
	   
	    public void run() {
	   
	    }
	    
}
