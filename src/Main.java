public class Main {

	public static void main(String[] args) {

		
				// Creazione dei personaggi
				Personaggio superEroe = new SuperEroe();
				Personaggio vampiro = new Vampiro();
				Personaggio licantropo = new Licantropo(false); // Supponiamo che non sia luna piena all'inizio
		
				// 1. SuperEroe combatte 3 volte
				for (int i = 0; i < 3; i++) {
					superEroe.combatti();
				}
		
				// 2. Vampiro azzanna 1 volta
				vampiro.azzanna();
		
				// 3. Licantropo combatte 2 volte (senza luna piena)
				for (int i = 0; i < 2; i++) {
					licantropo.combatti();
				}
		
				// 4. Stampa la forza fisica rimasta di ciascun personaggio
				System.out.println("Forza fisica del SuperEroe: " + superEroe.getForzaFisica());
				System.out.println("Forza fisica del Vampiro: " + vampiro.getForzaFisica());
				System.out.println("Forza fisica del Licantropo: " + licantropo.getForzaFisica());
			}
		
		
	}

