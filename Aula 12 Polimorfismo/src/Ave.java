public class Ave extends Animal{

    private String corPena;

    @Override
    public void aliementar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    public void fazerNinho() {
        System.out.println("Construindo Ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }    
}