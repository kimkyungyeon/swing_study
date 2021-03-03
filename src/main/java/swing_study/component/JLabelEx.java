package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class JLabelEx extends JFrame implements MouseListener {

	private JPanel contentPane;
	private String path = System.getProperty("user.dir") + File.separator + "Image"+ File.separator;
	private JLabel lblNorth;
	private JLabel lblSouth;
	private JLabel lblCenter;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public JLabelEx() {
		System.out.println(path);
		initialize();
	}
	private void initialize() {
		setTitle("Label");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNorth = new JLabel("사랑합니다.");
		lblNorth.addMouseListener(this);
		lblNorth.setBackground(Color.PINK);
		lblNorth.setOpaque(true);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNorth, BorderLayout.NORTH);
		
		lblCenter = new JLabel("사진");
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenter.setIcon(new ImageIcon(path + "suji.png"));
		contentPane.add(lblCenter, BorderLayout.CENTER);
		
		lblSouth = new JLabel("보고싶으면 전화하세요");
		lblSouth.setOpaque(true);
		lblSouth.setBackground(Color.GREEN);
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		lblSouth.setIcon(new ImageIcon(path +"lee.jpg"));
		contentPane.add(lblSouth, BorderLayout.SOUTH);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblNorth) {
			mouseClickedLblNewLabel(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblNewLabel(MouseEvent e) {
		lblCenter.setIcon(new ImageIcon(path +"lee.jpg"));
		lblSouth.setText("01065107277");
		JOptionPane.showMessageDialog(null, "변경완료");
		
	}
}
