package dflolp;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Game extends BasicGame
{
	private ImageHandler handler;
	public static String sep;
	public static Player player;
	public Game(String gamename)
	{
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException
	{
		sep = System.getProperty("file.separator");
		handler = new ImageHandler();
		handler.add("resources" + sep + "textures" + sep + "Geek.png");
		player = new Player();
		player.init(handler.get(0));
		//System.out.println(Common.q1 + Common.q2 + Common.q3);
		ScriptManager.callFromFile("resources/scripts/getstuff.py");
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException
	{
		if (gc.getInput().isKeyDown(Keyboard.KEY_ESCAPE))
		{
			gc.exit();
			System.exit(0);
		}
		if (gc.getInput().isKeyDown(Keyboard.KEY_W))
		{
			player.moveUp(0.25f);
		}
		if (gc.getInput().isKeyDown(Keyboard.KEY_S))
		{
			player.moveDown(0.25f);
		}
		if (gc.getInput().isKeyDown(Keyboard.KEY_A))
		{
			player.moveLeft(0.25f);
		}
		if (gc.getInput().isKeyDown(Keyboard.KEY_D))
		{
			player.moveRight(0.25f);
		}
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		g.clear();
		//g.drawString("Overkill X: " + (int)player.x + " Overkill Y: " + (int)player.y, 10, 20);
		player.draw(g);
	}
}