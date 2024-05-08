package Models.Super;

import java.time.LocalTime;

public abstract class Veiculo {
    private int numberticket;
    private float valueticket;
    private LocalTime hora, hora2;

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

    public Veiculo(int numberticket, float valueticket, String hora, String hora2) {
        this.numberticket = numberticket;
        this.valueticket = valueticket;
        this.hora = LocalTime.parse(hora);
        this.hora2 = LocalTime.parse(hora2);
    }

    @Override
    public abstract String toString();

}
