public class capitals {
  public static void main(String args[])   {
    int counter = 0;                                              
    int numberToGenerate = 20;                                         
    char symbol = 0;                                                   
 
    
    while( counter < numberToGenerate ) {
      
      
      symbol = (char)(26*Math.random() + 'A');
      switch(symbol) {
        //Vowels ignored:
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          break;
        default:
        
          System.out.print(symbol + " ");
          counter++;
          break;
      }
    }
  }
}