/*Identação 
se não funcionar, está correto em BoletimEstudantil.java
*/

public class BoletimEstudantil
{
    //Incorreta
    public class static void(){
        int mediaFinal = 6;
        if(mediaFinal<6)
        System.out.println("REPROVADO");
        else if (mediaFinal == 6)
        System.out.println("PROVA MINERVA");
        else
        System.out.println("APROVADO");
    }

    public static void main(String[] args)
    {
        //Correta
        int mediaFinal = 5;
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }    
}