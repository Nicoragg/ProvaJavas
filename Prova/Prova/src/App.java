import java.util.ArrayList;

import Controller.ReservController;
import Models.Aviao;
import Models.Barco;
import Models.Hospedagem;

public class App {
    public static void main(String[] args) throws Exception {
        Barco barco1 = new Barco(20, 800, "20:00", "13:22", 4);
        Barco barco2 = new Barco(60, 1000, "19:00", "21:22", 4);
        Barco barco3 = new Barco(60, 10000, "18:00", "20:22", 4);

        Aviao aviao1 = new Aviao(30, 1000, "20:00", "13:22", 30);
        Aviao aviao2 = new Aviao(20, 2000, "20:00", "13:21", 40);
        Aviao aviao3 = new Aviao(20, 3800, "19:00", "15:10", 50);

        Hospedagem hospedagem1 = new Hospedagem("Hotel Las pampas", 20, 20, 120);
        Hospedagem hospedagem2 = new Hospedagem("Hotel Waterlife", 34, 42, 160);
        Hospedagem hospedagem3 = new Hospedagem("Hotel AmericanDream", 34, 42, 800);

        ReservController reservas = new ReservController(new ArrayList<>());

        reservas.saveReserva("Brasil", "Suécia", "2021-10-09", "2023-12-11", hospedagem2, barco2);
        reservas.saveReserva("Africa do Sul", "EUA", "2022-06-11", "2022-11-19", hospedagem3, aviao3);
        reservas.saveReserva("Italia", "França", "2023-01-02", "2023-12-29", hospedagem1, barco1);

        // Removendo reserva 2
        reservas.removeReserva(2);

        // Adicionando reserva 4
        reservas.saveReserva("Canada", "Suécia", "2022-10-10", "2022-12-12", hospedagem1, aviao2);

        // Listando com apenas 3 reservas
        reservas.listReserva();

        System.out.println("\n");

        // Adicionando Reservas 5 6 7 e 8
        reservas.saveReserva("Canada", "China", "2023-10-01", "2024-12-17", hospedagem2, barco3);
        reservas.saveReserva("Brasil", "Chile", "2022-05-24", "2022-12-26", hospedagem1, aviao2);
        reservas.saveReserva("Inglaterra", "Suécia", "2022-12-10", "2023-03-12", hospedagem2, aviao2);
        reservas.saveReserva("Japão", "Alemanha", "2023-12-10", "2024-03-12", hospedagem1, aviao1);

        // Ordenando usando Método ordenar por valor
        reservas.sortByValue(reservas);
        System.out.println("\n" + "Ordenadas por Valor Crescente" + "\n");

        // Listando novamente após ordenação
        reservas.listReserva();
        System.out.println("\n");
    }
}
