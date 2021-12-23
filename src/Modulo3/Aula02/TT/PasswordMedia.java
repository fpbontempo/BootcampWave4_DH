package Modulo3.Aula02.TT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PasswordMedia extends Password{
    public PasswordMedia(String regex) {
        super(regex);
    }

    @Override
    public void setValue(String pwd) {

        Pattern pattern;
        Matcher matcher;
        boolean encontrou = false;

        try {
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(pwd);
            encontrou = matcher.find();
            if(encontrou){
                System.out.println("Senha média, aceita!!!");
            }else{
                System.out.println("Senha invalida, tente novamente, Deu RUIM!!!");
            }
        }catch (PatternSyntaxException pse){
            System.out.println("Algo de errado não está certo!");
        }

    }
}
