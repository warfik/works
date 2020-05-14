package com.telran;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TestRunnableClientTester implements Runnable {

	static Socket socket;

	public TestRunnableClientTester() {
		try {

			// ������ ����� ������� �� ������� ������� � ������������ �������
			socket = new Socket("localhost", 3345);
			System.out.println("Client connected to socket");
			Thread.sleep(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		try (

				// ������ ������ ��� ������ ����� � ��������� ������, ���
				// ������ ����� �� ������
				// � try-with-resources �����
				DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
				DataInputStream ois = new DataInputStream(socket.getInputStream())) {
			System.out.println("Client oos & ois initialized");

			int i = 0;
			// ������ ������� ����
			while (i < 5) {

				// ����� ��������� ���������������� ������ ������� � �����
				// ������ ��� �������
				oos.writeUTF("clientCommand " + i);

				// ������������ ��������� �� ������ ������� ��������� � �����
				oos.flush();

				// ��� ����� ������ ����� �������� ��������� �� ������ �
				// ��������
				Thread.sleep(10);
				System.out.println("Client wrote & start waiting for data from server...");

				// �������� ����� �� ������ ������� � ������
				// ������� � ���������� � ois ����������, �������� ��
				// �������
				System.out.println("reading...");
				String in = ois.readUTF();
				System.out.println(in);
				i++;
				Thread.sleep(5000);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
