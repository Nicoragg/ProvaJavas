package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Models.Hospedagem;
import Models.Reserva;
import Models.Super.Veiculo;

public class ReservController {
    List<Reserva> reservas = new ArrayList<>();

    @Override
    public String toString() {
        return "ReservController [reservas=" + reservas + "]";
    }

    public ReservController(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void saveReserva(String origem, String destino, String dataInício, String dateEnd, Hospedagem ho,
            Veiculo vehi) {

        try {
            Reserva res = new Reserva(origem, destino, dataInício, dateEnd, ho, vehi);
            reservas.add(res);

        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }

    }

    public Reserva searchReserva(int id) {
        return reservas.stream().filter(r -> r.getId() == id).findFirst().orElse(null);

    }

    public void removeReserva(int id) {

        try {
            reservas.remove(searchReserva(id));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro:" + "O Id não pertence a nenhuma reserva = " + e.getMessage());
        }
    }

    public void listReserva() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public void sortByValue(ReservController reservas2) {
        Collections.sort(reservas2.getReservas());
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

}
