public class Rezervation {

    String person;
    int date;

    Rezervation(String person, int date) {
        this.person = person;
        this.date = date;
    }

    public String getName() {
        return this.person;
    }

    public int getDate() {
        return this.date;
    }
}
