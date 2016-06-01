package cse360assign2;

/**
 * The Analytics class extends the OrderedIntList class and is used to determine
 * certain functions on the numbers which are provided through the class call.
 *
 */

public class Analytics extends OrderedIntList {

	protected double meanNum;
	protected int median;
	protected int high;
	protected int low;
	protected int numInts;
	
	Analytics()
	{
		OrderedIntList list = new OrderedIntList();
	}
	
	
	/**
	 * The mean method is used to calculate the mean of a list of integers specified
	 * in the parameter for the method as an integer array.
	 *
	 * @param array	This is the only parameter of the insert method
	 * @return mean Mean of the integers in the array
	 */
	
	
	public double mean(int[] array)
	{
		int sum = 0;
		
		if(array.length == 0)
			return -1;
		else
		{
			for (int index = 0; index < array.length; index++)
			{
				sum += array[index];
			}
			meanNum = sum/(array.length);
		
		return meanNum;
		}
	}
	
	/**
	 * The median method is used to calculate the median of a list of integers specified
	 * in the parameter for the method as an integer array.
	 *
	 * @param array	This is the only parameter of the insert method
	 * @return median Median of the integers in the array
	 */
	
	public int median(int[] array)
	{
		
		if(array.length == 0)
			return -1;
		
		int middle;
		int length = array.length-1;
	
			
		if(length % 2 == 0)
		{
			middle = length/2;
			median = array[middle];
		}
		else
		{
			length = length-1;
			middle = length/2;
			median = array[middle];
		}
		return median;
	}
	
	
	
	/**
	 * The high method is used to calculate the high number in a list of integers specified
	 * in the parameter for the method as an integer array.
	 *
	 * @param array	This is the only parameter of the insert method
	 * @return high High number in the array
	 */
	
	public int high(int[] array)
	{
		
		if(array.length == 0)
			return -1;
		else
		{
			int last;
			last = array.length-1;
			high = array[last];
		
		return high;
		}
	}
	
	
	/**
	 * The low method is used to calculate the low number in a list of integers specified
	 * in the parameter for the method as an integer array, and then returns it
	 *
	 * @param array	This is the only parameter of the insert method
	 * @return low Low number in the array
	 */
	
	public int low(int[] array)
	{
		
		if(array.length == 0)
			return -1;
		else
		{
			low = array[0];
			return low;
		}
	}
	
	/**
	 * The numInts method is used to calculate the number of integers in 
	 * a list of integers specified by the parameter for the method as an
	 *  integer array.
	 *
	 * @param array	This is the only parameter of the insert method
	 * @return numInts The number of integers in the array
	 */
	
	public int numInts(int[] array)
	{
		numInts = array.length-1;
		return numInts;
	}
	
	public void test()
	{
		System.out.println("Mean: " + mean(array));
		System.out.println("Median: " + median(array));
		System.out.println("High number: " + high(array));
		System.out.println("Low number: " + low(array));
		System.out.println("Number of integers: " + numInts(array));	
	}
	
	
}
