//���α׷���: ���� #6: �ΰ��� �� �ܵ� ���ϱ�
//�ۼ���: ������
//�й�: 2020111597

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		int receive, total, surtax, change;
		System.out.print("������: ");
		receive = m.nextInt();
		System.out.print("��ǰ�� �Ѿ�: ");
		total = m.nextInt();
		System.out.println("************************");
		
		surtax = total * 10 / 100;
		change = receive - total;
		
		System.out.println("�ΰ���: " + surtax);
		System.out.println("�ܵ�: " + change);
		
	}

}
