public class Ticket {
  private String id;
  private String concertHall;
  private int eventCode;
  private long time;
  private boolean isPromo;
  private char stadiumSector;
  private double maxBackpackWeight;
  private double price;
  private long createdAt;

  public Ticket(String ticketID, String hall, int code, long eventTime, boolean promoStatus,
                char sector, double backpackWeight, double ticketPrice) {
    id = ticketID;
    concertHall = hall;
    eventCode = code;
    time = eventTime;
    isPromo = promoStatus;
    stadiumSector = sector;
    maxBackpackWeight = backpackWeight;
    price = ticketPrice;
    createdAt = System.currentTimeMillis();
  }

  public Ticket(String hall, int code, long eventTime) {
    concertHall = hall;
    eventCode = code;
    time = eventTime;
    createdAt = System.currentTimeMillis();
    isPromo = false;
    stadiumSector = 'A';
    maxBackpackWeight = 0.0;
    price = 0.0;
  }

  public String getId() { return id; }
  public String getConcertHall() { return concertHall; }
  public int getEventCode() { return eventCode; } // Added getEventCode
  public long getTime() { return time; }
  public boolean getIsPromo() { return isPromo; }
  public char getStadiumSector() { return stadiumSector; }
  public double getMaxBackpackWeight() { return maxBackpackWeight; }
  public double getPrice() { return price; }
  public long getCreatedAt() { return createdAt; }
}
