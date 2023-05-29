package behavioral.strategy;

import java.util.Random;

public class ClientTest {

    private static void genaratePromoteStrategy(Random random, Ticket ticket) {
        int strateryIndex = random.nextInt(0, 4);
        switch (strateryIndex) {
            case 0:
                ticket.setPromotionStrategy(new NoDiscountStrategy());
                break;
            case 1:
                ticket.setPromotionStrategy(new HalfDiscountStrategy());
                break;
            case 3:
                ticket.setPromotionStrategy(new EightyDiscountStrategy());
                break;
            default:
                ticket.setPromotionStrategy(new QuarterDiscountStrategy());
                break;
        }
    }

    private static void logTicketDetails(Ticket ticket) {
        double promotePrice = ticket.getPromotePrice();
        System.out.println("Promoted price of " + ticket.getName() +
                " is " + ticket.getPromotePrice() + "\t [" +
                ticket.getPromoteStrategy().getClass().getSimpleName() + "]");
    }


    public static void main(String[] args) {
        System.out.println("Start getting tickets");
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Ticket ticket = new Ticket();
            ticket.setName("Ticket " + i);
            ticket.setPrice(50 * i);

            genaratePromoteStrategy(random, ticket);
            logTicketDetails(ticket);

            System.out.println("---------------------------------");

            genaratePromoteStrategy(random, ticket);
            logTicketDetails(ticket);
        }
    }

}
