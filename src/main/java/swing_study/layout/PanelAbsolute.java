package swing_study.layout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelAbsolute extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(43, 231, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(166, 139, 97, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(272, 47, 109, 21);
		add(lblNewLabel);
	}
}
