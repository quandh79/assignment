package assignment;

public class KhachHangNuocNgoai extends KhachHang {
    public String quocTich;


    public KhachHangNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai(int maKH, String hoTen, String ngayRHD, int soLuong, double donGia, String quocTich) {
        super(maKH, hoTen, ngayRHD, soLuong, donGia);
        this.quocTich = quocTich;
    }
    // tinh tien

    public double TTien(){
        return this.soLuong*this.donGia;
    }
}
