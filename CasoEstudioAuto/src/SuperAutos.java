import java.util.ArrayList;
import java.util.List;

public class SuperAutos {
    private List<Auto> autos;
    private List<Alquiler> alquileres;

    public SuperAutos() {
        autos = new ArrayList<>();
        alquileres = new ArrayList<>();
        inicializarAutos();
    }

    private void inicializarAutos() {
        autos.add(new Auto("BCA123", "Chevrolet", "2020", "Rojo"));
        autos.add(new Auto("DEF456", "Kia", "2016", "Negro"));
        autos.add(new Auto("GHI789", "Renault", "2017", "Blanco"));
        autos.add(new Auto("JKL012", "Suzuki", "2018", "Azul"));
        autos.add(new Auto("CBA098", "Kia", "2012", "Cafe"));
        autos.add(new Auto("FAM235", "Renault", "2010", "Gris"));
        autos.add(new Auto("XPO101", "Suzuki", "2019", "Verde"));
        autos.add(new Auto("FTO367", "Chevrolet", "2020", "Amarillo"));
        autos.add(new Auto("TWQ550", "Kia", "2014", "Blanco"));
        autos.add(new Auto("BUJ457", "Suzuki", "2015", "Cafe"));
        
    }

    public List<Auto> getAutos() { return autos; }
    public List<Alquiler> getAlquileres() { return alquileres; }

    public Auto buscarAutoPorPlaca(String placa) {
        for (Auto auto : autos) {
            if (auto.getPlaca().equalsIgnoreCase(placa)) {
                return auto;
            }
        }
        return null;
    }

    public List<Auto> buscarAutosPorMarcaYModelo(String marca, String modelo) {
        List<Auto> resultado = new ArrayList<>();
        for (Auto auto : autos) {
            if (auto.getMarca().equalsIgnoreCase(marca) && auto.getModelo().equalsIgnoreCase(modelo)) {
                resultado.add(auto);
            }
        }
        return resultado;
    }

    public void registrarAlquiler(Auto auto, Cliente cliente, int kilometrajeInicial) {
        Alquiler alquiler = new Alquiler(auto, cliente, kilometrajeInicial);
        alquileres.add(alquiler);
        auto.setAlquilado(true);
    }

    public void registrarDevolucion(Auto auto, int kilometrajeFinal) {
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getAuto().equals(auto) && auto.isAlquilado()) {
                if (kilometrajeFinal > alquiler.getKilometrajeInicial()) {
                    auto.setKilometrajeActual(kilometrajeFinal);
                    auto.setAlquilado(false);
                }
                break;
            }
        }
    }

    public int calcularCosto(Alquiler alquiler, int kilometrajeFinal) {
        int costo = (kilometrajeFinal - alquiler.getKilometrajeInicial()) * 1000;
        if (alquiler.isAccidentado()) {
            costo += 890000;
        }
        if (alquiler.isMultado()) {
            costo += 450000;
        }
        return costo;
    }
}

