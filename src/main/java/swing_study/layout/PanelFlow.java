package swing_study.layout;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class PanelFlow extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelFlow() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel p1 = new JPanel();
		FlowLayout fl_p1 = (FlowLayout) p1.getLayout();
		fl_p1.setAlignment(FlowLayout.LEADING);
		p1.setBorder(new TitledBorder(null, "align(leading)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(p1);
		
		JButton btnNewButton = new JButton("1");
		p1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		p1.add(btnNewButton_1);
		
		JPanel p2 = new JPanel();
		p2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "align(Center)", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		add(p2);
		
		JButton btnNewButton_3 = new JButton("1");
		p2.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("2");
		p2.add(btnNewButton_2);
		
		JPanel p3 = new JPanel();
		FlowLayout fl_p3 = (FlowLayout) p3.getLayout();
		fl_p3.setAlignment(FlowLayout.TRAILING);
		p3.setBorder(new TitledBorder(null, "align(trailing)", TitledBorder.TRAILING, TitledBorder.TOP, null, null));
		add(p3);
		
		JButton btnNewButton_4 = new JButton("1");
		p3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		p3.add(btnNewButton_5);
	}

}
