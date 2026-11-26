package hr.obskc.rokob.oblici.src;
public class Main {

    public static void main(String[] args) {
        Oblik[] oblici = {
            new Krug("kotac", 0.35),
            new Krug("tanjur", 12),
            new Pravokutnik("vrata", 0.9, 2.0),
            new Pravokutnik("pozornica", 8, 5),
            new Kvadrat("plocica", 0.3),
            new Trokut("zastavica", 3, 4, 5)
        };

        System.out.println("=== Oblici ===");
        for (Oblik o : oblici) {
            System.out.printf("%s -> povrsina %.2f, opseg %.2f%n", o, o.povrsina(), o.opseg());
        }

        double ukupnaPovrsina = 0;
        for (Oblik o : oblici) {
            ukupnaPovrsina += o.povrsina();
        }
        System.out.printf("%nUkupna povrsina: %.2f%n", ukupnaPovrsina);

        Oblik najveci = oblici[0];
        for (Oblik o : oblici) {
            if (o.opseg() > najveci.opseg()) {
                najveci = o;
            }
        }
        System.out.printf("Najveci opseg: %s (%.2f)%n", najveci, najveci.opseg());

        System.out.println("\n=== Posebnosti pojedinih vrsta ===");
        for (Oblik o : oblici) {
            if (o instanceof Krug k) {
                System.out.printf("%s: promjer %.2f%n", k.getNaziv(), k.promjer());
            } else if (o instanceof Kvadrat kv) {
                // kvadrat je pravokutnik, ali ga izdvajamo: ne ispisuje se je li ležeći
                System.out.println(kv.getNaziv() + ": kvadrat sa stranicom " + kv.getStranica());
            } else if (o instanceof Pravokutnik p) {
                System.out.println(p.getNaziv() + (p.jeLezeci() ? ": ležeci pravokutnik" : ": nije lezeci pravokutnik"));
            }
        }

        System.out.println("\n=== Provjera neispravnih unosa ===");
        pokusaj(() -> new Krug("los krug", -1));
        pokusaj(() -> new Trokut("los trokut", 1, 2, 10));
        pokusaj(() -> new Kvadrat("  ", 2));

        System.out.println("\n=== equals i hashCode za krugove ===");
        Krug k1 = new Krug("prvi", 2);
        Krug k2 = new Krug("drugi", 2);
        System.out.println("k1.equals(k2): " + k1.equals(k2));
        System.out.println("isti hashCode: " + (k1.hashCode() == k2.hashCode()));
    }

    private static void pokusaj(Runnable stvaranje) {
        try {
            stvaranje.run();
            System.out.println("Oblik je stvoren (neocekivano)");
        } catch (IllegalArgumentException e) {
            System.out.println("Odbijeno: " + e.getMessage());
        }
    }
}
