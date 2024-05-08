package Models;

import Models.Super.Veiculo;

public class Aviao extends Veiculo {

    private float weightbag;

    public Aviao(int numberticket, float valueticket, String hora, String hora2, float weightbag) {
        super(numberticket, valueticket, hora, hora2);
        this.weightbag = weightbag;
    }

    public float getWeightbag() {
        return weightbag;
    }

    public void setWeightbag(float weightbag) {
        this.weightbag = weightbag;
    }

    @Override
    public String toString() {
        return "Aviao =" +
                " Hora da Partida:" + super.getHora() + " Hora de Retorno:" + super.getHora2() +
                " Número da Passagem:" + super.getNumberticket() + " Valor da Passagem:" + super.getValueticket() +
                " Peso da Bagagem:" + getWeightbag();
    }
}
