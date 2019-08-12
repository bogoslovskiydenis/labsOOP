import java.util.regex.Pattern;

// 4 Вариант замена буквы в строке "a" / "o"
public class Main {

    public static void main(String[] args) {
        String oldString = "Метод split() позволяет разбить строку на подстроки по определенному разделителю";
        String newString = oldString.replace('а' , 'о');
        System.out.println("Old String :" + oldString);
        System.out.println("New string :" + newString);
    }
}
