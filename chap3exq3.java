public class chap3exq3{
	public static void main(String[] args)
	{

	int setcount=5;
	int setsize=6;
	int range=49;
	int lucky;
	int luckycount;
	for(int i=0; i<setsize; i++)
	{
		int lucky1=0;
		int lucky2=0;
		int lucky3=0;
		int lucky4=0;
		int lucky5=0;
		int lucky6=0;
	
	luckycount=0;
	while(luckycount<setsize)
	 {
		lucky= (int)(range*Math.random())+1;
	
	switch(luckycount)
	  {
	case 0:
	lucky1=lucky;
	luckycount++;
	break;
	case 1:
	if(lucky !=lucky1){
       lucky2=lucky;
       luckycount++;
	   }
	   break;
	case 2:
	if(lucky !=lucky1 && lucky != lucky2){
		lucky3=lucky;
	    luckycount++;
	     }
	break;
	case 3:
	if(lucky !=lucky1 && lucky != lucky2 && lucky != lucky3)
	  {
		lucky4= lucky;
		luckycount++;
	  }
	break;
	case 4:
	if(lucky !=lucky1 && lucky != lucky2 && lucky != lucky3 && lucky !=lucky4)
	  {
		lucky5=lucky;
		luckycount++;
	  }
	break;
	case 5:
	if(lucky !=lucky1 && lucky != lucky2 && lucky != lucky3 && lucky !=lucky4 && lucky !=lucky5)
	  {
		lucky6=lucky;
		luckycount++;
	  }
	break;
      }
    }
  System.out.print("\nSET " + (i+1) + ":");
  System.out.print(" "+lucky1+"  "+lucky2+" "+lucky3+" "+lucky4+" "+lucky5+" "+lucky6);

 }
}
}