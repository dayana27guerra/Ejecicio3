public class Parte2 {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.aumentopuerta();
        System.out.println(micoche.puertas);
    }

    static class   coche {
        public int puertas=4;

        public void aumentopuerta(){
            this.puertas++;
        }
    }
}
