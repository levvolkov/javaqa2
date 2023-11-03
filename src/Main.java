public class Main {
    public static void main(String[] args) {
        short ticket = 15_676;// стоимости билета
        short bonusMile = 20;// рублей для одной бонусной мили

        System.out.println("Вам зачислено");
        System.out.println((ticket / bonusMile) + " бонусных миль за 1 купленный билет");

    }
}