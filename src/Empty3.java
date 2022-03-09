public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        // Суммируются числа от 1 до 5
        for (i = 1; i <= 5 ; sum += i++); // если убрать ; результат - пошагово выполняется цикл
            System.out.println("Сумма: " + sum); // если поставить ; результат - полная сумма в цикле
        }
    }
