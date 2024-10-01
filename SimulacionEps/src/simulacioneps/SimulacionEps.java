/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacioneps;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class SimulacionEps extends JFrame {
    private JTextField txtCedula;
    private JComboBox<String> cmbCategoria, cmbServicio;
    private JTable tablaRegistros;
    private DefaultTableModel modeloTabla;
    private JLabel lblMensaje;
    private int contadorRegistros = 0;
    private JSlider sliderTiempo;
    private JLabel lblTiempoRestante;
    private Timer temporizador;
    private int tiempoRestante;
    private int indicePacienteActual = 0;

    public SimulacionEps() {
        super("Simulación de EPS");
        setLayout(new BorderLayout());

        // Panel para el registro del paciente
        JPanel panelRegistro = new JPanel(new GridLayout(5, 2, 10, 10));

        panelRegistro.add(new JLabel("Cédula:"));
        txtCedula = new JTextField();
        panelRegistro.add(txtCedula);

        panelRegistro.add(new JLabel("Categoría:"));
        cmbCategoria = new JComboBox<>(new String[]{"Menor de 60 años", "Adulto mayor", "Persona con discapacidad"});
        panelRegistro.add(cmbCategoria);

        panelRegistro.add(new JLabel("Servicio Solicitado:"));
        cmbServicio = new JComboBox<>(new String[]{"Consulta médico general", "Consulta médico especializado", "Prueba de laboratorio", "Imágenes diagnósticas"});
        panelRegistro.add(cmbServicio);

        JButton btnRegistrar = new JButton("Registrar Paciente");
        panelRegistro.add(btnRegistrar);

       // Panel para la tabla
        modeloTabla = new DefaultTableModel(new String[]{"Cédula", "Categoría", "Servicio", "Hora de Registro", "Hora de Salida"}, 0);
        tablaRegistros = new JTable(modeloTabla);

        // Ajustar ancho de la columna "Servicio"
        TableColumnModel columnModel = tablaRegistros.getColumnModel();
        columnModel.getColumn(2).setPreferredWidth(150); // Aumentar el ancho de la columna "Servicio"

        // Centrar texto en la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tablaRegistros.setDefaultRenderer(Object.class, centerRenderer);

        // Mensaje al superar 10 registros
        lblMensaje = new JLabel("");
        lblMensaje.setForeground(Color.RED);
        lblMensaje.setHorizontalAlignment(JLabel.CENTER);
        lblMensaje.setFont(new Font("Arial", Font.BOLD, 16)); // Aumentar tamaño de letra
        
        // Panel para la tabla
        modeloTabla = new DefaultTableModel(new String[]{"Cédula", "Categoría", "Servicio", "Hora de Registro", "Hora de Salida"}, 0);
        tablaRegistros = new JTable(modeloTabla);

        // Ajustar ancho de la columna "Servicio"
        TableColumnModel columnModel = tablaRegistros.getColumnModel();
        columnModel.getColumn(2).setPreferredWidth(150); // Aumentar el ancho de la columna "Servicio"

        // Centrar texto en la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tablaRegistros.setDefaultRenderer(Object.class, centerRenderer);

        // Mensaje al superar 10 registros
        lblMensaje = new JLabel("");
        lblMensaje.setForeground(Color.RED);
        lblMensaje.setHorizontalAlignment(JLabel.CENTER);
        lblMensaje.setFont(new Font("Arial", Font.BOLD, 16)); // Aumentar tamaño de letra
        
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimulacionEps());
    }
}
