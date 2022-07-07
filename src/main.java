public class main {
    public static void main(String[] args) {
        double balance = 200.97;
        double addition = 1100;
        int bonus;
        if (addition >= 1000) {
            bonus = (int) (addition / 100);
        } else {
            bonus = 0;
        }

        System.out.println("Вам начислено " + bonus + " рублей");

        double totalbill = balance + addition + bonus;
        System.out.println("Ваш итоговый счет " + totalbill + " рублей");
    }
}