package Easybooking.LP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class clsPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumViajeros;
	private JTable vuelos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clsPrincipal frame = new clsPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public clsPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setSize(700,700);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setTitle("Easy Booking");
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pArriba = new JPanel();
		contentPane.add(pArriba, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Origen");
		pArriba.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		pArriba.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Destino");
		pArriba.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		pArriba.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("N� viajeros");
		pArriba.add(lblNewLabel_2);
		
		txtNumViajeros = new JTextField();
		pArriba.add(txtNumViajeros);
		txtNumViajeros.setColumns(2);
		
		ButtonGroup grupoIda = new ButtonGroup();
		
		JRadioButton rdbtnIda = new JRadioButton("Ida");
		pArriba.add(rdbtnIda);
		
		JRadioButton rdbtnIdaVuelta = new JRadioButton("Ida y vuelta");
		pArriba.add(rdbtnIdaVuelta);
		
		grupoIda.add(rdbtnIda);
		grupoIda.add(rdbtnIdaVuelta);
		
		JButton btnBuscar = new JButton("Buscar");
		pArriba.add(btnBuscar);
		
		JPanel pAbajo= new JPanel();
		contentPane.add(pAbajo, BorderLayout.SOUTH);
		
		JPanel pIzquierda = new JPanel();
		contentPane.add(pIzquierda, BorderLayout.WEST);
		pIzquierda.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("");
		pIzquierda.add(label);
		
		JLabel label_1 = new JLabel("Precio");
		pIzquierda.add(label_1);
		
		JSlider slFiltroPrecio = new JSlider();
		slFiltroPrecio.setValue(900);
		slFiltroPrecio.setToolTipText("");
		slFiltroPrecio.setPaintTicks(true);
		slFiltroPrecio.setMajorTickSpacing(1000);
		slFiltroPrecio.setPaintLabels(true);
		slFiltroPrecio.setMaximum(1000);
		pIzquierda.add(slFiltroPrecio);
		
		JPanel pDerecha = new JPanel();
		contentPane.add(pDerecha, BorderLayout.EAST);
		
		JPanel pCentro = new JPanel();
		contentPane.add(pCentro, BorderLayout.CENTER);
		
		vuelos = new JTable();
		vuelos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		pCentro.add(vuelos);
		
		
	}

}
