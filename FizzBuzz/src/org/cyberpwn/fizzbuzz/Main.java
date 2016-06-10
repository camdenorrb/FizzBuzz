package org.cyberpwn.fizzbuzz;

public class Main
{
	public static void test()
	{
		System.out.println("[MAIN THREAD]: ASYNC Starting");
		new AsyncThread("Inputting data", new AsyncCallback()
		{
			public void run()
			{
				//Here, the thread finished. 
				System.out.println("[MAIN THREAD]: ASYNC Finished, value is " + getDataOUTPUT());
			}
		});
	}
}
