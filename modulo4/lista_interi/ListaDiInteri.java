package modulo4.lista_interi;

import java.util.Arrays;

public class ListaDiInteri {
    /*
    Implementazione di una lista di interi,utilizzando gli array
     */

    int[] array = new int[0];

    public ListaDiInteri() {
    }

    public ListaDiInteri(int[] array) {
        this.array = array;
    }

    /**
     * Restituisce l'elemento i-esimo della lista data
     * @param i i-esimo elemento dato
     * @return valore dell'elemento i-esimo
     */
    public int getI(int i){
        return array[i];
    }

    /**
     * Restituisce indicie i-esimo dell'array
     * @param i elemento dato
     * @return indice i-esimo elemento
     */
    public int indexOf(int i){
        for (int j = 0; j < array.length; j++) {
            if (array[j] == i){
                return j;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(array);
    }

    public int length(){
        return array.length;
    }

    public boolean contains(int i){
        return indexOf(i) != -1;
    }

    /**
     * Aggiunge un elemento in coda alla lista: utilizzando gli array creo array nuovi per ogni
     * aggiunta
     * @param i elemento da aggiungere in coda
     */
    public void add(int i){
        int[] tmp = new int[array.length+1];

        for (int j = 0; j < array.length; j++) {
            tmp[j] = array[j];
        }
        array = tmp;
        array[array.length-1] = i;
    }

    /**
     * Inserisco un elemento in una precisa posizione nella lista
     * @param element elemento da inserire
     * @param i posizione dove inserire l'elemento
     */
    public void addAt(int element,int i){
        int[] tmp = new int[array.length+1];

        tmp = copyArray(tmp,array,i);
        tmp[i] = element;
        for (int j = i+1; j < array.length+1; j++) {
            tmp[j] = array[j-1];
        }

        array = tmp;
    }

    /**
     * Rimuovi la prima occorrenza di un elemento dato
     * @param element elemento da cancellare
     */
    public void remove(int element){
        int index = indexOf(element);
        if (index == -1) return;
        pop(index);
    }

    /**
     * Funzione che elemina l'occorenza di un elmemento dato un indice(funzione parte da remove())
     * @param index indice di elemento da eliminare
     */
    public void pop(int index){
        if (length()<index) return;

        int[] tmp = new int[array.length-1];

        tmp = copyArray(tmp,array,index);
        for (int i = index; i < array.length-1; i++) {
            tmp[i] = array[i+1];
        }

        array = tmp;
    }

    /**
     * Copia una parte di array fino ad un indicie dato
     * @param tmp array dove copiare
     * @param array array da copiare
     * @param i indice fino a dove mi devo fermare per la copia
     * @return array copiato
     */
    public int[] copyArray(int[] tmp,int[] array, int i){
        for (int j = 0; j < i; j++) {
            tmp[j] = array[j];
        }
        return tmp;
    }

    public static void main(String[] args) {
                ListaDiInteri lista = new ListaDiInteri();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                System.out.println(lista.length());
                System.out.println(lista.toString());
                System.out.println(lista.contains(3));
                System.out.println(lista.getI(2));
                System.out.println(lista.indexOf(3));
                System.out.println(lista.toString());
                lista.addAt(10,1);
                System.out.println(lista.toString());
                lista.remove(10);
                System.out.println(lista.toString());

            }

}
