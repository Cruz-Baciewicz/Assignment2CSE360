package cse360assign2;



/**
 * The TestAnalytics class extends the Analytics class and is used to test certain
 * functions both local and inherited from the Analytics class
 *
 */

public class TestAnalytics extends Analytics{

	/**
	 * This is the main  method which makes use of insert and print
	 *
	 * @retun Nothing.
	 * @param args Unused.
	 *
	 */
	
	public static void main(String [] args)
	{
		Analytics test = new Analytics();
		test.insert(4);
		test.insert(3);
		test.insert(7);
		test.insert(13);
		test.insert(27);
		test.insert(1);
		test.insert(6);
		test.insert(11);
		test.insert(8);
		test.insert(19);
		test.print();
		test.test();
	}

}
