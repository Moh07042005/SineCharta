package SC_Core_Engine.dev;

import java.util.Scanner;

public class HandleDevInput {

    public HandleDevInput() {
    }

    public static GameAction promptForGameStart() {
        Scanner scanner = new Scanner(System.in);

        // Menü anzeigen
        System.out.println("\n===========================================================================");
        System.out.println("HandleDevInput: Neues Spiel erstellen oder vorhandenen Spielstand laden");
        System.out.println("HandleDevInput: 1. Neues Spiel erstellen");
        System.out.println("HandleDevInput: 2. Vorhandenen Spielstand laden");

        // Benutzereingabe lesen
        int auswahl = scanner.nextInt();

        // Entscheidung basierend auf der Benutzereingabe
        if (auswahl == 1) {
            System.out.println("HandleDevInput: Neues Spiel wird erstellt...");
            scanner.close();
            return GameAction.NEW_GAME;
        } else if (auswahl == 2) {
            System.out.println("HandleDevInput: Vorhandenen Spielstand laden...");
            scanner.close();
            return GameAction.LOAD_GAME;
        } else {
            System.out.println("HandleDevInput: Ungültige Auswahl. Bitte wählen Sie 1 oder 2.");
            promptForGameStart();
        }

        // Scanner schließen
        scanner.close();
        return null;
    }
}
