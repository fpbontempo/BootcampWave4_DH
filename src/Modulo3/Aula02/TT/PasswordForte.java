package Modulo3.Aula02.TT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PasswordForte extends Password{
    public PasswordForte(String regex) {
        super(regex);
    }

    @Override
    public void setValue(String pwd) {
        /*
        Comece a âncora
        (? =. * [A-Z]. * [A-Z]) Certifique-se de que a string tenha duas letras maiúsculas.
        (? =. * [! @ # $ & *]) Certifique-se de que tenha um caractere especial.
        (? =. * [0-9]. * [0-9]) Certifique-se de que tenha dois digitos.
        (? =. * [a-z]. * [a-z]. * [a-z]) Certifique-se de que a string tenha três letras minúsculas.
        . {8} Certifique-se de que a string tenha comprimento 8.
        $ End âncora.        End anchor.
        * */
        //

        Pattern pattern;
        Matcher matcher;
        boolean encontrou = false;

        try {
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(pwd);
            encontrou = matcher.find();
            if(encontrou){
                System.out.println("Senha super forte!!!");
            }else{
                System.out.println("Senha invalida, tente novamente, Deu RUIM!!!");
            }
        }catch (PatternSyntaxException pse){
            System.out.println("Algo de errado não está certo!");
        }

    }
}
