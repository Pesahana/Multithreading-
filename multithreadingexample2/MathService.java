package multithreadingexample2;

 class MathService {

	synchronized void getSumOfArray(int[] numbers) {
	     int sum = 0;

	         for (int number : numbers) {
	             System.out.println(Thread.currentThread()
	            		 
	                     .getName()
	                     + " adds "
	                     + sum + " to "
	                     + number + " to get -> "
	                     + (sum += number));

	             try {
	                 Thread.sleep(500);
	             } catch (InterruptedException e) {
	                 throw new RuntimeException(e);
	             }
	         }
	    }
}
