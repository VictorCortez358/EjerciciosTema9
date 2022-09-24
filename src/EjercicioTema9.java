public class EjercicioTema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Victor");
        cliente.setEdad(18);
        cliente.setTelefono(85858833);
        cliente.setCredito(800);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Rafael");
        trabajador.setEdad(18);
        trabajador.setTelefono(85858833);
        trabajador.setSalario(1000);

        System.out.println("El cliente es: "+ cliente.getNombre() + " con edad de "+cliente.getEdad() +
                " años,telefono "+ cliente.telefono+" y con un credio de $"+ cliente.getCredito());

        System.out.println("El trabajador es: "+ trabajador.getNombre() + " con edad de "+trabajador.getEdad() +
                " años,telefono "+ trabajador.telefono+" y con un salario de $"+ trabajador.getSalario());


    }
}

class Persona{
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String nombre;

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    int telefono;
}

class Cliente extends Persona{
    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    int credito;
}

class Trabajador extends Persona{
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    int salario;
}

