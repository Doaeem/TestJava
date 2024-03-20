package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		//ici je fais ce code pour lire les nombre d'abris et les initialiser
        int nbAbri = scan.nextInt();
        List<Abri> abris = new ArrayList<>();
        for (int i = 0; i < nbAbri; i++) {
            String nom = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            abris.add(new Abri(nom, x, y));
        }

      //ici je fais ce code pour lire les nombre d'enfants et les initialiser
        int nbEnfant = scan.nextInt();
        List<Enfant> enfants = new ArrayList<>();
        for (int i = 0; i < nbEnfant; i++) {
            String nom = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            enfants.add(new Enfant(nom, x, y));
        }

        //ici je fais ce code pour trouver l'abri le plus proche pour chaque enfant
        for (Enfant enfant : enfants) {
            Abri proche = enfant.trouver(abris);
            System.out.println(enfant.getNom() + " " + proche.getNom());
        }
	}

}
