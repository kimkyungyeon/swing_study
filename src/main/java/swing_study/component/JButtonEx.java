package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JButtonEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "Image"+ File.separator;
	private JToggleButton tglbtn;


	public JButtonEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JButton && JToggleButton 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));
		
		JButton btn01 = new JButton("call~~");
		btn01.setIcon(new ImageIcon(imgPath + "tel1.gif"));
		btn01.setRolloverIcon(new ImageIcon(imgPath + "tel2.gif"));
		btn01.setPressedIcon(new ImageIcon(imgPath + "tel3.gif"));
		pLeft.add(btn01);
		
		tglbtn = new JToggleButton("눌러봐");
		tglbtn.addActionListener(this);
		pLeft.add(tglbtn);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pTop = new JPanel();
		pTop.setBorder(new TitledBorder(null, "수평정렬", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pTop);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		MyButton btn02 = new MyButton();
		btn02.setHorizontalAlignment(SwingConstants.LEFT);
		btn02.setText("left");
		pTop.add(btn02);
		
		MyButton btn03 = new MyButton();
		btn03.setText("center");
		pTop.add(btn03);
		
		MyButton btn04 = new MyButton();
		btn04.setText("right");
		btn04.setHorizontalAlignment(SwingConstants.TRAILING);
		pTop.add(btn04);
		
		JPanel pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder(null, "\uC218\uC9C1\uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pBottom);
		pBottom.setLayout(new GridLayout(0, 3, 0, 0));
		
		MyButton btn05 = new MyButton();
		btn05.setVerticalAlignment(SwingConstants.TOP);
		btn05.setText("top");
		pBottom.add(btn05);
		
		MyButton btn06 = new MyButton();
		btn06.setText("center");
		pBottom.add(btn06);
		
		MyButton btn07 = new MyButton();
		btn07.setVerticalAlignment(SwingConstants.BOTTOM);
		btn07.setText("bottom");
		pBottom.add(btn07);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tglbtn) {
			actionPerformedTglbtn(e);
		}
	}
	protected void actionPerformedTglbtn(ActionEvent e) {
		if (tglbtn.isSelected()) {
			tglbtn.setText("눌렀네");
		} else {
			tglbtn.setText("눌러봐");
		}
	}
}
