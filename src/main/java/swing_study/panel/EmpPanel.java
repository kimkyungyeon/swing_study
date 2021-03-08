package swing_study.panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

public class EmpPanel extends JPanel {
	private String imgPath = System.getProperty("user.dir") + File.separator + "Image" + File.separator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public EmpPanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "사원 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pNorth = new JPanel();
		add(pNorth, BorderLayout.NORTH);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(imgPath+"suji.png"));
		pNorth.add(lblImg);
		
		JPanel pCenter = new JPanel();
		add(pCenter);
		pCenter.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel label = new JLabel("직원번호");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		pCenter.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		pCenter.add(textField);
		
		JLabel label_1 = new JLabel("직원이름");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		pCenter.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		pCenter.add(textField_1);
		
		JLabel label_2 = new JLabel("직책");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		pCenter.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		pCenter.add(comboBox);
		
		JLabel label_3 = new JLabel("상사");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		pCenter.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		pCenter.add(comboBox_1);
		
		JLabel label_4 = new JLabel("임금");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		pCenter.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		pCenter.add(textField_4);
		
		JLabel label_5 = new JLabel("부서");
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		pCenter.add(label_5);
		
		JComboBox comboBox_2 = new JComboBox();
		pCenter.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("부서");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		pCenter.add(lblNewLabel);
		
		JDateChooser dateChooser = new JDateChooser();
		pCenter.add(dateChooser);
		
		JLabel label_6 = new JLabel("비밀번호");
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		pCenter.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		pCenter.add(textField_2);
		
		JLabel label_7 = new JLabel("비밀번호 확인");
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		pCenter.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		pCenter.add(textField_3);
		
		JPanel pSouth = new JPanel();
		add(pSouth, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		pSouth.add(btnNewButton);
	}
	
	public void setEmployee (Employee employee) {
		
	}
	
	public Employee getEmployee() {
		return null;
	}
	public void clearTf() {
		
	}
	

}
