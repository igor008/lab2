package com.company;

public class Lab1 {
    public static void main(String[] args) {
        Point3d one = new Point3d(2,4,3);
        Point3d two = new Point3d(1,2,6);
        Point3d three = new Point3d(4,3,1);
        if(!one.srav(two) && !one.srav(three) && !two.srav(three)){
    System.out.println("Площадь равна: " + computeArea(one,two,three));
        } else {
    System.out.println("Некоторые точки совпадают");
        }

    }
    public static double computeArea(Point3d A, Point3d B, Point3d C){
        double sch;
        //Считаем вектора
        double x = B.getX() - A.getX();
        double y = B.getY() - A.getY();
        double z = B.getZ() - A.getZ();

        double x1 = C.getX() - A.getX();
        double y1 = C.getY() - A.getY();
        double z1 = C.getZ() - A.getZ();
        Point3d v1 = new Point3d(x,y,z);
        Point3d v2 = new Point3d(x1,y1,z1);
        //Считаем векторное произведение
        double x2 = (y * z1) - (z * y1);
        double y2 = (x * z1) - (z * x1);
        double z2 = (x * y1) - (y * x1);
        Point3d vecP = new Point3d(x2,y2,z2);
        //Найдем модуль вектора
        double vecMod = Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2) + Math.pow(z2,2));
sch = 0.5 * vecMod;
        return sch;
    }
}
