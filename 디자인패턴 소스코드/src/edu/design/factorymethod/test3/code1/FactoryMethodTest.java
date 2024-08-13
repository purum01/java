package edu.design.factorymethod.test3.code1;

class TCPConnection {
	private String url;
	
	public TCPConnection(String url) {
		this.url = url;
	}

	public void connect() {
		System.out.println(url + " 로 TCP 연결을 시도합니다.");
	}
}

class UDPConnection {
	private String url;
	
	public UDPConnection(String url) {
		this.url = url;
	}

	public void connect() {
		System.out.println(url + " UDP 연결을 시도합니다.");
	}
}

class HTTPConnection {
	private String url;
	
	public HTTPConnection(String url) {
		this.url = url;
	}

	public void connect() {
		System.out.println(url + " HTTP 연결을 시도합니다.");
	}
}


public class FactoryMethodTest {
	public static void main(String[] args) {
		TCPConnection socket = new TCPConnection("SOCKET://70.12.113.168:5555");
		socket.connect();

		UDPConnection datagram = new UDPConnection("DATAGRAM://70.12.113.168:5555");
		datagram.connect();

		HTTPConnection http = new HTTPConnection("HTTP://70.12.113.168/index.jsp");
		http.connect();
	}
}