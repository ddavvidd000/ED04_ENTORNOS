package com.ellago;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    public String obtenerNombre() {
        return getNombre();
    }

    public double estado() {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    public String obtenerCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    // Método para realizar operaciones específicas con cuenta1
    public void operativa_cuenta() {
        try {
            // Aquí puedes poner las operaciones específicas con cuenta1
            ingresar(1000); // Ejemplo: ingresamos 1000 unidades
            retirar(500);   // Ejemplo: retiramos 500 unidades
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        CCuenta cuenta1 = new CCuenta("Juan", "1234567890", 1000, 0.01);
        // Llamamos al método que realiza operaciones específicas con cuenta1
        cuenta1.operativa_cuenta();
    }
}
