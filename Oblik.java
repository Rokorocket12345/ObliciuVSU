package hr.obskc.rokob.oblici.src;
// Apstraktna bazna klasa: općeniti "oblik" ne postoji sam za sebe,
// nego samo kao krug, pravokutnik, kvadrat ili trokut.
public abstract class Oblik {

    private final String naziv;

    public Oblik(String naziv) {
        if (naziv == null || naziv.isBlank()) {
            throw new IllegalArgumentException("Naziv oblika ne smije biti prazan");
        }
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    // Apstraktne metode: svaka konkretna klasa mora dati vlastitu implementaciju
    public abstract double povrsina();

    public abstract double opseg();

    @Override
    public String toString() {
        return "Oblik[naziv=" + naziv + "]";
    }
}
