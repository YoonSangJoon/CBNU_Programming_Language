// HW #3 : �⵵�� �Է��ϰ� �������� �ƴ����� Ȯ���ϴ� ���α׷�
// �濵�����а�
// 2016024017
// ������

import java.util.*;

public class LeapYearHW {

	public static void main(String[] args) {
		
		int year;
		String leap;
		
		System.out.println("===== ���� ���� =====");
		System.out.println("\n");

		Scanner input = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		year = input.nextInt();
		
		System.out.println("\n");
		
		if ((year % 4 == 0) && (year % 100 != 0)) {
			leap = "����";
			
		} else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
			leap = "����";
			
		} else {
			leap = "���";
		}
		
		System.out.println("�Է��� " + year + "���� " + leap + "�Դϴ�.");
		
		System.out.println("\n");
		System.out.println("===== ���α׷� ���� =====");

	}

}
