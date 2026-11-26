package hr.obskc.rokob.oblici.src;
// Kvadrat je poseban slučaj pravokutnika: širina i visina su jednake
public class Kvadrat extends Pravokutnik {

    public Kvadrat(String naziv, double stranica) {
        super(naziv, stranica, stranica);
    }

    public double getStranica() {
        return getSirina();
    }

    @Override
    public String toString() {
        return "Kvadrat[naziv=" + getNaziv() + ", a=" + getStranica() + "]";
    }
}
