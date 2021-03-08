package swing_study.component;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import swing_study.panel.Title;
import swing_study.panel.TitlePanel;
import swing_study.panel.EmpPanel;

public class JTabbedPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnConfirm;
	private JTabbedPane tabbedPane;

	/**
	 * Create the frame.
	 */
	public JTabbedPaneEx() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		DeptPanel pDept = new DeptPanel();
		tabbedPane.addTab("부서", null, pDept, "부서관리");

		TitlePanel pTitle = new TitlePanel();
		tabbedPane.addTab("직책", null, pTitle, "직책관리");

		EmpPanel pEmp = new EmpPanel();
		tabbedPane.addTab("사원", null, pEmp, "사원관리");

		JPanel pBtn = new JPanel();
		contentPane.add(pBtn, BorderLayout.SOUTH);

		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		pBtn.add(btnConfirm);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
	}

	protected void actionPerformedBtnConfirm(ActionEvent e) {
		//선택된 탭가져와서 
		Component comp = tabbedPane.getSelectedComponent();
		int tabNo = tabbedPane.getSelectedIndex();
		
		if (tabNo == 0) {
		//getXXX() 호출
		DeptPanel deptPanel = (DeptPanel) comp;
		Department department = deptPanel.getDepartment();
		JOptionPane.showMessageDialog(null, department);
		} else if(tabNo == 1) {
		TitlePanel titlePanel = (TitlePanel) comp;
		Title title = titlePanel.getTitle();
		JOptionPane.showMessageDialog(null, title);
		}
	}
}
