class Tafels extends Item {
    private int uur;

    public Tafels(String naam, int aantal) {
        super(naam);
        this.uur = aantal;
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