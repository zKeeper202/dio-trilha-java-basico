public class ExemploBreakContinue 
{
	public static void main(String[] args) 
    {
	
	for(int numero = 1; numero <=5; numero ++)
    {
		if(numero==3)
			break; //Podemos usar "continue;" para interromper a iteracao atual ao inves de todo o laco
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ?

    }
}