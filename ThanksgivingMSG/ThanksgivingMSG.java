import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class ThanksgivingMSG extends JPanel implements Runnable
{
	JFrame frame;
	boolean runLoop;
	Thread thread;
	int x;
	public ThanksgivingMSG()
	{
		x=20;
		runLoop=true;
		thread=new Thread(this);
		frame=new JFrame();
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,800);
		frame.setVisible(true);
		thread.start();
	}

	public void paintComponent(Graphics g)
	{
		// don't move this line. It must stay at the top of painComponent()
		super.paintComponent(g);

		// Implement code here. Use the variable "g" for your Graphics object for these methods.

		//background
		g.setColor(Color.black);
		g.fillRect(0,0,1000,800);

		int red=(int)(Math.random()*256);
		int green=(int)(Math.random()*256);
		int blue=(int)(Math.random()*256);

		//inner rectangle
		g.setColor(new Color(195, 88, 25));
		g.fillRoundRect(450,300,100,300,25,25);

		g.setColor(new Color(195, 88, 25));
		g.fillRoundRect(425,300,20,300,25,25);

		g.setColor(new Color(195, 88, 25));
		g.fillRoundRect(450,380,300, 20,25,25);


		//text
		g.setFont(new Font("Times New Roman",Font.BOLD,50));
		g.drawString("Happy Thanksgiving!",275,100);

		//ball
		g.setColor(new Color(195, 88, 25));
		// x allows us to move the ball as we move. refer to run()
		g.fillOval(400,200, 200, 200);

	}
	public void run()
	{
		while(runLoop)
		{
			// increases value as loop is true. This x is used to move the ball
			if(x<900)
				x+=10;
			repaint();
			try
			{
				// creates the delay. Adjust the length to change the speed of the animation
				thread.sleep(50);
			}catch(InterruptedException e)
			{
			}
		}
	}

	public static void main(String args[])
	{
		ThanksgivingMSG app = new ThanksgivingMSG();

	}

}