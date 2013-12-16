package dflolp;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Doctor
{
	private Image icon = null;
	public float x, y;
	private Vector2f target;
	public Doctor()
	{
		try {
			icon = new Image("resources" + Game.sep + "textures" + Game.sep + "Geek.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		x = 0;
		y = 0;
		target = new Vector2f(400, 300);
	}
	public void update()
	{
		target = new Vector2f(Game.player.x, Game.player.y);
		if(target.x < x)
		{
			x -= 0.05;
		}
		if(target.x > x)
		{
			x += 0.05;
		}
		if(target.y < y)
		{
			y -= 0.05;
		}
		if(target.y > y)
		{
			y += 0.05;
		}
	}
	public void draw()
	{
		icon.draw(x, y);
	}
}
