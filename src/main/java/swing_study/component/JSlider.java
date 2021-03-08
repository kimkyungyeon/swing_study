package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;

public class JSlider extends JFrame implements ChangeListener {

	private JPanel contentPane;
	private javax.swing.JSlider sliderRed;
	private javax.swing.JSlider sliderGreen;
	private javax.swing.JSlider sliderBlue;
	private JLabel lblColor;

	/**
	 * Create the frame.
	 */
	public JSlider() {
		initialize();
		
		sliderGreen.addChangeListener(this);
		sliderRed.addChangeListener(this);
		sliderBlue.addChangeListener(this);
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pCenter = new JPanel();
		pCenter.setBorder(new EmptyBorder(0, 10, 0, 10));
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 1, 0, 0));

		sliderRed = new javax.swing.JSlider();
		
		sliderRed.setForeground(Color.RED);
		sliderRed.setPaintTicks(true);
		sliderRed.setMaximum(255);
		sliderRed.setMajorTickSpacing(50);
		sliderRed.setMinorTickSpacing(10);
		sliderRed.setPaintLabels(true);
		sliderRed.setValue(128);
		pCenter.add(sliderRed);

		sliderGreen = new javax.swing.JSlider();
		
		sliderGreen.setPaintTicks(true);
		sliderGreen.setPaintLabels(true);
		sliderGreen.setMinorTickSpacing(10);
		sliderGreen.setMaximum(255);
		sliderGreen.setMajorTickSpacing(50);
		sliderGreen.setForeground(Color.GREEN);
		sliderGreen.setValue(128);
		pCenter.add(sliderGreen);

		sliderBlue = new javax.swing.JSlider();
		
		sliderBlue.setPaintTicks(true);
		sliderBlue.setPaintLabels(true);
		sliderBlue.setMinorTickSpacing(10);
		sliderBlue.setMaximum(255);
		sliderBlue.setMajorTickSpacing(50);
		sliderBlue.setForeground(Color.BLUE);
		sliderBlue.setValue(128);
		pCenter.add(sliderBlue);

		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);

		lblColor = new JLabel("New label");
		lblColor.setFont(new Font("굴림", Font.PLAIN, 23));
		lblColor.setOpaque(true);
		lblColor.setForeground(Color.YELLOW);
		pSouth.add(lblColor);
	}

	public void stateChanged(ChangeEvent e) {
		int red = 0;
		int green = 0;
		int blue = 0;
			blue = sliderBlue.getValue();
			green = sliderGreen.getValue();
			red = sliderRed.getValue();
		
		
		String message = String.format("Red(%d), Green(%d), Blue(%d)", red, green, blue);
		lblColor.setText(message);
		lblColor.setBackground(new Color(red, green, blue));
	}

}
