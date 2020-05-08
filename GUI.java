package record_tool;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class GUI  implements ActionListener 
{
	JFrame f = new JFrame("选项");
	JLabel label = new JLabel("请选择对应操作：");
	JRadioButton jr1 = new JRadioButton("回放");
	JRadioButton jr2 = new JRadioButton("使用");
	JRadioButton jr3 = new JRadioButton("关闭");
	ButtonGroup group = new ButtonGroup();
	JButton b1 = new JButton("确定");
	JButton b2 = new JButton("取消");
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	int number=2; 

	public GUI() {
		group.add(jr1);
		group.add(jr2);
		group.add(jr3);
		jr1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	number=2;
                            }
        });
		jr2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	number=1;
                            }
        });
		jr3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	number=3;
                            }
        });
		

		b1.addActionListener(this);
		b2.addActionListener(this);
		p1.add(label);
		p3.add(b1);
		p3.add(b2);
		p2.add(jr1);p2.add(jr2);p2.add(jr3);
		f.add(p1, BorderLayout.NORTH);
		f.add(p2, BorderLayout.CENTER);
		f.add(p3, BorderLayout.SOUTH);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosiing(WindowEvent ew) {
				System.exit(0);
			}
		});
		f.setLocation(900,400);
		f.pack();
		f.setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("确定"))
	    {
			if(number==1) {
				 Thread t1=new Thread(new Runnable() {
					public void run() {
						use.code_testfun();
					}
				});
				 t1.start();
			}
			else if(number==2) {
				Thread t2=new Thread(new Runnable() {
					public void run() {
						try {
							test.test_record();
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				});
				t2.start();
			}
			else
				System.exit(0);
	    }
		if(e.getActionCommand().equals("取消")) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
	    GUI gui=new GUI();
	}
	
}
