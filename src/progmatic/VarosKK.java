package progmatic;


public class VarosKK {

    public final String nev;
    public UrhajoKK[] urhajo;
    public UrhajoKK simaUrhajo;
    public static int sebesseghatar = 2000;


    public VarosKK(String nev, UrhajoKK[] urhajo) {
        this.nev = nev;
        this.urhajo = urhajo;
    }

    public UrhajoKK[] getUrhajo() {
        return urhajo;
    }

    public void setUrhajo(UrhajoKK[] urhajo) {
        this.urhajo = urhajo;
    }


    public UrhajoKK[] setEgyUrhajo(int index, UrhajoKK urhajo) {
        if (index < 0 || index > this.urhajo.length) {
            throw new RuntimeException();
        }
        for (int i = 0; i < this.urhajo.length; i++) {
            this.urhajo[index] = urhajo;
        }
        return this.urhajo;
    }

    public UrhajoKK getEgyUrhajo(int index) {
        UrhajoKK segedUrhajo = null;
        if (index < 0 || index > this.urhajo.length) {
            throw new RuntimeException();
        } else {
            for (int i = 0; i < this.urhajo.length; i++) {
                if (i == index) {
                    segedUrhajo = urhajo[i];
                }
            }
        }
        return segedUrhajo;
    }


    public String getNev() {
        return nev;
    }

    public void urhajoLista() {

        System.out.println("====================");
        System.out.println(this.nev);
        System.out.println("====================");
        for (int i = 0; i < urhajo.length; i++) {
            System.out.println("Épitési év:\t" + urhajo[i].getEpitesiEv());
            System.out.println("Tipus:\t" + urhajo[i].tipus);
            System.out.println();
        }

    }

    public void leggyorsabbUrhajo() {
        System.out.println("====================");
        System.out.println(this.nev + " (leggyorsabb űrhajó)");
        System.out.println("====================");

        int max = Integer.MIN_VALUE;
        Integer index = null;
        for (int i = 0; i < urhajo.length; i++) {
            if (urhajo[i] != null) {
                if (urhajo[i].getAktualisSebesseg() > max) {
                    max = urhajo[i].getAktualisSebesseg();
                    index = i;
                }

            }
        }
        if (index != null) {
            System.out.println("Épitési év:\t" + urhajo[index].getEpitesiEv());
            System.out.println("Tipus:\t" + urhajo[index].tipus);
            System.out.println("Aktuális sebesség:\t" + urhajo[index].getAktualisSebesseg());
            System.out.println();
        }


    }

    public void tipusLista(String tipus) {

        System.out.println("====================");
        System.out.println(this.nev + " (" + tipus + " típusú űrhajók listája)");
        System.out.println("====================");

        Integer index = null;
        for (int i = 0; i < urhajo.length; i++) {
            if (urhajo[i] != null) {
                if (tipus.equals(urhajo[i].getTipus())) {
                    index = i;
                }
            }
        }

        System.out.println("Épitési év:\t" + urhajo[index].getEpitesiEv());
        System.out.println("Tipus:\t" + urhajo[index].tipus);
        System.out.println();


    }

    public void gyorshajtok() {

        System.out.println("====================");
        System.out.println(this.nev + "(gyorshajtó űrhajók listája)");
        System.out.println("====================");

        if (sebesseghatar <= 0) {
            System.out.println("Senki sem gyorshajtó!");
        }


        Integer index = null;
        for (int i = 0; i < urhajo.length; i++) {
            if (sebesseghatar < urhajo[i].getAktualisSebesseg()) {
                index = i;
                System.out.println("Épitési év:\t" + urhajo[index].getEpitesiEv());
                System.out.println("Tipus:\t" + urhajo[index].tipus);
                System.out.println("Sebesség:\t" + urhajo[index].getAktualisSebesseg());
                System.out.println();
            }
        }


    }
}


