package hw4;

public class GetOff {

	public static String GetOff(int trans) {
		
		String out = "ž����";

		switch (trans) {
		
		case 1:
			out = "# 5. �������� �����Ѵ�.\n";
			break;
		case 2:
			out = "# 5. ����ö���� �����Ѵ�.\n";
			break;
		case 3:
			out = "# 5. �ýÿ��� �����Ѵ�.\n";
			break;
				}
		return out;
	}

}
