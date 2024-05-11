class Tafels extends Item {
    private int aantal;

    public Tafels(String naam, int aantal) {
        super(naam);
        this.aantal = aantal;
    }

    @Override
    public int duur() {
        return 0; // Tafels hebben geen verhuurduur
    }
}