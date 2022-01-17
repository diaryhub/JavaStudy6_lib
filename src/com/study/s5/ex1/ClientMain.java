package com.study.s5.ex1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("client");
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.219.100", 8282);
			System.out.println("서버 접속 성공");
			System.out.println("서버로 보낼 메시지 입력");
			String msg = sc.nextLine();
			System.out.println(msg);
			
			//1.output stream을 구해오기
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);//char(문자 처리)
			BufferedWriter bw = new BufferedWriter(ow);	
			//전송 준비 끝
			
			//전송
			bw.write(msg+"\r\n");
			//강제로 버퍼 비우기
			bw.flush();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("server:"+br.readLine());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
