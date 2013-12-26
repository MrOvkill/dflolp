package dflolp;

import org.lwjgl.openal.AL;

import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.openal.AudioLoader;
//import org.newdawn.slick.openal.SoundStore;
import org.newdawn.slick.util.ResourceLoader;

public class Sound
{
	public static void playMusic(String name)
	{
		try
		{
			Audio song;
			song = AudioLoader.getAudio("WAV", ResourceLoader.getResourceAsStream("resources" + Common.sep + "music" + Common.sep + name + ".wav"));
			song.playAsMusic(1.0f, 1.0f, true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void kill()
	{
		AL.destroy();
	}
}
