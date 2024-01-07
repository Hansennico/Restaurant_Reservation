public class Reservation {
    private String id;
    private String customerName;
    private Table table;
    private int numberOfPeople;
    private String status;
    private List<Menu> menus;

    public Reservation(String id, String customerName, Table table, int numberOfPeople, String status) {
        this.id = id;
        this.customerName = customerName;
        this.table = table;
        this.numberOfPeople = numberOfPeople;
        this.status = status;
        this.menus = new ArrayList<>();
    }

}
