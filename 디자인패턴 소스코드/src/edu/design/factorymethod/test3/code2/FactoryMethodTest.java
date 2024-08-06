package edu.design.factorymethod.test3.code2;

abstract class Connection {
	protected String url;

	Connection(String url) {
		this.url = url;
	}

	abstract public void connect();
}

class TCPConnection extends Connection {

	TCPConnection(String url) {
		super(url);
	}

	public void connect() {
		System.out.println(url + " 로 TCP 연결을 시도합니다.");
	}
}

class UDPConnection extends Connection {

	UDPConnection(String url) {
		super(url);
	}

	public void connect() {
		System.out.println(url + " UDP 연결을 시도합니다.");
	}
}

class HTTPConnection extends Connection {

	HTTPConnection(String url) {
		super(url);
	}

	public void connect() {
		System.out.println(url + " HTTP 연결을 시도합니다.");
	}
}

class ConnectionFactory {
	public Connection getConnection(String str) {
		String url = str.toLowerCase();
		if (url.indexOf("socket") >= 0) {
			return new TCPConnection(url);
		} else if (url.indexOf("datagram") >= 0) {
			return new UDPConnection(url);
		} else if (url.indexOf("http") >= 0) {
			return new HTTPConnection(url);
		} else {
			return null;
		}
	}
}

public class FactoryMethodTest {
	public static void main(String[] args) {
		ConnectionFactory factory = new ConnectionFactory();
		Connection conn = factory.getConnection("SOCKET://70.12.113.168:5555");
		conn.connect();

		conn = factory.getConnection("DATAGRAM://70.12.113.168:5555");
		conn.connect();

		conn = factory.getConnection("HTTP://70.12.113.168/index.jsp");
		conn.connect();

	}
}