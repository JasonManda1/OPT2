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
}