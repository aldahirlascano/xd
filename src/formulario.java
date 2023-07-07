import javax.swing.*;

public class formulario {
    private JTextField Nombre;
    private JTextField Cédula;
    private JTextField Edad;
    private JButton Guardar;
    private JButton Cargar;
    private JPanel forma;
    //hola

    public static void main(String[] args) {
        JFrame frame = new JFrame("formulario");
        frame.setContentPane(new formulario().forma);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
        });
}}
