//���α׷���: ���� #4: ���� ���� ���ϱ�
//�ۼ���: ������
//�й�: 2020111597

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, area;
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		radius = input.nextInt();
		
		area = radius * radius * PI;
		System.out.println(area);
	}

}
