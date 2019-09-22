import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Paint extends JFrame implements ActionListener, MouseMotionListener {
	Container c;
	JButton b1;
	Color col;

	Paint() {
		c = this.getContentPane();

		// Setting FlowLayout center
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		c.setLayout(fl);

		// Creating Button
		b1 = new JButton("Choose color");
		b1.setBounds(250, 0, 200, 30);

		// To set Cursor
		Cursor crs = new Cursor(Cursor.HAND_CURSOR);
		b1.setCursor(crs);

		// For font size of button
		Font f = new Font("Arial", Font.BOLD, 20);
		b1.setFont(f);
		b1.addActionListener(this);
		addMouseMotionListener(this);

		c.add(b1);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		col = JColorChooser.showDialog(this, "Select Color", Color.blue);
		b1.setForeground(col);

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(col);
		g.fillOval(arg0.getX(), arg0.getY(), 20, 20);

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}

public class MyColorChooser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paint frame = new Paint();
		frame.setTitle("Paint Application");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500, 250, 700, 700);

	}

}
