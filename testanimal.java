import java.util.Random;

public class testanimal{

	public static void main(String[] args) {

		animal[] theanimals= {
							new dog("toni" , "pista"),
							new cat("mano" , "chineseCat"),
							new duck("whiteDuck", "tall"),
							new dog("khoji"),
							new cat("cuteCat"),
							new duck("brownDuck"),
							new spanial("fido")
						};
		
		animal choice;
		Random select= new Random();

		for(int i=0; i<theanimals.length; i++)
		{
			//choice= theanimals[select.nextInt(theanimals.length)];
			choice= theanimals[i];
			System.out.println("\nyour choice is: \n"+choice);
			choice.sound();
		}

	}
}