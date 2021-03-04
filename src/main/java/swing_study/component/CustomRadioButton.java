package swing_study.component;

import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CustomRadioButton extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnApple;
	private JRadioButton rdbtnPear;
	private JRadioButton rdbtnCherry;
	private ArrayList<JRadioButton> rdBtns;

	/**
	 * Create the panel.
	 */
	public CustomRadioButton() {
		rdBtns = new ArrayList<JRadioButton>();
		initialize();

		rdBtns.add(rdbtnApple);
		rdBtns.add(rdbtnPear);
		rdBtns.add(rdbtnCherry);
	}
	
	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	public ArrayList<JRadioButton> getRdBtns() {
		return rdBtns;
	}

	private void initialize() {
		
		rdbtnApple = new JRadioButton("사과");
		buttonGroup.add(rdbtnApple);
		add(rdbtnApple);
		
		rdbtnPear = new JRadioButton("배");
		buttonGroup.add(rdbtnPear);
		add(rdbtnPear);
		
		rdbtnCherry = new JRadioButton("체리");
		buttonGroup.add(rdbtnCherry);
		add(rdbtnCherry);
		
	}
	public JRadioButton getRdbtnApple() {
		return rdbtnApple;
	}
	public JRadioButton getRdbtnPear() {
		return rdbtnPear;
	}
	public JRadioButton getRdbtnCherry() {
		return rdbtnCherry;
	}

}
