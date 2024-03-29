/*
 * Driver.java
 * This is the Driver that will execute 5 parallel sorting algorithms: Merge Sort, Quick Sort, Radix Sort,
 * Brick Sort, and Bitonic Sort. Each Algorithm will take the same input array for consistency, and return
 * the total execution time.
 */

import java.util.Random;


public class Driver {

	public static void main(String[] args) {

		int LENGTH = 16;
	    Random randomGenerator = new Random(42);
	    
	    for(int k = 2; LENGTH < 1000000; LENGTH = LENGTH*k){
	    	
		    int[] arrayMerge = new int[LENGTH];
		    int[] arrayRadix = new int[LENGTH];
		    int[] arrayBitonic = new int[LENGTH];
		    int[] arrayBrick = new int[LENGTH];
	 
		    for (int i = 0; i < LENGTH; i++){
		      int randomInt = randomGenerator.nextInt(1000000);
		      arrayMerge[i] = randomInt;
		      arrayRadix[i] = randomInt;
		      arrayBitonic[i] = randomInt;
		      arrayBrick[i] = randomInt;
		    }
		    
		    try {
				double MergeTime = (double) MergeSort.start(arrayMerge)/1000000000.0;
				double RadixTime = (double) RadixSort.start(arrayRadix)/1000000000.0;
				double BitonicTime = (double) BitonicSort.startParallel(arrayBitonic)/1000000000.0;
				double BrickTime = (double) BrickSort.startParallel(arrayBrick)/1000000000.0;
			
				
				System.out.println("--------- LENGTH: " + LENGTH + " ---------");
				System.out.println("Merge: " + MergeTime + " seconds");
				System.out.println("Radix: " + RadixTime + " seconds");
				System.out.println("Bitonic: " + BitonicTime + " seconds");
				System.out.println("Brick: " + BrickTime + " seconds");
				
				
			} catch (Throwable e) {
				e.printStackTrace();
			}
		    
	    }
	    
	}

}