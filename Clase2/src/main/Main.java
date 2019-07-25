package main ;

import static enumerados.Constantes.*;
import static  enumerados.Valores.DOLAR ;


import static enumerados.Constantes.MENSAJE_CUADRO ;
import static enumerados.Constantes.MENSAJE_TITULO ;

import javax.swing.* ;

public class Main
{
    public static void main( String[] args )
    {
        String valor = JOptionPane.showInputDialog( null,MENSAJE_INGRESA_VALOR.getMensaje() ) ;
        int  val = Integer.parseInt( valor ) ;

        if ( val >= DOLAR.getValor() )
        {
            JOptionPane.showMessageDialog(null, MENSAJE_DOLAR_ALTO.getMensaje());
        }
        else
        {
            JOptionPane.showMessageDialog(null, MENSAJE_DOLAR_BAJO.getMensaje());

        }
        JOptionPane.showMessageDialog( null,MENSAJE_CUADRO.getMensaje(),MENSAJE_TITULO.getMensaje() ,
                JOptionPane.INFORMATION_MESSAGE ) ;
    }
}
