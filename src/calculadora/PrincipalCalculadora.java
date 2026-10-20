package calculadora;

import javax.swing.JOptionPane; // (Necessário, mas oculto na imagem)

public class PrincipalCalculadora {

    public static void main(String[] args) {
        int x, y;
        String sx, sy;

        sx = JOptionPane.showInputDialog( null, "Digite o primeiro numero:", 
            "Primeiro número", JOptionPane.QUESTION_MESSAGE );

        x = Integer.parseInt( sx );

        sy = JOptionPane.showInputDialog( null, "Digite o segundo número:", 
            "Segundo número", JOptionPane.QUESTION_MESSAGE );

        y = Integer.parseInt( sy );

        // instanciação de um objeto da classe calculadora
        Calculadora calc = new Calculadora();

        JOptionPane.showMessageDialog(null, "somar: " + calc.somar( x, y ) );
        JOptionPane.showMessageDialog(null, "subtrair: " + calc.subtrair( x, y ) );
        JOptionPane.showMessageDialog(null, "multiplicar: " + calc.multiplicar( x, y ) );
        JOptionPane.showMessageDialog(null, "dividir: " + calc.dividir( x, y ) );

        System.exit( 0 );
    }
}