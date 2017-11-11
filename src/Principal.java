/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplinas: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 * Baseado nos slides 23 da aula do dia 22/09/2017  
 * Página 156 Cormen 3a Ed
 *
 * Problema de Seleção
 * Dado um conjunto A de n números inteiro e um inteiro i, 
 * determinar o i-ésimo menor elemento de A.
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    /**
     * Recebe um vetor A[1... n] e devolve o mínimo e o máximo do vetor. 
     * Número de comparações: 2(n-1) = 2n-2 = Theta(n)
     *
     * @param A Vetor com os valores
     * @param n Quantidade de elementos do vetor
     * @return Um vetor com o menor e maior elemento do vetor
     */
    public static int[] minMax(int A[], int n) {
        //Considere o primeiro como menor
        int min = A[0];
        //Considere o primeiro como maior
        int max = A[0];
        for (int j = 0; j < n; j++) {
            if (A[j] < min) {
                min = A[j];
            }
            if (A[j] > max) {
                max = A[j];
            }
        }
        //Cria um vetor com dois elementos para retornar o menor e maior
        int[] retorno = {min, max};
        return retorno;
    }

    public static void main(String[] args) {
        //Vetor dos dados    
        int A[] = {50, 70, 60, 90, 10, 30, 20, 40};

        //Quantidade de elementos
        int n = A.length;

        int[] retorno = minMax(A, n);

        System.out.println("Menor:" + retorno[0]);
        System.out.println("Maior:" + retorno[1]);
    }
}
