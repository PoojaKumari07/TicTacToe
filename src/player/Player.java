package player;

public class Player {
    private String name;
    private String address;
    private int age;
    private String emailId;
    private String contactNo;
    private char symbol;

    public void setPlayerDetails(String name, int age, String address, String emailId, String contactNo, char symbol) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.symbol = symbol;
    }

    public void setPlayerNameAndSymbol(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public void getPlayerDetails() {
        System.out.println("player name: " + this.name);
        System.out.println("player address is: " + this.address);
        System.out.println("player age is: " + this.age);
        System.out.println("player contactNo is: " + this.contactNo);
        System.out.println("player emaiId is: " + this.emailId);
        System.out.println("player symbol is: " + this.symbol);

    }

    public String getPlayerName() {
        return this.name;

    }

    public char getPlayerSymbol() {
        return this.symbol;

    }

    public void getPlayerNameAndSymbol() {
        System.out.println(this.name);
        System.out.println(this.symbol);
    }
}