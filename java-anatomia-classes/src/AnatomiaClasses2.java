//Declaração de Variaveis e Métodos

public class AnatomiaClasses2
{
    //Variaveis
    public static void main(String [] args)
    {
        //Tipo nomeBemDefinido = "valor de acordo com a tipagem"
        String primeiroNome = "Guilherme";
        String segundoNome  = "Moreira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    //Metodos
    public static String nomeCompleto(String primeiroNome, String segundoNome)
    {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

    /*TipoRetorno NomeObjetivoNoInfinitivo (Parametro)
    int somar (int numero1, int numero2);
    */
   
}