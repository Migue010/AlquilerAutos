public class Auto {
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private int kilometrajeActual;
    private boolean alquilado;

    public Auto(String placa, String marca, String modelo, String color) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.alquilado = false;
    }

    // Getters y setters
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getColor() { return color; }
    public int getKilometrajeActual() { return kilometrajeActual; }
    public boolean isAlquilado() { return alquilado; }
    public void setKilometrajeActual(int kilometrajeActual) { this.kilometrajeActual = kilometrajeActual; }
    public void setAlquilado(boolean alquilado) { this.alquilado = alquilado; }
}

