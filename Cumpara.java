import java.util.Scanner;

public class Cumpara {

	private static Scanner scanner = new Scanner(System.in);
	private static Lista lista = new Lista();
	
/*	public void Cumpara() {
		boolean abandoneaza = false;
		
		try {
			int alegere;
			alegere = scanner.nextInt();
			if(alegere == 1) {
				adauga();
			}
		}catch(Exception e) {
			//
		}
	}*/
	public static void adauga() {
		lista.adauga(scanner.nextLine());
	}
	public void schimba() {
		int nrProdus = scanner.nextInt();
		scanner.nextLine();
		
		String produs = scanner.nextLine();
		lista.modifica(nrProdus, produs);
	}
}
