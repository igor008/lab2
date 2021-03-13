package com.company;

import java.io.PrintStream;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d () {
        //Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0, 0);
    }

    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }

    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
    public void setZ ( double val) {
        zCoord = val;
    }
    public boolean srav(Point3d diff){
        if (this.xCoord == diff.xCoord && this.yCoord == diff.yCoord && this.zCoord == diff.zCoord) return true;
        else return false;
    }

    public double distanceTo(Point3d diff){
        double distance;
        distance = Math.sqrt(Math.pow(diff.xCoord - this.xCoord, 2) + Math.pow(diff.yCoord - this.yCoord, 2) + Math.pow(diff.zCoord - this.zCoord, 2));
        return distance;
    }
    public static void main(String[] args) {
        Point3d gg = new Point3d(2, 4, 3);
        Point3d rr = new Point3d(5, 1, 3);
        double dis = gg.distanceTo(rr);
        System.out.printf("%.2f",dis);
    }
}

