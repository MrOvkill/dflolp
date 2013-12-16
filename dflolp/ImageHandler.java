package dflolp;

import java.util.ArrayList;

import org.newdawn.slick.Image;

public class ImageHandler
{
	private ArrayList<Image> images;
	public ImageHandler()
	{
		images = new ArrayList<Image>();
	}
	public Image get(int index)
	{
		return images.get(index);
	}
	public void add(String location)
	{
		try
		{
			images.add(new Image(location));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public Image[] getImages()
	{
		Image[] ar = new Image[images.size()];
		return images.toArray(ar);
	}
	public int getSize()
	{
		return images.size();
	}
}
