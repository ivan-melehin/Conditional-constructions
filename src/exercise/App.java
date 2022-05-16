package exercise;

public class App {
    // BEGIN (write your solution here)
    public static void main(String[] args) {
        System.out.println(convertString("hello")); //input word
    };
    public static String convertString (String wordOne){
        var result = "";
        if(wordOne.equals("")){//check string for emptiness
            return wordOne ;
        }

        var letter = (wordOne.substring(0,1));// take from first letter// вынимаем из слова первыю букву
        var letterTwo = letter.charAt(0);//letter change type on char// букве меняем тип на символ

        if(App.checkCh(letterTwo)){//check letterTwo with method check// к переменной применяем метод check проверяем так ли это
            result = wordOne ;// yes да так
        }else {
            result = rev(wordOne);// no, and apply method rev// нет, не так, то применяем метод rev и переворачиваем строку
        }
        return result;
    };


    public static boolean checkCh(char c){//method checks whether or not to capitalize the letter// провеет заглавная ли буква
        return Character.isUpperCase(c);
    }
    public static String rev(String s){//method reverse string//  назваем метод rev и параметр String s
        return new StringBuilder(s).reverse().toString();// применяем метод StringBuilder к s переворачиваем с помощью reverse и переводим в строку toString()
    };


    // END
}

