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
            }

}
