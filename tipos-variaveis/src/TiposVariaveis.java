public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        /*Casting = adaptar um valor com precisao maior *numeroNormal* 
        para uma precisao menor *numeroCurto2*
        */

        short numeroCurto2 = (short) numeroNormal;
    
        int numero = 5;

        numero = 10;

        System.out.println(numero);

        //Para seguir a convencao no final, a variavel deve ser escrita em CAIXA ALT
        final double PI = 3.14;

        /* PI = 3.15; - dara erro devido ao uso de final, caso tente alterar o valor dessa variavel*/
        
    }
}
