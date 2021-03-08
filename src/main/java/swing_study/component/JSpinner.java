package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class JSpinner extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public JSpinner() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));

		JPanel pSpinner1 = new JPanel();
		contentPane.add(pSpinner1);

		javax.swing.JSpinner spinner1 = new javax.swing.JSpinner();
		spinner1.setModel(new SpinnerListModel(new String[] { "소설", "잡지", "전공서적", "취미" }));
		pSpinner1.add(spinner1);

		JPanel pSpinner2 = new JPanel();
		contentPane.add(pSpinner2);

		javax.swing.JSpinner spinner2 = new javax.swing.JSpinner();
		spinner2.setModel(new SpinnerNumberModel(1500000, 0, 4000000, 100));
		pSpinner2.add(spinner2);

		JPanel pSpinner3 = new JPanel();
		contentPane.add(pSpinner3);

		javax.swing.JSpinner spinner3 = new javax.swing.JSpinner();
		Calendar cal = Calendar.getInstance();
		Date value = cal.getTime();
		cal.add(Calendar.YEAR, -50);
		Date start = cal.getTime();
		cal.add(Calendar.YEAR, 100);
		Date end = cal.getTime();
		spinner3.setModel(new SpinnerDateModel(value, start, end, Calendar.YEAR));
		spinner3.setEditor(new javax.swing.JSpinner.DateEditor(spinner3,"yyyy/MM/dd"));
		pSpinner3.add(spinner3);
	}

}
