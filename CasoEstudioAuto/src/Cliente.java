public class Cliente {
    private String cedula;
    private String primerApellido;

    public Cliente(String cedula, String primerApellido) {
        this.cedula = cedula;
        this.primerApellido = primerApellido;
    }

    
    public String getCedula() { return cedula; }
    public String getPrimerApellido() { return primerApellido; }
}

