## Exercicio (Java): Multiplicação Simples

O exercicio publicado é referente ao treinamento do Bootcamp Java - Solucionando Problemas Básicos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).


#### Entrada: 

A entrada contém 2 valores inteiros.


#### Saída: 

Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
3 | PROD = 27
9 | 

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
-30 | PROD = -300
10 | 

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
0  | PROD = 0
9  |  


#### Java　

```java
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
```

