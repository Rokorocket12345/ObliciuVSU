package hr.obskc.rokob.oblici.src;
import java.util.Objects;

public class Krug extends Oblik {

    private final double polumjer;

    public Krug(String naziv, double polumjer) {
        super(naziv);
        if (!(polumjer > 0)) {
            throw new IllegalArgumentException("Polumjer mora biti pozitivan");
        }
        this.polumjer = polumjer;
    }

    public double getPolumjer() {
        return polumjer;
    }

    // Postoji samo u klasi Krug, ne i u klasi Oblik
    public double promjer() {
        return 2 * polumjer;
    }

    @Override
    public double povrsina() {
        return Math.PI * polumjer * polumjer;
    }

    @Override
    public double opseg() {
        return 2 * Math.PI * polumjer;
    }

    @Override
    public String toString() {
        return "Krug[naziv=" + getNaziv() + ", r=" + polumjer + "]";
    }

    // Dva kruga su jednaka kada imaju jednak polumjer
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Krug drugi = (Krug) obj;
        return Double.compare(polumjer, drugi.polumjer) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(polumjer);
    }
}
