// * * * * * * * * * * * * * * * * * \\
// Author: Overkill                  \\
// * * * * * * * * * * * * * * * * * \\

package dflolp;

import java.net.*;

public class UDPSocket
{
	DatagramSocket sock;
	byte[] b;
	DatagramPacket packet;
	
	public UDPSocket()
	{
		b = new byte[32768];
	}
	public void sendTo(String address, String port, String message) throws Exception
	{
		sock = new DatagramSocket();
		b = message.getBytes();
		packet = new DatagramPacket(b , b.length , InetAddress.getByName(address) , Integer.parseInt(port));
		sock.send(packet);
		packet = null;
		sock.close();
	}
	public String[] recvFrom(String port) throws Exception
	{
		sock = new DatagramSocket(Integer.parseInt(port));
		packet = new DatagramPacket(b , b.length);
		sock.receive(packet);
		sock.close();
		return new String[] {packet.getAddress().toString().replace("/", ""), new String(packet.getData(), 0, packet.getLength()), ("" + packet.getPort())};
	}
}
