public class Cereale extends Aliment{

    {
        this.setTip(Categorii.Paine);
    }
    public Cereale(double calorii) {
        this.setCalorii(calorii);
    }
    public Cereale(double calorii, double pret) {
        this.setCalorii(calorii);
        this.setPret(pret);
    }
    public Cereale(double calorii, double pret, long expir) {
        this.setCalorii(calorii);
        this.setPret(pret);
        this.setDataExpirare(expir);
    }
    public Cereale(double calorii, double pret, long expir, String ingrediente) {
        this.setCalorii(calorii);
        this.setPret(pret);
        this.setDataExpirare(expir);
        this.setIngrediente(ingrediente);
    }
}
