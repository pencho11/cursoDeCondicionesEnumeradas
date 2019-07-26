package entidades;

public enum Mensaje
{
    MENSAJE_PETICION_HORAS( "Ingrese las horas trabajadas: "),
    MESAJE_PETICION_VALOR_HORA( "Ingresa el valor de horas trabajadas"),
    MESAJE_SALARIO_PAGAR ( "El salario a pagar es: $");

    private String mensajes ;

    Mensaje(String s) {
        this.mensajes = s;
    }

    public String getMensajes() {
        return mensajes;
    }




}
