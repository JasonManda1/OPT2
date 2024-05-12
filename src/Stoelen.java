class Stoelen extends Item {
    private int uur;

    public Stoelen(String naam, int uur) {
        super(naam);
        this.uur = uur;
    }

    @Override
    public int duur() {
        return uur;
    }

    @Override
    public double berekenPrijs() {
        // Stoelen kosten 5 euro per uur
        return uur * 5;
    }
}