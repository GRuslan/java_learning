class Complex {
private static final double EPS = 1e-12; // Точність обчислень
private double re, im; // Дійсна і уявна частини
// Чотири конструктори
Complex(double re, double im) { //Constructor 1
this.re = re; this.im = im;
}
/* після виконання цього методу створиться обєкт, який по формі нагадує масив або
двовимірний вектор, координати якого будуть введені нами параметри re і im. Самі ж
змінні класу re і im для нас недоступні – вони захищені директивою private.
Схожість же вказаного обєкта з масивом або вектором є тільки зовнішня, крім
координат обєкт має ще і методи, скриті в конструкції класу*/
Complex(double re){this(re, 0.0); } //Constructor 2
Complex(){this(0.0, 0.0); } //Constructor 3
Complex(Complex z){this(z.re, z.im) ; } //Constructor 4
// Методи доступу
public double getRe(){return re;}
public double getIm(){return im;}
public Complex getZ(){return new Complex(re, im);}
public void setRe(double re){this.re = re;}
public void setIm(double im){this.im = im;}
public void setZ(Complex z){re = z.re; im = z.im;}
// Модуль і аргумент комплексного числа
public double mod(){return Math.sqrt(re * re + im * im);}
public double arg(){return Math.atan2(re, im);}
// Перевірка: дійсне число?
public boolean isReal(){return Math.abs(im) < EPS;}
public void pr(){ // Виведення на екран
System.out.println(re + (im < 0.0 ? "" : "+") + im + "i");
}
// Перевизначення методів класа Object
public boolean equals(Complex z){
return Math.abs(re - z.re) < EPS &&
Math.abs(im - z.im) < EPS;
}
public String toString(){
return "Complex: " + re + " " + im;
}
// Методи, що реалізують операції +=, -=, *=, /=
public void add(Complex z){re += z.re; im += z.im;}
public void sub(Complex z){re -= z.re; im -= z.im;}
public void mul(Complex z){
double t = re * z.re - im * z.im;
im = re * z.im + im * z.re;
re = t;
}
public void div(Complex z){
double m = z.mod();
double t = re * z.re - im * z.im;
im = (im * z.re - re * z.im) / m;
re = t / m;
}
// Методи, що реалізують операції +, -, *, /
public Complex plus(Complex z){
return new Complex(re + z.re, im + z.im);
}
public Complex minus(Complex z){
return new Complex(re - z.re, im - z.im);
}
public Complex asterisk(Complex z){
return new Complex(
re * z.re - im * z.im, re * z.im + im * z.re);
}
public Complex slash(Complex z){
double m = z.mod();
return new Complex(
(re * z.re - im * z.im) / m, (im * z.re - re * z.im) / m);
}
}
