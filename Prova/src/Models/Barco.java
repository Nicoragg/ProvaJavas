package Models;

import Models.Super.Veiculo;

public class Barco extends Veiculo {

    private int numbercabin;

    public Barco(int numberticket, float valueticket, String hora, String hora2, int numbercabin) {
        super(numberticket, valueticket, hora, hora2);
        this.numbercabin = numbercabin;
    }

    public int getNumbercabin() {
        return numbercabin;
    }

    public void setNumbercabin(int numbercabin) {
        this.numbercabin = numbercabin;
    }

    @Override
    public String toString() {
        return "Barco =" +
                " Hora da Partida:" + super.getHora() + " Hora de Retorno:" + super.getHora2() +
                " Número da Passagem:" + super.getNumberticket() + " Valor da Passagem:" + super.getValueticket() +
                " Número de cabines:" + getNumbercabin();
    }

}
