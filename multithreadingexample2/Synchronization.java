package multithreadingexample2;

public class Synchronization {

	public static void main(String[] args) {
        MathService mathService = new MathService();

        Thread threadOne = new Thread(() ->
                mathService.getSumOfArray(new int[]{10, 11, 12}));
        
        Thread threadTwo = new Thread(() ->
                mathService.getSumOfArray(new int[]{20, 21, 22}));

        threadOne.start();
        threadTwo.start();
    }
}
