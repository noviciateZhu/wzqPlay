import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class test1 extends JFrame {
	public Graphics g;
	public static test1 wzq;

	/*
	 * ���ع��췽��
	 */
	public test1() {
		this.initUI();
	}

	/*
	 * ��ʼ������ķ���
	 */
	void initUI() {
		/*
		 * ������������
		 */
		this.setTitle("������С��Ϸ");
		this.setSize(new Dimension(650, 650));
		this.setResizable(false);
		this.setDefaultCloseOperation(3);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		/*
		 * ���һ������
		 */
		this.setLayout(null);
		JPanel jp = new JPanel() {
			/*
			 * (non-Javadoc)����һ�������ڲ�����дpaint����
			 * 
			 * @see javax.swing.JComponent#paint(java.awt.Graphics)
			 */
			public void paint(Graphics g) {
				g.setColor(Color.BLACK);
				super.paint(g);
				// ��15��
				for (int i = 0; i < 15; i++) {
					g.drawLine(20, 20 + i * tests.WZQ_JianJu, 20
							+ (tests.Column - 1) * tests.WZQ_JianJu,
							20 + i * tests.WZQ_JianJu);
				}
				// ��15��
				for (int i = 0; i < 15; i++) {
					g.drawLine(20 + i * tests.WZQ_JianJu, 20, 20 + i
							* tests.WZQ_JianJu, 20
							+ (tests.Column - 1) * tests.WZQ_JianJu);
				}
				g.setColor(Color.BLACK);
				g.fillOval(133, 133, 15, 15);
				g.fillOval(293, 133, 15, 15);
				g.fillOval(453, 133, 15, 15);
				g.fillOval(133, 293, 15, 15);
				g.fillOval(293, 293, 15, 15);
				g.fillOval(453, 293, 15, 15);
				g.fillOval(133, 453, 15, 15);
				g.fillOval(293, 453, 15, 15);
				g.fillOval(453, 453, 15, 15);

		
	}
		};
		
	}
}





