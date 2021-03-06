package swing_study.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class JRadionButtonEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "Image" + File.separator;
	private ImageIcon[] icons = { new ImageIcon(imgPath + "apple.jpg"), new ImageIcon(imgPath + "pear.jpg"),
			new ImageIcon(imgPath + "cherry.jpg") };
	private JLabel lblImg;

	/**
	 * Create the frame.
	 */
	public JRadionButtonEx() {
		initialize();
	}

	private void initialize() {
		setTitle("라디오 버튼 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pLeft = new JPanel();
		pLeft.setBorder(new TitledBorder(null, "간단한 라디오버튼", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);

		CustomRadioButton pRadio = new CustomRadioButton();
		pLeft.add(pRadio);

		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "응용 예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
		pRight.setLayout(new BorderLayout(0, 0));

		CustomRadioButton panel = new CustomRadioButton();
		pRight.add(panel, BorderLayout.NORTH);

		lblImg = new JLabel("New label");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		pRight.add(lblImg, BorderLayout.CENTER);

		for (JRadioButton r : panel.getRdBtns()) {
			r.addItemListener(this);
		}
		
//		panel.getRdbtnApple().addItemListener(this);
//		panel.getRdbtnPear().addItemListener(this);
//		panel.getRdbtnCherry().addItemListener(this);
		
		
		panel.getRdbtnApple().setSelected(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton rd = (JRadioButton) e.getSource();
		if (e.getStateChange() == ItemEvent.SELECTED) {
//			JOptionPane.showMessageDialog(null, rd.getText());
			String text = rd.getText();
			switch(text) {
			case "사과":
				lblImg.setIcon(icons[0]);
				lblImg.setText("사과");
				break;
			case "배":
				lblImg.setIcon(icons[1]);
				lblImg.setText("배");
				break;
			case "체리":
				lblImg.setIcon(icons[2]);
				lblImg.setText("체리");
				break;
				
			}
		}
	}

}
