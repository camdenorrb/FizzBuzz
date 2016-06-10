package org.cyberpwn.fizzbuzz;

public class AsyncThread extends Thread
{
	private String dataINPUT;
	private AsyncCallback callback;
	
	public AsyncThread(String dataINPUT, AsyncCallback callback)
	{
		this.dataINPUT = dataINPUT;
		this.callback = callback;
	}
	
	public void run()
	{
		double key = 0;
		
		System.out.println("[ASYNC]: Started. Input: " + dataINPUT);
		for(int i = 0; i < 8192; i++)
		{
			System.out.println("[ASYNC]: Looped: " + i + " / " + 8192);
			double k = Math.random() * (Math.random() + 6);
			double v = Math.pow(Math.random(), k * Math.random());
			key = Math.random() * Math.sqrt(v * k / Math.random() + 1.7665);
		}
		
		System.out.println("[ASYNC]: FINISHED. Joining back to the main thread!");
		callback.run("Key finished at " + key);
	}
}
