package T1904E.thongtinsinhvien;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class sinhVien {
    private String hoTen;
    private String tuoi;
    private String diaChi;
    private String namSinh;
    private String gioiTinh;
    private String sdt;
    private String link;

    private void timKiem(sinhVien[] arraySinhVien, String namSinh, int count) {
        boolean check = true;
        for (int i = 0; i < count; i++){
            sinhVien e = arraySinhVien[i];
            if (e.getNamSinh().equalsIgnoreCase(namSinh)){
                e.input();
                check = false;
            }
        }
        if(check){
            System.out.println("khong tim thay thong tin");
        }
    }

    private void timKiemNangCao(sinhVien[] arraySinhvien, String gioiTinh, String namSinh, int count){
        boolean check = true;
        for (int i = 0; i < count; i++){
            sinhVien e = arraySinhvien[i];
            if (e.getGioiTinh().equalsIgnoreCase(namSinh) && e.getNamSinh().equalsIgnoreCase(gioiTinh)){
                e.input();
                check = false;
            }
        }
        if (check){
            System.out.println("khong tim thay thong tin");
        }
    }

    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("nhap ten: ");
        hoTen = s.nextLine();

        System.out.println("nhap tuoi: ");
        tuoi = s.nextLine();

        System.out.println("nhap dia chi: ");
        diaChi = s.nextLine();

        System.out.println("nhap nam sinh: ");
        namSinh = s.nextLine();

        System.out.println("nhap gioi tinh: ");
        gioiTinh = s.nextLine();

        System.out.println("nhap so dien thoai: ");
        sdt = s.nextLine();

        System.out.println("nhap link facebook: ");
        link = s.nextLine();
    }

    public void showInfo(){
        System.out.println("------- show -------");
        System.out.println("Ho va ten: "+hoTen);
        System.out.println("So dien thoai: "+hoTen);
        System.out.println("------- End -------");
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        sinhVien sv = new sinhVien();
        sinhVien[] arraySinhVien = new sinhVien[10];
        int choise;
        int count = 0;

        do {
            System.out.println("------ Welcome -----");
            System.out.println("1. nhap sinh vien moi");
            System.out.println("2. Thong tin sinh vien");
            System.out.println("3. tim kiem");
            System.out.println("4. Tim kiem nang cao");
            System.out.println("5. Thoat");

            System.out.println("nhap lua chon cua ban: ");
            choise = s.nextInt();
            switch (choise){
                case 1:
                    sv = new sinhVien();
                    sv.input();
                    break;
                case 2:
                    for (int i = 0; i < count; i++){
                        sv = arraySinhVien[i];
                        sv.showInfo();
                    }
                    break;
                case 3:
                    System.out.println("nhap nam sinh sinh vien can tim: ");
                    s.nextLine();
                    String namSinh = s.nextLine();
                    sinhVien t = new sinhVien();
                    t.timKiem(arraySinhVien,namSinh,count);
                    break;
                case 4:
                    System.out.println("nhap gioi tinh: ");
                    s.nextLine();
                    System.out.println("nhap nam sinh: ");
                    s.nextLine();
                    String gioiTinh = s.nextLine();
                    String namsinh = s.nextLine();
                    sinhVien y = new sinhVien();
                    y.timKiemNangCao(arraySinhVien,gioiTinh,namsinh,count);
                    break;
            }
        }while (choise !=5);
    }
}
