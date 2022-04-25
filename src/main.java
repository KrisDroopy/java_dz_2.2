public class main {
    public static void main(String[] args) {

        int balance = 265; // Текущий баланс
        int replenishment = 1600; // Сумма пополнения

        int total;
        if (replenishment > 1000) {
            int bonus = replenishment / 100;
            total = balance + replenishment + bonus;
            System.out.println("Начисленно бонусных рублей: " + bonus);
            System.out.println("Текущий баланс: " + total);
        } else {
            total = balance + replenishment;
            System.out.println("Начисленно бонусов: 0");
            System.out.println("Текущий баланс: " + total);
        }
    }
}
