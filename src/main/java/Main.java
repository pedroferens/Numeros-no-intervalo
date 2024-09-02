import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   //um programa que leia um valor intero N. Este valor sera a quantidade de valores inteiros X que serao lidos em seguida. Mostre quantos desses valores X estao dentro do intervalo [10,20] e quantos estao fora do intervalo, mostrando essas informacoes.
    int quantidadeDeNumeros = sc.nextInt();
    int ValoresDentroDoIntervalo = 0;
    int ValoresForaDoIntervalo = 0;
    int numeroDigitado; 

    for(int i = 0; i < quantidadeDeNumerosDigitados;i++ ) {
      System.out.println("Digite o valor a ser comparado ");
      numeroDigitado = sc.nextInt();
      if( numeroDigitado >= 10 && numeroDigitado <= 20) {
        ValoresDentroDoIntervalo++;
      } else {
        
      }
    }


    
    sc.close();
    
  }


}