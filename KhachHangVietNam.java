package assignment;

public class KhachHangVietNam extends KhachHang {
    public int doiTuong;
    public  int dinhMuc;
    private double donGiaMoi;

    public KhachHangVietNam(int doiTuong, int dinhMuc) {
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public KhachHangVietNam(int maKH, String hoTen, String ngayRHD, int soLuong, double donGia, int doiTuong, int dinhMuc) {
        super(maKH, hoTen, ngayRHD, soLuong, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }


    public int getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(int doiTuong) {
        this.doiTuong = doiTuong;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }


    public double TTien(){
        if(soLuong <= dinhMuc){
            return this.donGia * this.soLuong;
        }else{
            return this.donGia*this.dinhMuc+(this.soLuong-this.dinhMuc)*this.donGiaMoi;
        }
    }
}
