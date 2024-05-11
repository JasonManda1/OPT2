// Subklassen voor verschillende verhuurbare items
class Theaterzaal extends Item {
    private int uur;

    public Theaterzaal(String naam, int uur) {
        super(naam);
        this.uur = uur;
    }

    @Override
    public int duur() {
        return uur;
    }
}