public class App {
    public static void main(String[] args){
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        c1.status();

        System.out.println("**************************************************");

        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
        c2.status();
    }
}
