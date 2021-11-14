package progmatic;

public class Main {


    public static void main(String[] args) {


    }


    static UrhajoKK[] otUrhajoGeneralasa() {
        return new UrhajoKK[]{
                new UrhajoKK(2250, "Alpha-1", 2100),
                new UrhajoKK(2055, "Beta-2", 1800),
                new UrhajoKK(2054, "Gamma-3", 1994),
                new UrhajoKK(2249, "Alpha-2", 2008),
                new UrhajoKK(2230, "Beta-4", 2133),
        };
    }

    static UrhajoKK[] tizUrhajoGeneralasa() {
        return new UrhajoKK[]{
                new UrhajoKK(2250, "Alpha-1", 2100),
                new UrhajoKK(2055, "Beta-2", 1800),
                new UrhajoKK(2054, "Gamma-3", 1994),
                new UrhajoKK(2249, "Alpha-2", 2008),
                new UrhajoKK(2230, "Beta-4", 2133),
                new UrhajoKK(2231, "Gamma-5", 1999),
                new UrhajoKK(2288, "Alfa-6", 2000),
                new UrhajoKK(2100, "Beta-7", 1744),
                new UrhajoKK(2222, "Gamma-8", 1467),
                new UrhajoKK(2111, "Alpha-9", 457),


        };
    }


    private static void adatlap(UrhajoKK urhajo) {

        System.out.println("Építési Év:\t" + urhajo.getEpitesiEv());
        System.out.println("Típus:\t" + urhajo.getTipus());
        urhajo.setAktualisSebesseg(2000);
        System.out.println("Aktuális sebesség:\t" + urhajo.getAktualisSebesseg());
        System.out.println("Magasság:\t" + urhajo.getMagassag());
        System.out.println("Szélesség:\t" + urhajo.getSzelesseg());
        System.out.println("Hossz:\t" + urhajo.getHossz());
        System.out.println("Térfogat:\t" + urhajo.getTerfogat());
        System.out.println();

    }
}
