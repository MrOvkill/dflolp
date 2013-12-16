package dflolp;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Player
{
	public float x, y;
	private Image texture;
	public String name;
	public Player()
	{
		x = 400;
		y = 300;
		name = "Overkill";
	}
	
	public void init(Image icon)
	{
		texture = icon;
	}
	public void moveLeft(float amt)
	{
		x -= amt;
	}
	public void moveRight(float amt)
	{
		x += amt;
	}
	public void moveUp(float amt)
	{
		y -= amt;
	}
	public void moveDown(float amt)
	{
		y += amt;
	}
	public void draw(Graphics g)
	{
		texture.draw(x, y);
	}
}
