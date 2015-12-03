import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class MyCanvas extends Canvas{

	int xthis = 0;
	int ythis = 0;
	int rthis = 0;
	int gthis = 0;
	int bthis = 0;
	public int getR(){
		return rthis;
	}
	public int getG(){
		return gthis;
	}
	public int getB(){
		return bthis;
	}
	public void rep(int r, int g, int b){
		rthis = r;
		gthis = g;
		bthis = b;
		this.repaint();
	}

	public MyCanvas(int x, int y, int r, int g, int b){
		rthis = r;
		gthis = g;
		bthis = b;
		
		this.setSize(new Dimension(x,y));
		this.repaint();
		}
		
	public void paint(Graphics g){
		Color c = new Color(getR(),getG(),getB());
		g.setColor(c);
		g.fillRect(0, 0, 99, 99);
		g.setColor(Color.black);
		g.drawRect(0,0,99,99);
		
	}

}
