import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Bounce extends Applet
{	
	boolean flag = true;
	int x1,y1,x2,y2;
	double r1,t1;
	int x,y,posx,posy;
	int x4,y4;
	Color c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
	public void init()
	{
		x4=y4=x2=y2=0;
		r1=50;
		t1=(Math.PI/4);
		x1=x=(int)(r1*Math.cos(t1));
		y1=y=(int)(r1*Math.sin(t1));
		
	}
	public void start()
	{
		
	}
	public void paint(Graphics g)
	{	
		while(x1<=500&x1>=0&y1<=300&y1>=0)
		{	
			r1+=5;
			x1=(int)(r1*Math.cos(t1));
			y1=(int)(r1*Math.sin(t1));

		    g.setColor( Color.white );
		    g.fillRect( 0, 0, 553, 354 );
			g.setColor(Color.white);
			g.fillOval(x2,y2,50,50);
			g.setColor(c);
			g.fillOval(x1,y1,50,50);
			try
			{
				Thread.sleep(50);
			}
			catch(Exception e)
			{
			}
			//System.out.println(x1+" "+y1);
			if(x1>500|x1<0|y1>300|y1<0)
			{
			}
			else
			{				
				x2=x1;
				y2=y1;
			}
		}
		
		Color c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		x4=x2;
		y4=y2;
		posx=x1;
		posy=y1;
		r1=0;
		while(flag)
		{	
			System.out.println(flag);
			if(x1>500)
			{	
				while(x1>=0&y1<=300&y1>=0)
				{		
					x=(int)(r1*Math.cos(t1));
					y=(int)(r1*Math.sin(t1));	
					if(posy>y4)	
					{
						x2=x1;
						y2=y1;	
						x1=posx-x;
						y1=posy+y;
					}
					else
					{
						x2=x1;
						y2=y1;
						x1=posx-x;
						y1=posy-y;
					}
					if(x1<0)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
					else if(y1<0)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
					else if(y1>300)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break ;
					}


					r1+=5;
					g.setColor(Color.white);
					g.fillOval(x2,y2,50,50);
					g.setColor(c);
					g.fillOval(x1,y1,50,50);
					try
					{
						Thread.sleep(50);
					}
					catch(Exception e)
					{
					}
					//System.out.println(x1+" "+y1+" "+r1);
				}
			}		


			if(x1<0)
			{
				while(x1<=500&y1<=300&y1>=0)
				{	
					x=(int)(r1*Math.cos(t1));
					y=(int)(r1*Math.sin(t1));	
				
					if(posy>y4)	
					{
						x2=x1;
						y2=y1;
						x1=posx+x;
						y1=posy+y;
					}
					else
					{
						x2=x1;
						y2=y1;
						x1=posx+x;
						y1=posy-y;
						
					}
					
					if(x1>500)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break ;
					}
					else if(y1<0)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
					else if(y1>300)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
						
					r1+=5;
					g.setColor(Color.white);
					g.fillOval(x2,y2,50,50);
					g.setColor(c);
					g.fillOval(x1,y1,50,50);
					try{Thread.sleep(50);
					}
					catch(Exception e)
					{
					}
					//System.out.println(x1+" "+y1+" "+r1);
		
				}
			}		
	
			if(y1>300)
			{
				while(x1<=500&y1>=0&x1>=0)
				{		
					x=(int)(r1*Math.cos(t1));
					y=(int)(r1*Math.sin(t1));	
				
					if(posx>x4)	
					{
						x2=x1;
						y2=y1;
						x1=posx+x;
						y1=posy-y;
					}
					else
					{
						x2=x1;
						y2=y1;
						x1=posx-x;
						y1=posy-y;
					}
						
					if(x1>500)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
					else if(y1<0)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
					else if(x1<0)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
					r1+=5;
					g.setColor(Color.white);
					g.fillOval(x2,y2,50,50);
					g.setColor(c);
					g.fillOval(x1,y1,50,50);
					try{Thread.sleep(50);
					}
					catch(Exception e)
					{
					}
					//System.out.println(x1+" "+y1+" "+r1);
		
				}
			}		
		
			if(y1<0)
			{
				while(x1<=500&y1<=300&x1>=0)
				{	
				
					x=(int)(r1*Math.cos(t1));
					y=(int)(r1*Math.sin(t1));	
				
					if(posx>x4)	
					{
						x2=x1;
						y2=y1;
						x1=posx+x;
						y1=posy+y;
					}
					else
					{
						x2=x1;
						y2=y1;
						x1=posx-x;
						y1=posy+y;
					}	
						
					if(x1>500)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
					else if(x1<0)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
					else if(y1>300)
					{
						posx=x1;
						posy=y1;
						r1=0;
						x4=x2;
						y4=y2;
						g.setColor(Color.white);
						g.fillOval(x4,y4,50,50);
						c=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
						break;
					}
					r1+=5;
					g.setColor(Color.white);
					g.fillOval(x2,y2,50,50);
					g.setColor(c);
					g.fillOval(x1,y1,50,50);
					try{Thread.sleep(50);
					}
					catch(Exception e)
					{
					}
					//System.out.println(x1+" "+y1+" "+r1);
	
				}
			}		

		}
	}
	
}










