//���α׷���: ���� #3: ���� ��� ����
//�ۼ���: ������
//�й�: 2020111597

import java.util.Scanner;

public class AnnualIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary;
		int saving;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		salary = input.nextInt();
		
		saving = salary * 12 * 10;
		System.out.println("10�� ������ �����: "+saving);
	}

}
