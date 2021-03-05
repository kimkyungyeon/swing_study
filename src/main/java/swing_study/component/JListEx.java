package swing_study.component;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ListSelectionModel;

public class JListEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "Image" + File.separator;
	private ImageIcon[] icons = { new ImageIcon(imgPath + "home.png"),
			new ImageIcon(imgPath + "wifi.png"),
			new ImageIcon(imgPath + "glass.png"),
			new ImageIcon(imgPath + "key.png") };
	
	private String[] fruits = new String[] {"apple", "banana", "kiwi", "mango", "pear", "peach", "strawberry", "blackberry"};
	private JButton btn01;
	private JList<String> strList;
	/**
	 * Create the frame.
	 */
	public JListEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));
		
//		JList strList = new JList(fruits); 
		
		strList = new JList<>();
		strList.setListData(fruits);
		
//		JList<String> strList = newJList<>(fruits); 생성자 바로넣으면 윈도우빌더 사용 x
		
		
//		strList.setModel(new AbstractListModel() {
//			String[] values = new String[] {"apple", "banana", "kiwi", "mango", "pear", "peach", "strawberry", "blackberry"};
//			public int getSize() {
//				return values.length;
//			}
//			public Object getElementAt(int index) {
//				return values[index];
//			}
//		});
		contentPane.add(strList);
		
		JList<ImageIcon> list = new JList<>();
		list.setListData(icons);
		contentPane.add(list);
		
		JPanel pBtns = new JPanel();
		contentPane.add(pBtns);
		
		btn01 = new JButton("첫리스트선택확인");
		btn01.addActionListener(this);
		pBtns.add(btn01);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
		int idx = strList.getSelectedIndex();
		String selStr = strList.getSelectedValue();
		List<String> selectedList = strList.getSelectedValuesList();
		String message = String.format("idx : %d %n selectedValue : %s%n selectedList : %s", idx, selStr, selectedList);
		
		JOptionPane.showMessageDialog(null, message);
		
	}
}
