import java.lang.reflect.Array;
import java.util.Scanner;

public class Dumfarth_instanzenzaeler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vNAme = "";
        String nName = "";
        int count = 0;
        Person[] personen =  new Person[50];
        while (!vNAme.equals("stop")){
            System.out.println("Wenn sie das Programm beenden wollen geben sie \"stop\" beim Vornamen ein! ");
            System.out.print("Vorname: ");
            vNAme = scanner.nextLine();
            if (!vNAme.equals("stop")) {
                System.out.print("Nachname: ");
                nName = scanner.nextLine();
                System.out.println();
                personen[count] = new Person(vNAme,nName);
                count++;
            }
            System.out.println();
        }
        System.out.print("Instanzen: "+ Person.getInstanzen());

    }


}
