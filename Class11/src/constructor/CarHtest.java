package constructor;

class CarH {
	private String color;
	private int speed;
	
	CarH() {}											// �Ķ���� ������ �ٸ� ������ �̸��� ������ (1).
	
	CarH(String color) {							// �Ķ���� ������ �ٸ� ������ �̸��� ������ (2).
		this.color = color;
	}
	
	CarH(String color, int speed) {		// �Ķ���� ������ �ٸ� ������ �̸��� ������ (3).
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
}

public class CarHtest {

	public static void main(String[] args) {
		CarH myCar1 = new CarH();					// ��ü�� ���� �� ���� �ٸ� �����ڸ� ȣ��.
		CarH myCar2 = new CarH("����");
		CarH myCar3 = new CarH("�Ķ�", 30);
		
		System.out.println("�ڵ��� 1�� ������ " + myCar1.getColor() + "�̸�, ����ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ��� 2�� ������ " + myCar2.getColor() + "�̸�, ����ӵ��� " + myCar2.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ��� 3�� ������ " + myCar3.getColor() + "�̸�, ����ӵ��� " + myCar3.getSpeed() + "km �Դϴ�.");
	}

}
