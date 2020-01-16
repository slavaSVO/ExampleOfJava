import java.util.Scanner;

public class ScanExample {
    private Scanner sysScan = new Scanner(System.in);//Сканер який зчитує дані введені в консолі
    private Scanner txtScan = new Scanner("Люблю тебя, Петра творенье,\n" +
            "Люблю твой строгий, стройный вид,\n" +
            "Невы державное теченье,\n" +
            "Береговой ее гранит.\n" +
            "1812год");//Сканер який зчитує дані із текстового рядку передагого йому як параметр

    public void searchInText() {
        while (txtScan.hasNext()){
            String line = txtScan.nextLine();
            System.out.println(line);
        }
    }

    public void searchInSystemScan (){
        System.out.println("Введіть ціле число");
        int nInt;
        nInt = sysScan.nextInt();
        System.out.println("Введіть числи в форматі real (x.y)");
        double nDouble;
        nDouble = sysScan.nextDouble();
    }


}
