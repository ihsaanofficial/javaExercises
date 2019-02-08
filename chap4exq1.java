public class chap4exq1{
	public static void main(String[] args) {
		String[] months={"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
		double[] numbers= new double[12];
		double avg = 0.0;

		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]= 100.0*Math.random();
			System.out.println("in month" + " " +months[i] + " " + "number is" + " " + numbers[i]);
			avg= avg+numbers[i];
		}
		avg=avg/numbers.length;
		System.out.println("avg is" + " "+ avg);
	}
}