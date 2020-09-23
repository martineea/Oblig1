package Oblig2;


////////////////// class DobbeltLenketListe //////////////////////////////


import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;



public class DobbeltLenketListe<T> implements Liste<T> {

    /**
     * Node class
     *
     * @param <T>
     */
    private static final class Node<T> {
        private T verdi;                   // nodens verdi
        private Node<T> forrige, neste;    // pekere

        private Node(T verdi, Node<T> forrige, Node<T> neste) {
            this.verdi = verdi;
            this.forrige = forrige;
            this.neste = neste;
        }

        private Node(T verdi) {
            this(verdi, null, null);
        }
    }

    // instansvariabler
    private Node<T> hode;          // peker til den første i listen
    private Node<T> hale;          // peker til den siste i listen
    private int antall;            // antall noder i listen
    private int endringer;         // antall endringer i listen

    public DobbeltLenketListe() { // konstruktør for tom liste
        hode = null;
        hale = null;
        antall = 0;
        endringer = 0;
    }

    public DobbeltLenketListe(T[] a) { // konstruktør
        Objects.requireNonNull(a, "Tabellen a er null!"); // kaster nullPointerException om a == null

        if (a.length > 0) {
            int i = 0;
            for (i = 0; i < a.length; i++) {
                if (a[i] != null) {
                    hode = new Node<>(a[i]);
                    antall++;
                    break;
                }
            }

            hale = hode;
            if (hode != null) {
                i++;
                for (; i < a.length; i++) {
                    if (a[i] != null) {
                        hale.neste = new Node<>(a[i], hale, null);
                        hale = hale.neste;
                        antall++;
                    }

                }
            }
        }


        Node p = new Node(null, null, null); //lager en ny
    }

    public Liste<T> subliste(int fra, int til) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int antall() {
        return antall;
    }

    @Override
    public boolean tom() {
        if (antall == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean leggInn(T verdi) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void leggInn(int indeks, T verdi) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean inneholder(T verdi) {
        throw new UnsupportedOperationException();
    }

    @Override
    //oppgave 3a
    public T hent(int indeks) {
        //skal lages ved ved å bruke ​finnNode(​)​

        //Pass på at ​indeks ​sjekkes.

        //Bruk metoden ​indeksKontroll(​)​ som arves fra​ Liste​(bruk ​false​ som parameter).
        indeksKontroll(indeks,false);

        throw new UnsupportedOperationException();
    }

    @Override
    public int indeksTil(T verdi) {
        throw new UnsupportedOperationException();
    }

    @Override
    //oppgave 3a
    public T oppdater(int indeks, T nyverdi) {

        //skal erstatte verdien på plass ​indeks med ​nyverdi​ og returnere det som lå der fra før.

        //Husk at indeks må sjekkes,
        // at null-verdier ikke skal kunne legges inn og at variabelen ​endringer​ skal økes.

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean fjern(T verdi) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T fjern(int indeks) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nullstill() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }

    public String omvendtString() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public Iterator<T> iterator(int indeks) {
        throw new UnsupportedOperationException();
    }

    private class DobbeltLenketListeIterator implements Iterator<T> {
        private Node<T> denne;
        private boolean fjernOK;
        private int iteratorendringer;

        private DobbeltLenketListeIterator() {
            denne = hode;     // p starter på den første i listen
            fjernOK = false;  // blir sann når next() kalles
            iteratorendringer = endringer;  // teller endringer
        }

        private DobbeltLenketListeIterator(int indeks) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean hasNext() {
            return denne != null;
        }

        @Override
        public T next() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    } // class DobbeltLenketListeIterator

    public static <T> void sorter(Liste<T> liste, Comparator<? super T> c) {
        throw new UnsupportedOperationException();
    }

    //Oppgave 3.
    private Node<T> finnNode(int indeks){

        //Den skal returnere noden med den gitte indeksen/posisjonen.
        this.antall=0;
        //Hvis indeks er mindre enn ​antall​/2,
        DobbeltLenketListe<T> verdi= new DobbeltLenketListe<>();
        Node current= verdi.hode;
        Node bakerste=verdi.hale;
        if(indeks<antall/2){
            int i=0;
            int j=0;
            //while(verdi.hode < verdi.hale){
                //må ha en måte å gjøre dette på

                current= current.neste;
                return current;
               //i++;
                // så ​skal letingen etter noden starte fra hode og gå mot høyre ved hjelp av neste-pekere.
            //}


            //while(verdi.hale>hode){
            // bakerste= bakerste.forrige;
            // // Hvis ikke, ​skal​ letingen starte fra halen og gå mot venstre ved hjelp av forrige-pekere.
            //j--;
            // }



        }







        //legger til returnstatement.
        return null;
    }






} // class DobbeltLenketListe


