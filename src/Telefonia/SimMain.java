package Telefonia;

public class SimMain {
    public static void main(String[] args) {
        Sim sim = new Sim("3331234567");

        sim.aggiungiChiamata("3391122334", 3);
        sim.aggiungiChiamata("3405566778", 5);
        sim.aggiungiChiamata("3289988776", 2);
        sim.aggiungiChiamata("3456677889", 7);
        sim.aggiungiChiamata("3312233445", 4);
        sim.aggiungiChiamata("3909876543", 6); // Sostituisce la più vecchia

        sim.stampa();
    }
}
