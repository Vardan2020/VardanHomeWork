import java.util.Scanner;  //Уровень 2 Создать  собственное исключение и вызвать его в коде.

public class ExceptionZadachiDva {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            int x = 23;
            if(x>22){
                throw new Exception("Число х должно быть меньше или ровно 22");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage()); // ex.getMessage()-ի միջոցով դուրս ենք բերում վերևի տողը՝"Число х должно быть меньше или ровно 22"
        }
        System.out.println("Программа завершена");


    }
}
