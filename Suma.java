public class Suma{
    public static void main(String[] args) {
        int a=2, b=3, k=4;
        double a1=2.10, b1=4.20, k1=5.30;
        System.out.println("���� ����� ����� ����� �������: "+sum(a, b, k));
        System.out.println("���� ����� �������� ����� �������: "+sum(a1, b1, k1));
        System.out.println("���� ������ ������ ����� �� ������ ��������� �������: "+sum(a, k1));
    }
    public static int sum (int a, int b, int c){
        System.out.print("1-� �����.");
        return a+b+c;
    }
    public static double sum (double a, double b, double c){
        System.out.print("2-� �����.");
        return a+b+c;
    }
    public static double sum (int a, double b){
        System.out.print("3-� �����.");
        return a+b;
    }
}/*
class Suma {
public static void main(String[] args){
int as[] ={0,0,0};
int mas1[]={10,5,7};
int mas2[]={10,5,7};
for (int i=0; i<2; i++){
as[i] = mas1[i]+mas2[i]; 

}

System.out.println(as[0]);
}
}
*/