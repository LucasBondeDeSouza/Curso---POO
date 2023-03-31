public class Reptil extends Animal {

    private String corEscama;

    @Override
    public void aliementar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}