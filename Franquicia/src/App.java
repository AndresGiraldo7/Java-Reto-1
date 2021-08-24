public class App {
    public static void main(String[] args) throws Exception {
        Franquicia objFran = new Franquicia();
        System.out.println(objFran.compararFranquicia(12, 1000, 0.10));
        System.out.println(objFran.compararFranquicia(24, 2000, 0));
    }
}
