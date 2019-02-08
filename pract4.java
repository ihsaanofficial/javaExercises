class pract4{
 static int[] values = new int[10]; 
 static {
 System.out.println("Running initialization block.");
 for(int i = 0 ; i < values.length ; ++i) {
 values[i] = (int)(100.0*Math.random());
 }
 }
 void listValues() {
 System.out.println(); 
 for(int value : values) {

 System.out.print(" " + value); 
 }
 System.out.println(); 
 }
 public static void main(String[] args) {
 pract4 example = new pract4();
 System.out.println("\nFirst object:");
 example.listValues();
 example = new pract4();
 System.out.println("\nSecond object:");
 example.listValues();
 }
}