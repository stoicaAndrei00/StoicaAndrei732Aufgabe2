import model.Charaktere;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }



    public void alleCharactereAnschreiben() {
        Iterator var1 = this.service.alleCharaktereZuruckgeben().iterator();

        while(var1.hasNext()) {
            Charaktere spieler = (Charaktere)var1.next();
            System.out.println(spieler);
        }

    }


    public void createCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        int id = sc.nextInt();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Region: ");
        String region = sc.nextLine();
        System.out.println("Marktwert: ");
        List<String> gekauftenProdukte = new ArrayList<>();
        this.service.createACharakter(id, name, region, gekauftenProdukte);
    }

    public void showCharacter() {
        Iterator var1 = this.service.alleCharaktereZuruckgeben().iterator();

        while(var1.hasNext()) {
            Charaktere charaktere = (Charaktere)var1.next();
            System.out.println(charaktere);
        }

        System.out.println("Id des Charaktere:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println(this.service.getCharaktere(id));
    }

    public void updateCharacterValidate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id der character der wir beenden: ");
        int alter = sc.nextInt();
        System.out.println("Neuer Name: ");
        String name = sc.nextLine();
        System.out.println("Neuer Region: ");
        String position = sc.nextLine();
        System.out.println("Neuer gekauftenProdukte: ");
        List<String> gekauftenProdukte = new ArrayList<>();
        Charaktere spieler = new Charaktere(alter, name, position, gekauftenProdukte);
        this.service.updateCharaktere(spieler);
    }

    public void deleteCharaktere() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name des Spielers, der geloescht werden soll: ");
        String name = sc.nextLine();
        sc.nextLine();
        this.service.deleteCharaktere(name);
    }

    public void charactereNachRegionFiltrieren() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Position: ");
        String position = sc.nextLine();
        Iterator var3 = this.service.filterNachPosition(position).iterator();

        while(var3.hasNext()) {
            Charaktere spieler = (Charaktere)var3.next();
            System.out.println(spieler);
        }

    }
}