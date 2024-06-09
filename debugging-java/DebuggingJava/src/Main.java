public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Iniciou metodo Main.");
        a();
        System.out.println("Finalizou metodo Main.");
    }

    static void a()
    {
        System.out.println("Iniciou metodo a");
        b();
        System.out.println("Finalizou metodo a");
    }

    static void b()
    {
        System.out.println("Iniciou metodo b");
        for(int i = 0; i <= 6; i++) System.out.println(i);
        c();
        System.out.println("Finalizou metodo b");
    }

    static void c()
    {
        System.out.println("Iniciou metodo c");
        Thread.dumpStack();
        System.out.println("Finalizou metodo c");
    }
}
