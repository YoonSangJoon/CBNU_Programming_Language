//���α׷���: ���� #7: �ʴ��� �Է� -> �ð� �� �� ����
//�ۼ���: ������
//�й�: 2020111597

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.print("�ʸ� �Է��Ͻÿ�: ");
		int total = t.nextInt();
		
		System.out.println("**********************");
		
		int hour = total / 3600;
		int minute = total % 3600 / 60;
		int second = total % 3600 % 60;
		
		System.out.println(total + "�ʴ�" + hour + "�ð�" + minute + "��" + second + "�� �Դϴ�.");
	}

}
