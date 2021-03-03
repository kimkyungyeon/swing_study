package swing_study.component;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton {
	private String imgPath = System.getProperty("user.dir") + File.separator + "Image"+ File.separator;

	public MyButton() {
		setIcon(new ImageIcon(imgPath + "tel1.gif"));
		setRolloverIcon(new ImageIcon(imgPath + "tel2.gif"));
		setPressedIcon(new ImageIcon(imgPath + "tel3.gif"));
	}
	
	
}
