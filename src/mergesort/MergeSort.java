/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;


public class MergeSort {
    public static void main(String[] args) {
        int vetor[] = {1, 3, 5, 2, 4, 6}; 
        int inicio = vetor[0];
        int fim = vetor.length-1;
        int meio = (vetor.length-1)/2;
        
        Intercala i = new Intercala();
        
        i.intercala(vetor, inicio, fim, meio);
        for (int j = 0; j < vetor.length; j++) {
            System.out.println(vetor[j]);
        }
    }
}
