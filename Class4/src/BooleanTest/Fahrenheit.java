//���α׷���: ���� #5: ȭ�� �µ� -> ���� �µ� ����
//�ۼ���: ������
//�й�: 2020111597

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner f = new Scanner(System.in);
		double fahrenheit, celsius;
		System.out.print("ȭ���µ�: ");
		fahrenheit = f.nextDouble();
		
		celsius = (5.0/9.0) * (fahrenheit-32.0);
		System.out.println("�����µ�: " + celsius);
	}

}
