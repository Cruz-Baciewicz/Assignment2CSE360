package cse360assign2;

/**
* This OrderedIntList class contains methods which allow you to implement inserting values into an integer array
* in increasing order, expanding the array size dynamically based on input, and then print out the values.
*
*
*@author cruzbaciewicz
*@pin	17
*
*
*/


/**
 * The OrderedIntList program is used to enter values into an array and
 * dynamically sort them in increasing order, then print them in such order
 *
 */
public class OrderedIntList
{
	protected int[] array;
	protected int position;
	private boolean test;

	OrderedIntList(boolean run)
	{
		test = run;
		if(!test)
		{}
		else
		array = new int[10];
	}



	/**
	 * The insert method is used to insert values into the
	 * correct position in an array based around the value position of
	 * the integer
	 *
	 * @param value	This is the only parameter of the insert method
	 */
	public void insert (int value)
	{
		if(position == array.length)
			grow();

		else if(position == 0)
			{
				array[0] = value;
				position++;
			}

		else
		{
			int index = 0;
			int index2 = 0;

			while(index < position && value >= array[index])     //iterate until the correct position is found when v is greater than the previous number
			{
				index++;
				index2++;
			}

			for (index = position; index > index2; index--)       //move all of the values greater than v one space to the right so that there is a space for v in a[]
				array[index] = array[index-1];

			array[index2]= value; 					  //place v into the array
			position++;						  //increase the position of the last element in a[]
		}
	}


	/**
	 * The grow method is used by the insert method to expand the array if enough values have been entered
	 * to warrant more allocated space
	 *
	 *  @param This method has no parameters
	 */
	private void grow()
	{

		int tempArray[] = new int[position * 2];

		for (int index = 0; index < position; index++)
			tempArray[index] = array[index];

		array = tempArray;
	}



	/**
	 * The print method is used in the main method to print the contents of
	 * the array in increasing order and in a 5 element per row format
	 *
	 * @param This method has no parameters
	 *
	 */
	public void print()
	{
		for (int index = 0; index < position; index++)
		{
			if (index % 5 == 0)
				System.out.println();

			System.out.print(array[index] + "\t");
		}
		System.out.println();;
	}


	/**
	 * This is the main  method which makes use of insert and print
	 *
	 * @retun Nothing.
	 * @param args Unused.
	 *
	 */
	public static void main(String [] args)
	{
		OrderedIntList list = new OrderedIntList(true);
		list.insert(4);
		list.insert(3);
		list.insert(7);
		list.insert(13);
		list.insert(27);
		list.insert(1);
		list.insert(6);
		list.insert(11);
		list.insert(8);
		list.insert(19);

		list.print();

	}
}
