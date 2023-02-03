package multithreadingexample;

public class Thread2 implements Runnable {
    @Override
    public void run() {
    	
    }
    
    public static void main(String[] args) {
        Thread sahanathread1 = new Thread();
        sahanathread1.start();
        try {
            sahanathread1.sleep(1000);
            
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        sahanathread1.setPriority(1);
        int sahanapriority = sahanathread1.getPriority();
        
        System.out.println(sahanapriority);
        System.out.println("Thread Running");
  }

}
