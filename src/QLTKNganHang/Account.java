package QLTKNganHang;

import java.util.Scanner;

public class Account {
    private int soTK;
    private String tenTK;
    private double soTienTrongTK;

    public Account(int soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }

    public Account() {
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int i) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTienTrongTK() {
        return soTienTrongTK;
    }

    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }

    @Override
    public String toString() {
        return "Account{" +
                "soTK=" + soTK +
                ", tenTK=" + tenTK +
                ", soTienTrongTK=" + soTienTrongTK +
                '}';
    }

    Scanner sc = new Scanner(System.in);

    public double NapTien() {
        double nap;
        System.out.println("Nhap  so tien bn muon nap");
        nap = sc.nextDouble();
        soTienTrongTK = nap + soTienTrongTK;
        if (nap >= 0) {
            System.out.println("Ban vua nhap " + nap + " tien vao tai khoan ");
        } else {
            System.out.println("So tien nhap khong hop le");
        }
        return soTienTrongTK;
    }

    public double RutTien1() {
        double rut;
        System.out.println("Nhap so tien ban muon rut");
        rut = sc.nextDouble();
        double phi = 5;
        soTienTrongTK = soTienTrongTK - (rut + phi);
        if (rut <= (soTienTrongTK - phi)) {
            soTienTrongTK = soTienTrongTK - (rut + phi);
            System.out.println("So tien ban rut la" + rut );
        }else{
            System.out.println("So tien ban rut khong hop le");
        }
        return soTienTrongTK;

    }
}
