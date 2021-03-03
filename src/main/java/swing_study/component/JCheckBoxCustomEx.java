package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JCheckBoxCustomEx extends JFrame implements ItemListener{

	private JPanel contentPane;
	private ArrayList<Fruit> list;
	private int sum;
	private JLabel lblRes;
	private JPanel pNorth;
	private JLabel lblTitle;
	private JPanel pCenter;
	private JPanel pSouth;
	private String resStr = "현재 0원입니다.";
	

	/**
	 * Create the frame.
	 */
	public JCheckBoxCustomEx(ArrayList<Fruit> list) {
		setTitle("실전 체크박스");
		this.list = list;
		initialize();
		list.forEach(s->System.out.println(s));
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		
		lblTitle = new JLabel("New label");
		pNorth.add(lblTitle);
		
		pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		
		pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		lblRes = new JLabel(resStr);
		pSouth.add(lblRes);
		
		for(Fruit f : list) {
			JCheckBox ck = new JCheckBox(f.getName());
			pCenter.add(ck);
			ck.addItemListener(this);
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox cb = (JCheckBox) e.getSource();
		Fruit selectFruit = list.get(list.indexOf(new Fruit(cb.getText())));
		
		
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += selectFruit.getPrice();
		}else {
			sum -= selectFruit.getPrice();
		}
		resStr = String.format("현재 %d 원입니다.", sum);
		lblRes.setText(resStr);
	}

}
