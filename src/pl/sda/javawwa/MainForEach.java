package pl.sda.javawwa;

import pl.sda.javawwa.model.Account;
import pl.sda.javawwa.model.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainForEach {

    static List<Client> clients = new ArrayList<>();

    public static void main(String[] args) {

        initializeClientslist();
        clients.forEach(System.out::println);


        System.out.println("\nKlient o podanym pesel");
        String peselTmp = "95110400010";

        for (Client klientTmp : clients) {
            if (klientTmp.getPesel().equals(peselTmp)) {
                System.out.println(klientTmp);
                break;
            }
        }

        System.out.println("\nKlient o podanym roku urodzenia");
        Integer rokUrodzenia = 1983;

        for (Client klientTmp : clients) {
            int n;
            n = Integer.parseInt(klientTmp.getPesel().substring(0, 2));
            n = 1900 + n;
            if (n == rokUrodzenia) {
                System.out.println(klientTmp);
            }
        }


        System.out.println("\nKlienci mieszkający na danej ulicy i pod danym numerem");
        String danaUlica = "Ulica1";
        Integer numerUlicy = 1;


        for (Client klientTmp : clients) {
            if (klientTmp.getStreet().equals(danaUlica) && klientTmp.getStreetNumber().equals(numerUlicy)) {
                System.out.println(klientTmp);
            }
        }

        Collections.sort(clients, (a, b) -> a.getCity().compareTo(b.getCity()));

        System.out.println("\nKlienci posortowani miastami alfabetycznie");
        for (Client klientTmp : clients) {
            System.out.println(klientTmp);
        }


        System.out.println("\nWszystkie istniejące konta");

        for (Client klientTmp : clients) {
            for (Account accTmp : klientTmp.getAccounts()) {
                System.out.println(accTmp);
            }

        }


        System.out.println("\nWszystkie konta klienta o podanym pesel");
        for (Client klientTmp : clients) {
            if (klientTmp.getPesel().equals(peselTmp)) {
                for (Account accTmp : klientTmp.getAccounts()) {
                    System.out.println(accTmp);
                }
            }
        }

        System.out.println("\nKlienci którzy mają stan dowolnego konta większy niż 1000");

        int stanMin = 1000;

        for (Client klientTmp : clients) {
            for (Account accTmp : klientTmp.getAccounts()) {
                if (accTmp.getBalance() > stanMin) {
                    System.out.println(klientTmp);
                    break;
                }
            }
        }

        System.out.println("\nKlient, który jest posiadaczem konta o podanym numerze");
        String nrkonta = "22553344445555";

        for (Client klientTmp : clients) {
            for (Account accTmp : klientTmp.getAccounts()) {
                if (accTmp.getAccountNumber().equals(nrkonta)) {
                    System.out.println(klientTmp);
                    break;
                }
            }
        }


        System.out.println("\nKonta klienta o danym numerze pesel, których stan jest między zadanym przedziałem");
        int stanMin2 = 99;
        int stanMax = 251;
        String pesel = "83110400010";


        for (Client klientTmp : clients) {
            if (klientTmp.getPesel().equals(pesel)) {

                for (Account accTmp : klientTmp.getAccounts()) {
                    if (accTmp.getBalance()>stanMin2 && accTmp.getBalance()<stanMax) {
                        System.out.println(accTmp);

                    }
                }
            }
        }

    }


    private static void initializeClientslist() {

        List<Account> kontaTmp = new ArrayList<>();
        kontaTmp.add(new Account("22333344445555", 250000D));
        kontaTmp.add(new Account("22553344445555", 20D));

        Client klient1 = new Client("Imie1", "Nazwisko1", "83040400010", "Ulica1", 1, "Warszzwa", kontaTmp);

        List<Account> kontaTmp1 = new ArrayList<>();
        kontaTmp1.add(new Account("22333344445775", 250D));
        kontaTmp1.add(new Account("225dd344445555", 100D));
        kontaTmp1.add(new Account("225ss344445555", 1500D));

        Client klient2 = new Client("Imie2", "Nazwisko2", "83110400010", "Ulica1", 1, "Kraków", kontaTmp1);

        List<Account> kontaTmp2 = new ArrayList<>();
        kontaTmp2.add(new Account("88333344445775", 210D));


        Client klient3 = new Client("Imie3", "Nazwisko3", "82110400010", "Ulica3", 15, "Katowice", kontaTmp2);

        List<Account> kontaTmp3 = new ArrayList<>();
        kontaTmp3.add(new Account("8sss3344445775", 1500D));
        kontaTmp3.add(new Account("88333344445775", 28000D));


        Client klient4 = new Client("Imie2", "Nazwisko2", "95110400010", "Ulica2", 3, "Katowice", kontaTmp3);

        clients.add(klient1);
        clients.add(klient2);
        clients.add(klient3);
        clients.add(klient4);
    }


}
