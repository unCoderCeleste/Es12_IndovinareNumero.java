/*
🔥Esercizio 12 [un po’ articolato]🔥
Si scriva un algoritmo per un semplice gioco che chieda di indovinare un codice
numerico di cinque cifre. Quando l’utente scrive la risposta, il programma restituisce due
valori: il numero di cifre al posto giusto e la somma di queste cifre.
Per esempio, se il codice segreto è 53840 e l’utente ipotizza 83241, le cifre 3 e 4 sono al
posto giusto. Il programma perciò restituirebbe in output i numeri 2 (cifre corrette) e 7
(somma). Si permetta all’utente di provare per un numero prefissato di volte.
 */
import java.util.Scanner;

import static java.lang.System.exit;

public class Es12_IndovinareNumero {
    public static void main(String[] args) {
        Scanner ind= new Scanner(System.in);
        System.out.println("INDOVINARE IL NUMERO SEGRETO.\n");
        int[] codsegreto= {5, 8, 3, 6, 1};
        int[] indovina= new int[5];
        int somma=0;
        int contatore=0;
        int contotale=5;
        System.out.print("Inserisci la catena di 5 numeri da indovinare.\n");

        do {
            System.out.println("Hai " +contotale +" opportunità.");
            for (int i = 0; i < 5; i++) {
                System.out.print("Nro " + (i + 1) + ": ");
                indovina[i] = ind.nextInt();
            }
            System.out.print("Hai inserito i numeri: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(indovina[i] + "\t");
            }
            for (int i = 0; i < 5; i++) {
                if (indovina[i] == codsegreto[i]) {
                    contatore = contatore+1;
                    somma = (somma + indovina[i]);
                }
            }
            if (indovina[0] == codsegreto[0] && indovina[1] == codsegreto[1] && indovina[2] == codsegreto[2] && indovina[3] == codsegreto[3] && indovina[4] == codsegreto[4]) {
                System.out.println("\nCOMPLIMENTI! HAI INDOVINATO TUTTI I NUMERI DELL'ARRAY SEGRETO!");
                exit(0);
            } else {
                System.out.print("\n" +contatore + " numeri su 5 indovinati");
                System.out.print("\nI numeri indovinati sommano: " + somma);
                System.out.print("PROVA DI NUOVO!");
            }
            contatore=0;
            contotale--;
            System.out.println("\n");
        }
        while(contotale>=1);

    }
}