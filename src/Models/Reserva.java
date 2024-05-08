package Models;

import java.time.LocalDate;

import Models.Super.Veiculo;

public class Reserva implements Comparable<Reserva> {
    private int id;
    private String origem, destino;
    private LocalDate dataInício, dateEnd;
    private float value;
    private Hospedagem ho;
    private Veiculo vehi;
    private static int nextId = 1;

    public Reserva(int id, String origem, String destino, String dataInício, String dateEnd, float value,
            Hospedagem ho, Veiculo vehi) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.dataInício = LocalDate.parse(dataInício);
        this.dateEnd = LocalDate.parse(dateEnd);
        this.ho = ho;
        this.vehi = vehi;
        this.value = value;

    }

    public Reserva(String origem, String destino, String dataInício, String dateEnd,
            Hospedagem ho, Veiculo vehi) {
        this.id = nextId++;
        this.origem = origem;
        this.destino = destino;
        this.dataInício = LocalDate.parse(dataInício);
        this.dateEnd = LocalDate.parse(dateEnd);
        this.value = ho.getValuePerson() + vehi.getValueticket();
        this.ho = ho;
        this.vehi = vehi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getDataInício() {
        return dataInício;
    }

    public void setDataInício(LocalDate dataInício) {
        this.dataInício = dataInício;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Hospedagem getHo() {
        return ho;
    }

    public void setHo(Hospedagem ho) {
        this.ho = ho;
    }

    public Veiculo getVehi() {
        return vehi;
    }

    public void setVehi(Veiculo vehi) {
        this.vehi = vehi;
    }

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", origem=" + origem + ", destino=" + destino + ", data de Início=" + dataInício
                + ", date do fim=" + dateEnd + ", Valor=" + value + ", Hospedagem=" + ho + ", Veiculo=" + vehi + "]";
    }

    @Override
    public int compareTo(Reserva o) {
        if (o.getValue() > this.getValue()) {
            return -1;
        } else if (o.getValue() < this.getValue()) {
            return 1;
        } else
            return 0;
    }
}
