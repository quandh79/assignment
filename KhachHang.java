package assignment;

public class KhachHang {
        public int maKH;
        public String hoTen;
        public String ngayRHD;
        public int soLuong;
        public double donGia;

        public KhachHang() {
        }

        public KhachHang(int maKH, String hoTen, String ngayRHD, int soLuong, double donGia) {
                this.maKH = maKH;
                this.hoTen = hoTen;
                this.ngayRHD = ngayRHD;
                this.soLuong = soLuong;
                this.donGia = donGia;
        }
        // geter va seter

        public int getMaKH() {
                return maKH;
        }

        public void setMaKH(int maKH) {
                this.maKH = maKH;
        }

        public String getHoTen() {
                return hoTen;
        }

        public void setHoTen(String hoTen) {
                this.hoTen = hoTen;
        }

        public String getNgayRHD() {
                return ngayRHD;
        }

        public void setNgayRHD(String ngayRHD) {
                this.ngayRHD = ngayRHD;
        }

        public int getSoLuong() {
                return soLuong;
        }

        public void setSoLuong(int soLuong) {
                this.soLuong = soLuong;
        }

        public double getDonGia() {
                return donGia;
        }

        public void setDonGia(double donGia) {
                this.donGia = donGia;
        }



}
