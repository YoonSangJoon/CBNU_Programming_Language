package hw4;

public class Transport {
		

	public static String Transport(int trans) {
		
		String getIn = "ž����";
		
		switch (trans) {
		case 1:
			getIn = "# 2. ������ ž���Ѵ�.\n";
			break;
		case 2:
			getIn = "# 2. ����ö�� ž���Ѵ�.\n";
			break;
		case 3:
			getIn = "# 2. �ýÿ� ž���Ѵ�.\n";
			break;
		default:
			getIn = "# 2. ���� ����� ���� �ִ� ��������� ����Ѵ�.\n";
			break;
		}
		return getIn;
	}
}

