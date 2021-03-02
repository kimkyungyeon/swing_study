package swing_study.layout;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelGrid extends JPanel {
	private JTextField tfName;
	private JTextField tfNo;
	private JTextField tfClass;
	private JTextField tfSubject;

	/**
	 * Create the panel.
	 */
	public PanelGrid() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblName = new JLabel("이름");
		lblName.setOpaque(true);
		lblName.setBackground(Color.ORANGE);
		lblName.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblName);
		
		tfName = new JTextField();
		add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNo = new JLabel("학번");
		lblNo.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblNo);
		
		tfNo = new JTextField();
		add(tfNo);
		tfNo.setColumns(10);
		
		JLabel lblClass = new JLabel("학과");
		lblClass.setBackground(Color.GREEN);
		lblClass.setOpaque(true);
		lblClass.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblClass);
		
		tfClass = new JTextField();
		tfClass.setColumns(10);
		add(tfClass);
		
		JLabel lblSubject = new JLabel("과목");
		lblSubject.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblSubject);
		
		tfSubject = new JTextField();
		tfSubject.setColumns(10);
		add(tfSubject);
	}

}
