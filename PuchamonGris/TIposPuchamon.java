package PuchamonGris;

public abstract class TIposPuchamon {
    String ElementoPuchamon;

    public TIposPuchamon(String ElementoPuchamon) {
        this.ElementoPuchamon = ElementoPuchamon;

    }
    public String getElementoPuchamon() {
        return ElementoPuchamon;
    }

    public void setElementoPuchamon(String ElementoPuchamon) {
        this.ElementoPuchamon = ElementoPuchamon;
    }

    public abstract void EscogerElementoPuchamon();
}