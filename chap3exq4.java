public class chap3exq4{
	public static void main(String[] args) {
		int counter=0;
		int numtogen=20;
		char symbol=0;
		while(counter<numtogen){
			symbol= (char)(26*Math.random()+'A');
			switch(symbol){
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				break;
				default:
				System.out.print(symbol+" ");
				counter++;
				break;
			}


		}
	}
}