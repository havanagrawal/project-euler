import java.awt.*;
import java.applet.*;

/*
<applet code="Dragon" width=700 height=700>
</applet>
*/

//(1) - The y-axis is flipped in Java applets

public class Dragon extends Applet
{
	int width, height;
	int cx, cy;

	public void init()
	{
		height = getSize().height;
		width = getSize().width;
		cx=width/2;
		cy=height/2;
	}

	public void paint(Graphics g)
	{int k=3;
	
		int from_x=cx;
		int from_y=cy;
		int to_x=cx;
		int to_y=cy-k;
	
		char c;
		int dir=0;		//0 - North, 1 - East, 2 - South, 3 - West
		
		g.drawLine(cx, 0, cx, height);
		g.drawLine(0, cy, width, cy);
		g.setColor(Color.red);
		
		String s = "FaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRRLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRRLFaRbFRLLFaLbFRLLFaRbFRRLFaLbFRLLFaRbFRLLFaLbFR"; 
		
		for (int i=0; i<s.length(); i++)
		{
			c = s.charAt(i);
			
			switch (c)
			{
				case 'F': {
							switch (dir)
							{
								case 0:	to_x = from_x;
										to_y = from_y - k;		//(1)
										break;
								
								case 1: to_x = from_x + k;
										to_y = from_y;
										break;
										
								case 2:	to_x = from_x;
										to_y = from_y + k;		//(1)
										break;
										
								case 3: to_x = from_x - k;
										to_y = from_y;
										break;
							}
							
							g.drawLine(from_x, from_y, to_x, to_y);
							from_x = to_x;
							from_y = to_y;
							break;
						}
				case 'R': dir++;
						dir%=4;
						break;
						
				case 'L': if (dir==0)
							dir=3;
						else
							dir--;
						
						break;
				case 'a':
				case 'b':	break;
			}
		}
	}
}