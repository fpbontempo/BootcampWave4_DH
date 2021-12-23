package Modulo3.Aula02.TT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PasswordFraca extends Password{
    public PasswordFraca(String regex) {
        super(regex);
    }

    @Override
    public void setValue(String pwd) {
        //^[\w]+$/
        Pattern pattern;
        Matcher matcher;
        boolean encontrou = false;

        try {
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(pwd);
            encontrou = matcher.find();
            if(encontrou){
                System.out.println("Deu BOM!!!");
            }else{
                System.out.println("Deu RUIM!!!");
            }
        }catch (PatternSyntaxException pse){
            System.out.println("Algo de errado não está certo!");
        }
    }
}
