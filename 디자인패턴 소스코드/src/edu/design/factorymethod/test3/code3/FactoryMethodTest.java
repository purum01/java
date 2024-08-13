package edu.design.factorymethod.test3.code3;

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

abstract class ConnectionFactory {
	public boolean isConnectable() {
		return true;
	}

	abstract public Connection getConnection(String str);
}

class TCPConnectionFactory extends ConnectionFactory {
	public Connection getConnection(String url) {
		if (isConnectable()) {
			return new TCPConnection(url);
		} else {
			System.out.println("지금은 네트웍 연결을 할수 없습니다.");
			return null;
		}
	}
}

class UDPConnectionFactory extends ConnectionFactory {
	public Connection getConnection(String url) {
		if (isConnectable()) {
			return new UDPConnection(url);
		} else {
			System.out.println("지금은 네트웍 연결을 할수 없습니다.");
			return null;
		}
	}
}

class HTTPConnectionFactory extends ConnectionFactory {
	public Connection getConnection(String url) {
		if (isConnectable()) {
			return new HTTPConnection(url);
		} else {
			System.out.println("지금은 네트웍 연결을 할수 없습니다.");
			return null;
		}
	}
}

public class FactoryMethodTest {
	public static void main(String[] args) {
		ConnectionFactory factory = new TCPConnectionFactory();
		Connection socket = factory.getConnection("SOCKET://70.12.113.168:5555");
		socket.connect();

		ConnectionFactory factory1 = new UDPConnectionFactory();
		Connection datagram = factory1.getConnection("DATAGRAM://70.12.113.168:5555");
		datagram.connect();

		ConnectionFactory factory2 = new HTTPConnectionFactory();
		Connection http = factory2.getConnection("HTTP://70.12.113.168/index.jsp");
		http.connect();
	}
}