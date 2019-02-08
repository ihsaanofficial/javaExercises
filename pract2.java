//example showing how to create, initialize, and process arrays 
public class pract2{
	public static void main(String[] args) {
		double[] array = {1.5, 2.3, 5.2, 6.2};

		for(int i =0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		double sum=0;
		for(int i=0; i<array.length; i++)
		{
			sum +=array[i];
		}
			System.out.println("sum is:" + sum);
			double max= array[0];
			for (int i=0; i<array.length; i++ ) 
			{
				if(array[i]>max)
					max= array[i];
			}
			System.out.println("max is:" + max);

		
	}

}