package First;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class plus extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6882245348462911236L;
	Graphics g;
	//主方法入口
	int width = 400;
	int height = 500;
//	String [] ButtonName = new String [] {"0","1","2","3","4","5","6","7","8","9"};
	//定义按钮数组
	int JButtonsize = 9;
	JButton [] jb = new JButton[JButtonsize];
	
	public static void main (String [] args) {
		plus p = new plus();
		p.UI();
//		System.out.println("I'm here; and I am running !!!");
	}
	public void UI() {
		
		this.setTitle("Calculater");
		this.setSize(500,500);
		this.setLocation(200,200);
		this.setVisible(true);
		
		 Container contentPane = this.getContentPane();
		//create a pane to hold the numeric buttons
//		this.setLayout(new );
		JPanel jp = new JPanel();
		jp.setSize(300,300);
		jp.setBackground(Color.black);
		contentPane.add(jp,BorderLayout.CENTER);
		
		//create components
		for(int i = 0;i<JButtonsize;i++) {
			jb[i] = new JButton(String.valueOf(i+1));
		}
		
		//add components
		for(int i = 0;i<JButtonsize;i++) {
			jp.add(jb[i]);
		}
		
		//set up the grid layout
		jp.setLayout(new GridLayout(4,4,10,10));		 
		
		//set the pane properties
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setResizable(false);
		
	}
}

