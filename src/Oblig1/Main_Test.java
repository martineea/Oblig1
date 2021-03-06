package Oblig1;

import java.util.Arrays;

public class Main_Test {
    public static void main (String[] args) {

        /// Tester oppgave 1
        int[] a = {5,4,3,2,1};
        int[] a2 = {1,2,6,3,4,5};

        System.out.println("Antall ombyttinger (største verdi først): "+ Oblig1.ombyttinger(a)); // skriver ut antall ombyttinger
        System.out.println((Arrays.toString(a))); // skriver ut hele tabellen for å se at størst ligger bakerst
        System.out.println("Største verdi er: "+ Oblig1.maks(a)); // skriver ut tabellens største verdi

        System.out.println("Antall ombyttinger (minste verdi først): "+ Oblig1.ombyttinger(a2)); // skriver ut antall ombyttinger
        System.out.println((Arrays.toString(a2))); // skriver ut hele tabellen for å se at størst ligger bakerst
        System.out.println("Største verdi er: "+ Oblig1.maks(a2)); // skriver ut tabellens største verdi


        System.out.println("");

        /// Tester oppgave 2
        int[] b = {1,1,1,1,1,1,1,2};
        System.out.println("Antall ulike i et sortert array: "+ Oblig1.antallUlikeSortert(b));

        System.out.println("");

        /// Tester oppgave 3
        int[] c = {3,3,2,1};
        System.out.println("Antall ulike i et u-sortert array: "+ Oblig1.antallUlikeUsortert(c));

        System.out.println("");

        /// Tester oppgave 4
        int[] d = {6,10,9,4,1,3,8,5,2,7};
        System.out.println("gamle arrayet "+Arrays.toString(d));
        Oblig1.delsortering(d);
        System.out.println("Her er oppgave 4: ");
        System.out.println(Arrays.toString(d));
        int[] siste = {10,8,6,2};
        Oblig1.delsortering(siste);
        System.out.println(Arrays.toString(siste));


        int[] ny = {1,2,3,4,5,6,7,53,9};
        System.out.println("gamle arrayet "+Arrays.toString(ny));
        Oblig1.delsortering(ny);
        System.out.println("Her er oppgave 4: ");
        System.out.println(Arrays.toString(ny));

        System.out.println("");

        /// Tester oppgave 5
        char[] e = {'A','B','C','D'}; // D, A, B, C
        System.out.println("Skriver ut array rotert, én plass: ");
        Oblig1.rotasjon(e);
        System.out.println(Arrays.toString(e)); // skriver ut Array


        System.out.println("");


        /// Tester oppgave 6
        char[] f = {'A','B','C','D','E','F','G','H','I','J'};
        //System.out.println("Skriver ut array rotert, x-antall plasser mot høyre: ");
        //Oblig1.Oblig1.rotasjon(f,3); // en rotasjon 3 enheter mot høyre
        //System.out.println(Arrays.toString(f)); // skriver ut Array
        System.out.println("Skriver ut array rotert, flere x-antall plasser mot venstre: ");
        Oblig1.rotasjon(f,-4); // en rotasjon to enheter mot venstre
        System.out.println(Arrays.toString(f)); // skriver ut Array

        System.out.println("");


        /// Tester oppgave 7a
        /*System.out.println("oppgave 7");
        String s="hei";
        String t="hei";
        System.out.println(Oblig1.Oblig1.flett(s,t));*/

        System.out.println("Oppgave 7a");
        String s = Oblig1.flett("ABC", "DEFGH");
        String t = Oblig1.flett("IJKLMN", "OPQ");
        String q = Oblig1.flett("", "AB");
        System.out.println(s+" "+t+" "+q);

        System.out.println("Oppgave 7a");
        String s1="du";
        String t1="ere";
        System.out.println(Oblig1.flett(s1,t1));

        /// Tester oppgave 7b
        System.out.println("Oppgave 7b");
        String flettet= Oblig1.flett("am ","l","geds","oratkrr","","r trte","io","tgauu");
        System.out.println(flettet);

        System.out.println("");

        /// Tester oppgave 8
        int[] g = {6,10,16,11,7,12,3,9,8,5}; // Utskrift: [6, 10, 16, 11, 7, 12, 3, 9, 8, 5]
        int[] index = Oblig1.indekssortering(g); // Utskrift: [6, 9, 0, 4, 8, 7, 1, 3, 5, 2]
        System.out.println("Skriver ut verdiene i tabellen g: " +Arrays.toString(g));
        System.out.println("Indexene til tabellen (med minste verdi først): "+Arrays.toString(index));


    }
}
