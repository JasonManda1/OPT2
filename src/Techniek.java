class Techniek extends Item {
    private int uur;
    private double pricePerHour;

    public Techniek(String naam, int uur) {
        super(naam);
        this.uur = uur;
    }

    @Override
    public int duur() {
        return uur;
    }

    @Override
    public double berekenPrijs() {
        // Techniek kost 40 euro per uur
        return uur * 40;
    }

}