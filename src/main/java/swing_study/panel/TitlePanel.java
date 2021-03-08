package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TitlePanel extends JPanel {
	private JTextField tfTno;
	private JTextField tfTname;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {
		
		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblTno = new JLabel("직책번호");
		lblTno.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblTno);
		
		tfTno = new JTextField();
		add(tfTno);
		tfTno.setColumns(10);
		
		JLabel lblTname = new JLabel("직책명");
		lblTname.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblTname);
		
		tfTname = new JTextField();
		tfTname.setColumns(10);
		add(tfTname);
	}

	public void setTitle(Title title) {
		tfTno.setText(String.valueOf(title.gettNo()));
		tfTname.setText(title.gettName());
	}
	public Title getTitle() {
		int tNo = Integer.parseInt(tfTno.getText().trim());
		String tName = tfTname.getText();
		return new Title(tNo, tName);
	}
	
	public void clearTf() {
		
	}
}
