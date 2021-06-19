//SOLUCAO 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class MultiplicacaoSimples {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int valorUm = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int valorDois = Integer.parseInt(st.nextToken());
    int resultado = valorUm * valorDois;
    
    System.out.println("PROD = " + resultado);
  }
}

//SOLUCAO 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MultiplicacaoSimples {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int valorUm = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int valorDois = Integer.parseInt(st.nextToken());
   
    System.out.println("PROD = " + (valorUm * valorDois));
  }
}