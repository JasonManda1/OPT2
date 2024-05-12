class Bar extends Item {
    private int uur;

    public Bar(String naam, int uur) {
        super(naam);
        this.uur = uur;
    }

    @Override
    public int duur() {
        return uur;
    }

    @Override
    public double berekenPrijs() {
        // Bar kost 50 euro per uur
        return uur * 50;
    }
}