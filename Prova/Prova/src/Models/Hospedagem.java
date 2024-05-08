package Models;

public class Hospedagem {

    private String nomeHotel;
    private int numberRooms, quantpessoas;
    private float valuePerson;

    public Hospedagem(String nomeHotel, int numberRooms, int quantpessoas, float valuePerson) {
        this.nomeHotel = nomeHotel;
        this.numberRooms = numberRooms;
        this.quantpessoas = quantpessoas;
        this.valuePerson = valuePerson;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public void setQuantpessoas(int quantpessoas) {
        this.quantpessoas = quantpessoas;
    }

    public void setValuePerson(float valuePerson) {
        this.valuePerson = valuePerson;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public int getQuantpessoas() {
        return quantpessoas;
    }

    public float getValuePerson() {
        return valuePerson;
    }

    @Override
    public String toString() {
        return "Hospedagem [nomeHotel=" + nomeHotel + ", numberRooms=" + numberRooms + ", quantpessoas=" + quantpessoas
                + ", valuePerson=" + valuePerson + "]";
    }

}
