// Уровень 1.Написать примеры  программ в которых могут возникнуть проверяемые и непроверяемые исключения, обработать
// их непосредственно в методе а также в месте вызова метода.


public class ExceptionZadachiOdin {
    public static void main(String[] args) {
        //int numbers[] = new int[7];
        // numbers[8] = 74;
        try { int numbers[] = new int[7];
            numbers[8] = 74;
            System.out.println(numbers[8]);
        } catch (Exception za) {
            za.printStackTrace();

        } //catch (ArrayIndexOutOfBoundsException za) {      // Սա էլ նույն խնդրի լուծման երկրոդ տարբերակն է
        //System.out.println("Nshvac index@ durs e zangvaci erkarutyunic");
        //}
        System.out.println("cragri avart");
    }

}
