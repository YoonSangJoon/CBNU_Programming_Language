package hw4;

import java.util.*;

public class Passenger {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int trans;
		int pay;
		
		System.out.printf("� ��������� �̿��Ͻðڽ��ϱ�? (1: ����, 2: ����ö, 3: �ý�) : ");
		trans = s.nextInt();
		
		System.out.printf("\n# 1. ���������� �̵��Ѵ�.\n");
		
		System.out.println(Transport.Transport(trans));
		
		System.out.printf("� ���������� �̿��Ͻðڽ��ϱ�? (1: ī��, 2: ����, 3: �����) : ");
		pay = s.nextInt();
		
		System.out.println(Payment.Payment(pay));
		
		System.out.printf("# 4. ������ �Ϸ��Ѵ�.\n");
		
		System.out.println(GetOff.GetOff(trans));
		
		System.out.printf("�������� �����߽��ϴ�.\n");
	}
}
