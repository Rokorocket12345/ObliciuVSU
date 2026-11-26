# Hijerarhija geometrijskih oblika

**Autor:** Roko Bači

## Hijerarhija klasa

- Oblik (apstraktna): naziv, povrsina(), opseg()
  - Krug: polumjer, promjer(), equals/hashCode po polumjeru
  - Pravokutnik: sirina, visina, jeLezeci()
    - Kvadrat: stranica (poseban slučaj pravokutnika)
  - Trokut: tri stranice, površina Heronovom formulom

## Pokretanje

```bash
mkdir out
javac -d out src/*.java
java -cp out Main
```
