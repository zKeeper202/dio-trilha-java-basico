/*Padrão de Nomenclatura
1) Arquivo .java deve começar com letra MAIUSCULA, em caso de palavra composta
a segunda palavra tbm deve ser maiuscula ex: Calculadora.java & CalculadoraCientifica.java
2) camelCase: toda varivael deve ser escrita em minuscula, se a palavra for composta, a segunda 
palavra e demais, devem começar com letra maiuscula ex:  'ano' e 'anoFabricacao'
3)Se uma variavel tiver valor que não mudará, à escrevemos em UPPERCASE. Se usarmos
final antes da String, o valor não sera alterado ex: final String BR = "Brasil", BR = "Brazil" não será alterado
*/

public class AnatomiaClasses
{
    public static void main(String [] args)
    {
        System.out.print("Olá mundo, esteja feliz por estar vivo!");
    }
    
    //Declaração invalida de variaveis
    int numero&um = 1; //Simbolos permitidos são _ e $
    int 1numero = 1;   //Variavel não deve começar com numeros
    int numero um = 1; //Não pode ter espaço no nome de uma variavel
    int long = 1; //long faz parte das palavras reservadas da linguagem

    //Declaração válida de variaveis
    int numero$um = 1;
    int numero1   = 1;
    int numeroum  = 1;
    int longo     = 1;

}