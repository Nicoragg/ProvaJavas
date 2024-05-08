package Models;

import java.time.LocalTime;

public abstract class Veiculo {
    private LocalTime hora, hora2;
    private int numberticket;
    private float valueticket;

    public Veiculo(String hora, String hora2, int numberticket, float valueticket) {
        this.hora = LocalTime.parse(hora);
        this.hora2 = LocalTime.parse(hora2);
        this.numberticket = numberticket;
        this.valueticket = valueticket;
    }

    public int getNumberticket() {
        return numberticket;
    }

    public void setNumberticket(int numberticket) {
        this.numberticket = numberticket;
    }

    public float getValueticket() {
        return valueticket;
    }

    public void setValueticket(float valueticket) {
        this.valueticket = valueticket;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalTime getHora2() {
        return hora2;
    }

    public void setHora2(LocalTime hora2) {
        this.hora2 = hora2;
    }

    @Override
    public abstract String toString();

}
