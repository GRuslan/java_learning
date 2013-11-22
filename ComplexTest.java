// ��������� ������ ����� Complex
public class ComplexTest {
public static void main(String[] args){
Complex z1 = new Complex(), //Constructor 3, z1 = 0
z2 = new Complex(1.5), //Constructor 2, z2 = 1.5 � real number
z3 = new Complex(3.6, -2.2), //Constructor 1, z3 = 3.6 � 2.2i
z4 = new Complex(z3); //Constructor 4, z4 = z3
System.out.println(); // �������� ������ �����
System.out.print("z1 = "); z1.pr(); //z1 = 0.0 + 0.0i
System.out.print("z2 = "); z2.pr(); //z2 = 1.5 + 0.0i
System.out.print("z3 = "); z3.pr(); //z3 = 3.6 � 2.2i
System.out.print ("z4 = "); z4.pr(); //z4 = 3.6 � 2.2i
System.out.println(z4); // ������ ����� toString() Complex: 3.6 -2.2
z2.add(z3); // z2 = z2 + z3
System.out.print("z2 + z3 = "); z2.pr(); //z2 + z3 = 5.1 � 2.2i
z2.div(z3); //z2 = z2/z3
System.out.print("z2 / z3 = "); z2.pr(); //z2/z3 = 1.303370787 + 0.185393258i
z2 = z2.plus(z2);
System.out.print("z2 + z2 = "); z2.pr(); // z2 + z2 = 2.606741574 + 0.370786516i
z3 = z2.slash(z1);
System.out.print("z2 / z1 = "); z3.pr(); /* �� ���� �� ����� �����. � ���� ���
����� ��� ������������� �� �������� � �� ���������� � ��������� ���� ��
�������� ������������. Java � �������� �� �������� 䳿, � ��� �� ��������� ��
������������ �������� NaN � not a number */
}
}