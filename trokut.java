package hr.obskc.rokob.oblici.src;

public class Trokut extends Oblik {

    private final double a;
    private final double b;
    private final double c;

    public Trokut(String naziv, double a, double b, double c) {
        super(naziv);
        if (!(a > 0) || !(b > 0) || !(c > 0)) {
            throw new IllegalArgumentException("Stranice trokuta moraju biti pozitivne");
        }
        // Nejednakost trokuta: zbroj svake dvije stranice veći je od treće
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Stranice ne zadovoljavaju nejednakost trokuta");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double povrsina() {
        // Heronova formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double opseg() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Trokut[naziv=" + getNaziv() + ", a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}
