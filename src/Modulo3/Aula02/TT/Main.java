package Modulo3.Aula02.TT;

public class Main {
    public static void main(String[] args) {

        //Teste com OK
        Senha teste1 = new Senha("(\\d\\d)(\\w)");//"(\\d\\d)(\\w)"
        teste1.setValue("33d");

        //Teste deu RUIM
        Senha teste2 = new Senha("(\\d\\d)(\\w)");//"(\\d\\d)(\\w)"
        teste2.setValue("3aa3d");

        //Teste com Exception
        Senha teste3 = new Senha("???");//"(\\d\\d)(\\w)"
        teste3.setValue("33d");

        System.out.println("Calma que eu ainda não terminei o exercício rs");
    }
}
