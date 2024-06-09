import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            String[] alunos =  {"Douglas" , "Guilherme" , "Patricia" , "Keeper"}; 
            
            double media = calculaMediaDaTurma(alunos, scan);

            System.out.printf("Media da turma %.1f", media);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Os campos devem ser preenchidos somente com numeros!!");
        }
    }

    public static double calculaMediaDaTurma(String[] alunos,  Scanner scanner)
    {
        double soma = 0;
        for (String aluno : alunos) 
        {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}