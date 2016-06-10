package org.cyberpwn.fizzbuzz;

import org.cyberpwn.coolstuff.F;
import org.cyberpwn.coolstuff.GList;
import org.cyberpwn.coolstuff.Timer;

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
	
	public static void testb()
	{
		String[] aTerribleArray = new String[]{"blah", "blahb", "blahc"};
		
		//You can create a GList from an array   \/\/\/\/\/\/
		GList<String> list = new GList<String>(aTerribleArray);
		
		//No more Collections.reverse(list);
		list.reverse();
		
		//Add and delete crap on the same invocation
		list.qadd("Chain").qadd("add").qadd("data").qdel("delete").qdel("Chain");
		
		//Get a perfectly copied list, instead of cloning and casting
		list.copy().clear();
		
		//Does the list have duplicates?
		list.hasDuplicates();
		
		//Remove duplicates
		list.removeDuplicates();
		
		//To string with commas! or whatever you want
		list.toString(", ");
		
		//Add a bunch of them in one go.
		list.add("a", "list", "of", "Strings");
		
		//Example: Should return "This is a test."
		new GList<String>().qadd("This").qadd("is").qadd("a").qadd("test.").reverse().reverse().toString(" ");
	}
	
	public static void testc()
	{
		Timer t = new Timer();
		
		t.start();
		
		double key = 0;
		
		for(int i = 0; i < 8192; i++)
		{
			double k = Math.random() * (Math.random() + 6);
			double v = Math.pow(Math.random(), k * Math.random());
			key = Math.random() * Math.sqrt(v * k / Math.random() + 1.7665);
		}
		
		t.start();
		
		System.out.println("Did a bunch of useless math in " + F.nsMs(t.getTime(), 5) + " milliseconds");
	}
}
