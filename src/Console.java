import java.util.Scanner;

public class Console {
    private Controller controller;

    public Console(Controller controller) {
        this.controller = controller;
    }

    public Console() {
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = -1;

        while(option != 0) {
            System.out.println("1. Alle Charactere\n2.Charactere CRUD\n0. Exit");
            option = sc.nextInt();
            sc.nextLine();
            int crudOption;
            switch (option) {
                case 0:
                default:
                    break;
                case 1:
                    this.controller.alleCharactereAnschreiben();
                    break;

                case 2:
                    System.out.println("1. Neuer Charakter hinzufugen\n2. Alle KSpieler sehen\n3. Einen bestimmten Spieler finden\n4. Einen Spieler aktualisieren\n5. Einen Spieler loschen\n6. Spieler nach Position filtrieren\n0. Exit");
                    crudOption = sc.nextInt();
                    sc.nextLine();
                    switch (crudOption) {
                        case 0:
                        default:
                            break;
                        case 1:
                            this.controller.createCharacter();
                            break;
                        case 2:
                            this.controller.alleCharactereAnschreiben();
                            break;
                        case 3:
                            this.controller.showCharacter();
                            break;
                        case 4:
                            this.controller.updateCharacterValidate();
                            break;
                        case 5:
                            this.controller.deleteCharaktere();
                            break;
                        case 6:
                            this.controller.charactereNachRegionFiltrieren();
                            break;

                    }
            }
        }

    }}