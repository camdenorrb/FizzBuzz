package org.cyberpwn.fizzbuzz;

public class AsyncCallback implements Runnable
{
	private String dataOUTPUT;
	
	public void run(String dataOUTPUT)
	{
		this.dataOUTPUT = dataOUTPUT;
	}
	
	@Override
	public void run()
	{
		
	}

	public String getDataOUTPUT()
	{
		return dataOUTPUT;
	}
}
