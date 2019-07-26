package main ;

import static entidades.Mensaje.*;
import entidades.empleados.Salario;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main
{
    public static void main( String[] args )
    {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator(',');
        simbolo.setGroupingSeparator('.');
        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);
        Salario salario = new Salario();

        String horas = JOptionPane.showInputDialog(null, MENSAJE_PETICION_HORAS.getMensajes());
        String valorHoras = JOptionPane.showInputDialog(null, MESAJE_PETICION_VALOR_HORA.getMensajes());


        salario.setValorHora(Double.parseDouble(horas));
        salario.setHorasTrabajadas(Double.parseDouble(valorHoras));

        JOptionPane.showMessageDialog(null, MESAJE_SALARIO_PAGAR.getMensajes()+ formateador.format(salario.cantidadSalario()));

    }
}
