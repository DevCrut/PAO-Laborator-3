public class Lapte extends Aliment{

    {
        this.setTip(Categorii.Lactate);
    }
    public Lapte(double calorii) {
        this.setCalorii(calorii);
    }
    public Lapte(double calorii, double pret) {
        this.setCalorii(calorii);
        this.setPret(pret);
    }
    public Lapte(double calorii, double pret, long expir) {
        this.setCalorii(calorii);
        this.setPret(pret);
        this.setDataExpirare(expir);
    }
    public Lapte(double calorii, double pret, long expir, String ingrediente) {
        this.setCalorii(calorii);
        this.setPret(pret);
        this.setDataExpirare(expir);
        this.setIngrediente(ingrediente);
    }
}
