
import java.util.Calendar;
import java.util.Scanner;

public class BTT4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BAI 1: Nhap thong tin sach
        String maSach, tenSach, tacGia;
        int namXuatBan, soLuong;
        double donGia;

        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        // Kiem tra nam xuat ban
        int namHienTai = Calendar.getInstance().get(Calendar.YEAR);

        do {
            System.out.print("Nhap nam xuat ban: ");
            namXuatBan = sc.nextInt();

            if (namXuatBan <= 0 || namXuatBan > namHienTai) {
                System.out.println("Nam xuat ban khong hop le!");
            }
        } while (namXuatBan <= 0 || namXuatBan > namHienTai);

        // Kiem tra don gia
        do {
            System.out.print("Nhap don gia: ");
            donGia = sc.nextDouble();

            if (donGia <= 0) {
                System.out.println("Don gia phai lon hon 0!");
            }
        } while (donGia <= 0);

        // Kiem tra so luong
        do {
            System.out.print("Nhap so luong: ");
            soLuong = sc.nextInt();

            if (soLuong < 0) {
                System.out.println("So luong phai >= 0!");
            }
        } while (soLuong < 0);

        // Hien thi thong tin sach
        System.out.println("\nTHONG TIN SACH");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        // BAI 2: Tinh thanh tien
        double thanhTien = donGia * soLuong;
        System.out.println("\nThanh tien: " + thanhTien);

        // BAI 3: Tinh phi van chuyen
        double phiVanChuyen = thanhTien * 0.05;
        System.out.println("Phi van chuyen (5%): " + phiVanChuyen);

        // BAI 4: Tinh tong tien nhap
        double tongTienNhap = thanhTien + phiVanChuyen;
        System.out.println("Tong tien nhap: " + tongTienNhap);

        // BAI 5: Phan loai gia sach
        System.out.println("\nPHAN LOAI GIA");

        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia < 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }

        // BAI 6: Phan loai ton kho
        System.out.println("\n===== PHAN LOAI TON KHO =====");

        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong <= 5) {
            System.out.println("Sap het");
        } else if (soLuong <= 20) {
            System.out.println("Con it");
        } else {
            System.out.println("Con nhieu");
        }

        // BAI 7: Su dung switch chon loai sach
        System.out.println("\nCHON LOAI SACH");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");

        System.out.print("Nhap lua chon: ");
        int loaiSach = sc.nextInt();

        switch (loaiSach) {
            case 1:
                System.out.println("Loai sach: Sach giao khoa");
                break;
            case 2:
                System.out.println("Loai sach: Sach tham khao");
                break;
            case 3:
                System.out.println("Loai sach: Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Loai sach: Sach khac");
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
    }
}
