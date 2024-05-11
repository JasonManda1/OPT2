abstract class Item implements Verhuurbaar {
    String naam;

    public Item(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}