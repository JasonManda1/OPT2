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
}