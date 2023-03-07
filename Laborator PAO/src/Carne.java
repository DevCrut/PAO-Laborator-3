public class Carne extends Aliment{

    {
        this.setTip(Categorii.Mezeluri);
    }
    public Carne(double calorii) {
        this.setCalorii(calorii);
    }
    public Carne(double calorii, double pret) {
        this.setCalorii(calorii);
        this.setPret(pret);
    }
    public Carne(double calorii, double pret, long expir) {
        this.setCalorii(calorii);
        this.setPret(pret);
        this.setDataExpirare(expir);
    }
    public Carne(double calorii, double pret, long expir, String ingrediente) {
        this.setCalorii(calorii);
        this.setPret(pret);
        this.setDataExpirare(expir);
        this.setIngrediente(ingrediente);
    }
}
