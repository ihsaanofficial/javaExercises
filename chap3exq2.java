public class chap3exq2{
	public static void main(String arg[]){
 int maxv=50;
 Outerloop:
 for(int i=2; i<=maxv; i++){
 	for(int j=2; j<=Math.sqrt(i); j++)
 		if(i%j==0){
 			continue Outerloop;
 		}

	System.out.println(i);
	} 
}
}