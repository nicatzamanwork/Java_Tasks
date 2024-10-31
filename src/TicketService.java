public class TicketService {
    public static void main(String[] args) {

        Ticket fullTicket = new Ticket("T123", "MainHall", 1, System.currentTimeMillis(),
                true, 'B', 5.0, 30.0);

        Ticket limitedTicket = new Ticket("SideHall", 2, System.currentTimeMillis());

        Ticket emptyTicket = new Ticket("EmptyHall", 0, System.currentTimeMillis());

        System.out.println("Full Ticket Details:");
        printTicketDetails(fullTicket);

        System.out.println("\nLimited Ticket Details:");
        printTicketDetails(limitedTicket);

        System.out.println("\nEmpty Ticket Details:");
        printTicketDetails(emptyTicket);
    }

    private static void printTicketDetails(Ticket ticket) {
        System.out.println("Ticket ID: " + (ticket.getId() != null ? ticket.getId() : "N/A"));
        System.out.println("Concert Hall: " + ticket.getConcertHall());
        System.out.println("Event Code: " + ticket.getEventCode());
        System.out.println("Event Time (Unix Timestamp): " + ticket.getTime());
        System.out.println("Promotional Ticket: " + (ticket.getIsPromo() ? "Yes" : "No"));
        System.out.println("Stadium Sector: " + ticket.getStadiumSector());
        System.out.println("Max Backpack Weight Allowed: " + ticket.getMaxBackpackWeight() + " kg");
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println("Ticket Created At: " + ticket.getCreatedAt());
    }
}
