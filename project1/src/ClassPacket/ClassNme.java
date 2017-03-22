package ClassPacket;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClassNme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JFrame frame = new JFrame(); 
       frame.setTitle("Þablon Uygulamasý ");
       frame.setSize(500,250); 
       frame.setLocation(50, 150);
       frame.setLayout(new FlowLayout());
       
       JLabel label1 = new JLabel("label eklentisi");
       label1.setText("label uygulamasý");
       
       frame.add(label1);
       frame.setVisible(true);
	
	}

}
