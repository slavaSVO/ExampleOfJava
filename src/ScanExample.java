import java.util.Scanner;
//import java.util.InputMismatchException;

public class ScanExample {
    private Scanner sysScan = new Scanner(System.in);//Сканер який зчитує дані введені в консолі
    private Scanner txtScan = new Scanner("Люблю тебя, Петра творенье,\n" +
            "Люблю твой строгий, стройный вид,\n" +
            "Невы державное теченье,\n" +
            "Береговой ее гранит.\n" +
            "1812год");//Сканер який зчитує дані із текстового рядку передагого йому як параметр

    public void searchInText() {
        while (txtScan.hasNext()) {
            String line = txtScan.nextLine();
            System.out.println(line);
        }
    }

    public void searchInSystemScan() {
        System.out.print("Введіть ціле число : ");
        int nInt = 0;
        try {
            if (sysScan.hasNextInt()) {
                nInt = sysScan.nextInt();
            } else {
                System.out.println("This is not integer.");
            }
        } catch (java.util.InputMismatchException e) {
            String str = sysScan.nextLine();
            nInt = 0;
            System.out.println("Введено не корректне число. Ви ввели  = " + str + " Программа замінила неконектне число на 0");
        }
        System.out.print("Введіть числи з плаваючою комою в форматі x,y: ");
        double nDouble;
        try {
            nDouble = sysScan.nextDouble();
        } catch (java.util.InputMismatchException e) {
            String str = sysScan.nextLine();
            nDouble = 0.0;
            System.out.println("Введено не корректне число. Ви ввели  = " + str + " Программа замінила неконектне число на 0,0");
        }
        System.out.println("Ціле число = " + nInt + " Число з плаваючою комою = " + nDouble);
    }


}
