package Modulo3.Aula02.TT;

public class Main {
    public static void main(String[] args) {

        System.out.println("====Testes com senha fraca");
        //Teste com OK
        Password teste1 = new PasswordFraca("^[\\w]");//Aceita apenas letras
        teste1.setValue("33d");

        //Teste deu RUIM
        Password teste2 = new PasswordFraca("^[\\w]+$/");
        teste2.setValue("3aa3d");

        //Teste com Exception
        Password teste3 = new PasswordFraca("???");
        teste3.setValue("33d");

        System.out.println("====Testes com senha media====");
        //Teste com OK
        Password teste4 = new PasswordFraca("^[a-zA-Z]{8}\\d");//Minimo de 8 letras e um número
        teste4.setValue("FelipePb10");

        //Teste deu RUIM
        Password teste5 = new PasswordFraca("^[a-zA-Z]{8}\\d");
        teste5.setValue("3aa3d");

        //Teste com Exception
        Password teste6 = new PasswordFraca("???");
        teste6.setValue("33d");

        System.out.println("====Testes com senha forte");
        //Teste com OK
        Password teste7 = new PasswordForte("^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z]" +
                ".*[a-z]).{8}$");
        teste7.setValue("FE@12lip");

        //Teste deu RUIM
        Password teste8 = new PasswordForte("^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z]" +
                ".*[a-z]).{8}$");
        teste8.setValue("3aa3d");

        //Teste com Exception
        Password teste9 = new PasswordForte("???");
        teste9.setValue("33d");

        System.out.println("Fim do processo");
    }
}
