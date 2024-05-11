class Techniek extends Item {
    private int uur;

    public Techniek(String naam, int uur) {
        super(naam);
        this.uur = uur;
    }

    @Override
    public int duur() {
        return uur;
    }
}