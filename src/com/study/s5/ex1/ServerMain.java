package com.study.s5.ex1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("server");
		ServerSocket serverSocket=null;
		Socket socket = null;
		
		try {
			System.out.println("클라이언트의 접속 대기중");
			
			serverSocket = new ServerSocket(8282);	//접속준비
			socket = serverSocket.accept();
			System.out.println("접속한 클라이언트와 1:1 연결 완료");
			
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			String msg = br.readLine();
			
			System.out.println("client:"+msg);
			System.out.println("client에게 보낼 메시지 입력");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String msg2 = sc.nextLine();
			
			bw.write(msg2+"\r\n");
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
