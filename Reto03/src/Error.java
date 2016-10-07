import java.util.Scanner;

public class Error {

	public static void main(String[] args) {
		conversorEurosPesetas();
		//El código debe de ser capaz de convertir € a Pesetas

	}

	//Conversor de Euros a Pesetas
		public void conversorEurosPesetas(){
			float euros;
			int pesetas;
			Scanner sc;
			
			sc = new Scanner(System.out);
			System.in.println("Introduce los Euros a convertir: "):
			
			euros = sc.nextFloat();
			pesetas=(int) (euros*166.386);
			System.out.printIn(euros+"€ equivalen a "+pesetas+" pesetas");
			sc.close();
			}
}

