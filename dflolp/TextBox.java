package dflolp;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class TextBox
{
	private Image icon;
	public float x, y;
	public String contents;
	public TextBox(Image texture)
	{
		icon = texture;
		x = 10;
		y = 400;
		contents = "Cheese";
	}
	public void draw(Graphics g)
	{
		icon.draw(x, y);
		g.drawString(contents, x+22.5f, y+22.5f);
	}
}
