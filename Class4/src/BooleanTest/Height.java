//���α׷���: ���� #2: Scanner�� �̿��� Ű �Է� ����
//�ۼ���: ������
//�й�: 2020111597

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���");
		int age;
		double weight, tall;
		age = data.nextInt();
		weight = data.nextDouble();
		tall = data.nextDouble();
		
		System.out.println("����� ���̴� " + age + "���Դϴ�.");
		System.out.println("����� ü���� " + weight + "kg�Դϴ�.");
		System.out.println("����� ������ " + tall + "cm�Դϴ�.");
		
	}
}
