import java.util.Comparator;

public class Aliment {
    double pret;
    long dataExpirare;
    String ingrediente;
    double calorii;
    Categorii tip;

    public Categorii getTip() {
        return tip;
    }

    public void setTip(Categorii tip) {
        this.tip = tip;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public long getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(long dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getCalorii() {
        return calorii;
    }

    public void setCalorii(double calorii) {
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        return "Aliment{" +
                "calorii=" + calorii +
                '}';
    }
}
