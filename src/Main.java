public class Main {
    public static void main(String[] args) {
        double TicketPrice = 27894;
        int MiliPerRub = 20;

        int BonusMiles = (int) (TicketPrice / MiliPerRub);

        System.out.println("Начислено " + BonusMiles + " бонусных миль за покупку билета");
    }
}