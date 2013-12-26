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
		try {
			sock = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b = new byte[32768];
	}
	
	public UDPSocket(int port)
	{
		try {
			sock = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b = new byte[32768];
	}
	
	public void sendTo(String address, String port, String message) throws Exception
	{
		b = message.getBytes();
		packet = new DatagramPacket(b , b.length , InetAddress.getByName(address) , Integer.parseInt(port));
		sock.send(packet);
		packet = null;
	}
	public String[] recvFrom(String port) throws Exception
	{
		packet = new DatagramPacket(b , b.length);
		sock.receive(packet);
		return new String[] {packet.getAddress().toString().replace("/", ""), new String(packet.getData(), 0, packet.getLength()), ("" + packet.getPort())};
	}
}
