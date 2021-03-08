package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameComponentEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn2;
	private JButton btn3;
	private JButton btn1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public FrameComponentEx() {
		initialize();
	}

	private void initialize() {
		setTitle("공통 속성");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		btn1 = createButton();
		contentPane.add(btn1);

		btn2 = new JButton("Disabled Button");
		btn2.addActionListener(this);
		btn2.setEnabled(false);
		contentPane.add(btn2);

		btn3 = new JButton("getX(),getY() button");
		btn3.addActionListener(this);
		contentPane.add(btn3);
	}

	public JButton createButton() {
		JButton btn;
		btn = new JButton("MagentaYellow Button");
		btn.addActionListener(this);
		btn.setBackground(new Color(255, 255, 0));
		btn.setFont(new Font("Arial", Font.ITALIC, 20));
		btn.setForeground(Color.MAGENTA);
		return btn;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			actionPerformedBtn(e);
		}
		if (e.getSource() == btn2) {
			actionPerformedBtn2(e);
		}
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}
	}

	protected void actionPerformedBtn3(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		FrameComponentEx parent = (FrameComponentEx) btn.getTopLevelAncestor();
		parent.setTitle(btn.getX() + ", " + btn.getY());

		if (btn2.isEnabled()) {
			btn2.setEnabled(false);
		} else {
			btn2.setEnabled(true);
		}
	}

	protected void actionPerformedBtn2(ActionEvent e) {
		if (btn1 != null) {

			contentPane.remove(btn1);
			btn1 = null;
			revalidate();
		} else {

			btn1 = createButton();
			contentPane.add(btn1, 0);
			revalidate();

//			if (btn1.isVisible()) {
//				btn1.setVisible(false);
//			} else {
//				btn1.setVisible(true);
//			}
		}
	}

	protected void actionPerformedBtn(ActionEvent e) {
		if (btn1.isVisible()) {
			btn1.setVisible(false);
		} else {
			btn1.setVisible(true);
		}
	}

}
