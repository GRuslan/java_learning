
class ManyVariables {
	static int x = 9, �; // �������� ����� � ���� �����
	// ���� ����� � ��� ������� � ������ �����
	// ����� � ������ �������� 0
	static{ // ���� ������������ ��������� ������
	// ���������� ���� ��� ��� ������ ������������ ����� ����
	// ������������ � ����������� ������
	x = 99; // �������� ���������� ����� ������� ������!
	}
	int � = 1, �; // ���������� ����� � ���� ����������
	// ³��� � ��� ������� � ������ �����, � ������ ����
	//�� �������� ������� ������� � ��� �� ������
	// ����� � ������ �������� 0
	{ // ���� ������������ ����������
	// ���������� ��� ��������� ������� ���������� ����
	// ������������ ��� ����������� ������
	� = 999; // �������� ���������� ����� ������� ������!
	}
	static void f(int b){ // �������� ������ b � ��������
	// �����, ����� ����� ��������� ������
	
	int a = 2; // �� ����� ����� � ��� �� ������ "�"
	// ���� ����� ����� ����� ������ f() �
	// ��� �������� ����� "�"
	int �; // �������� �����, ����� ����� � ����� f()
	//�� ������ ������� ����������� ��������
	//� ������� ���� ��������� ����� �������������
	{ int c = 555; // �������! ������ ���������� ����������
	int � = 333; // �������� �����, ����� ����� � ����� �����
	}
	// ��� ����� � ��� �������
	for (int d = 0; d < 10; d++){
	// ����� ����� d ����� ���� � ����
	int � = 4; // �������!
	int e = 5; // �������� �����, ����� ����� � ���� for
	e++; // ������������� ��� ������� ��������� �����
	System.out.println("e = " + e) ; // ���������� ������ "� = 6"
	}
	// �� ����� d � � ������
	}
	public static void main(String[] args){
	int a = 9999; // �������� �����, ����� ����� ��������� ������ main()
	f (a);
	}
	}