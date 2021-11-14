package progmatic;

public class UrhajoKK {
  private final int epitesiEv;
  public String tipus;
  private int aktualisSebesseg;
  private int magassag;
  private int szelesseg;
  private int hossz;
  private boolean leszabajozva;


  public UrhajoKK(int epitesiEv) {
    this.epitesiEv = epitesiEv;
  }

  public UrhajoKK(int epitesiEv, String tipus,int aktualisSebesseg) {
    this.epitesiEv = epitesiEv;
    this.tipus = tipus;
    this.aktualisSebesseg = aktualisSebesseg;
  }

  public UrhajoKK(int epitesiEv, String tipus, int aktualisSebesseg, int magassag, int szelesseg, int hossz) {
    this.epitesiEv = epitesiEv;
    this.tipus = tipus;
    this.aktualisSebesseg = aktualisSebesseg;
    this.magassag = magassag;
    this.szelesseg = szelesseg;
    this.hossz = hossz;
  }

  public boolean isLeszabajozva() {
    return leszabajozva;
  }

  public void setLeszabajozva(boolean leszabajozva) {
    this.leszabajozva = leszabajozva;
  }

  public int getEpitesiEv() {
    return epitesiEv;
  }

  public String getTipus() {
    return tipus;
  }

  public void setTipus(String tipus) {
    this.tipus = tipus;
  }

  public int getAktualisSebesseg() {
    return aktualisSebesseg;
  }

  public void setAktualisSebesseg(int aktualisSebesseg) {
    if (aktualisSebesseg > 2500 || leszabajozva) {
      System.out.println("Leszabájozva!");
    }
    this.aktualisSebesseg = aktualisSebesseg;
  }

  public int getMagassag() {
    return magassag;
  }

  public void setMagassag(int magassag) {
    this.magassag = magassag;
  }

  public int getSzelesseg() {
    return szelesseg;
  }

  public void setSzelesseg(int szelesseg) {
    this.szelesseg = szelesseg;
  }

  public int getHossz() {
    return hossz;
  }

  public void setHossz(int hossz) {
    this.hossz = hossz;
  }

  public int getTerfogat() {
    return this.magassag * this.szelesseg * this.hossz;
  }


  @Override
  public String toString() {
    return "UrhajoKK{" +
        "epitesiEv=" + epitesiEv +
        ", tipus='" + tipus + '\'' +
        ", aktualisSebesseg=" + aktualisSebesseg +
        ", magassag=" + magassag +
        ", szelesseg=" + szelesseg +
        ", hossz=" + hossz +
        ", leszabajozva=" + leszabajozva +
        '}';
  }
}
