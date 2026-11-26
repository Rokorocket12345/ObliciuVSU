package hr.obskc.rokob.oblici.src;

public class Pravokutnik extends Oblik {

    private final double sirina;
    private final double visina;

    public Pravokutnik(String naziv, double sirina, double visina) {
        super(naziv);
        if (!(sirina > 0) || !(visina > 0)) {
            throw new IllegalArgumentException("Širina i visina moraju biti pozitivne");
        }
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public double getVisina() {
        return visina;
    }

    // Postoji samo u klasi Pravokutnik, ne i u klasi Oblik
    public boolean jeLezeci() {
        return sirina > visina;
    }

    @Override
    public double povrsina() {
        return sirina * visina;
    }

    @Override
    public double opseg() {
        return 2 * (sirina + visina);
    }

    @Override
    public String toString() {
        return "Pravokutnik[naziv=" + getNaziv() + ", sirina=" + sirina + ", visina=" + visina + "]";
    }
}
