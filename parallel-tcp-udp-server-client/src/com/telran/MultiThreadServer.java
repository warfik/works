package com.telran;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author mercenery
 *
 */
public class MultiThreadServer {

	static ExecutorService executeIt = Executors.newFixedThreadPool(2);

	public static void main(String[] args) {
		
		try (ServerSocket server = new ServerSocket(3345)) {
			System.out.println("Server socket created, command console reader for listen to server commands");

			// �������� ���� ��� ������� ��� ��������� ����� �� ������
			while (!server.isClosed()) {			

				// ���������� � ��������
				// ����������� � ������ ������� ��� ������ - "clientDialog" ��
				// ��������� �������
				Socket client = server.accept();

				// ����� ��������� ������� �� ����������� ������ ������ �����
				// ��� ������� � �������� � ���������� ��� � ��������� ����
				// � Runnable(��� ������������� ����� ������� Callable)
				// ������������ ���� = ������ - MonoThreadClientHandler � ���
				// ���������� ������� �� ���� �������
				executeIt.execute(new MonoThreadClientHandler(client));
				System.out.print("Connection accepted.");
			}

			// �������� ���� ����� ����� ���������� ������ ���� �����
			executeIt.shutdown();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}