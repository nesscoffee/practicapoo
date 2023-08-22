package track;

public class Obstaculo {
	private String tipoBomba;
    private int kilotones;
    private int daño;
    private int tiempoRestante;

    // Constructor obstaculo
    public Obstaculo(String tipoBomba, int kilotones, int daño, int tiempoRestante) {
        this.tipoBomba = tipoBomba;
        this.kilotones = kilotones;
        this.daño = daño;
        this.tiempoRestante = tiempoRestante;
    }

    public void detonar() {
        this.tiempoRestante = 0;
        System.out.println("La bomba ha explotado! Inflinge "+this.daño+"de daño.");
    }
    
    public void setKilotones(int kilotones) {
    	this.kilotones = kilotones;
    }
}
