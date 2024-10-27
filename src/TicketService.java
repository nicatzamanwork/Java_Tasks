public class TicketService {
    public static void main(String[] args) {
        Ticket fullTicket = new Ticket("T123", "MainHall", 101, System.currentTimeMillis(),
                true, 'B', 5.0, 30.0);

        Ticket limitedTicket = new Ticket("SideHall", 102, System.currentTimeMillis());

        Ticket emptyTicket = new Ticket("EmptyHall", 0, System.currentTimeMillis());

        System.out.println("Full Ticket Details:");
        printTicketDetails(fullTicket);

        System.out.println("\nLimited Ticket Details:");
        printTicketDetails(limitedTicket);

        System.out.println("\nEmpty Ticket Details:");
        printTicketDetails(emptyTicket);
    }

    private static void printTicketDetails(Ticket ticket) {
        System.out.println("ID: " + ticket.getId());
        System.out.println("Concert Hall: " + ticket.getConcertHall());
        System.out.println("Event Code: " + ticket.getEventCode());
        System.out.println("Time: " + ticket.getTime());
        System.out.println("Is Promo: " + ticket.getIsPromo());
        System.out.println("Stadium Sector: " + ticket.getStadiumSector());
        System.out.println("Max Backpack Weight: " + ticket.getMaxBackpackWeight());
        System.out.println("Price: " + ticket.getPrice());
        System.out.println("Created At: " + ticket.getCreatedAt());
    }
}
