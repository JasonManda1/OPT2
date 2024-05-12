class Tafels extends Item {
    private int uur;

    public Tafels(String naam, int uur) {
        super(naam);
        this.uur = uur;
    }

    @Override
    public int duur() {
        return 0;
    }

    @Override
    public double berekenPrijs() {
        // Tafels kosten 10 euro per uur
        return uur * 10;
    }
}