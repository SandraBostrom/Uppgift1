import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Vill du besöka: \n1.ett Zoo \n2.ett Museum?");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Dessa zoon finns: \n 1.Skansen \n2.Göteborgs zoo");
                choice = scan.nextInt();
                if (choice == 1) {
                    Zoo skansen = new Skansen();
                    skansen.information();
                    System.out.println();
                } else {
                    Zoo Gothenburg = new GöteborgZoo();
                    Gothenburg.information();
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Dessa museum finns: \n 1.Naturhistoriska");
                choice = scan.nextInt();
                if (choice == 1) {
                    Museum naturhistoriska = new Naturhistoriska();
                    naturhistoriska.information();
                    System.out.println();
                    break;

                }
        }
    }
}

