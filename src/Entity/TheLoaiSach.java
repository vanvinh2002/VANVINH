
package Entity;

/**
 *
 * @author ADMIN
 */
public class TheLoaiSach {
    private  String MaTLS;
    private  String MaTL;
    private String MaSach;
    private String TenTL;
    private int TrangThai;

    public TheLoaiSach() {
    }

    public TheLoaiSach(String MaTLS, String MaTL, String MaSach, String TenTL, int TrangThai) {
        this.MaTLS = MaTLS;
        this.MaTL = MaTL;
        this.MaSach = MaSach;
        this.TenTL = TenTL;
        this.TrangThai = TrangThai;
    }

    public String getMaTLS() {
        return MaTLS;
    }

    public void setMaTLS(String MaTLS) {
        this.MaTLS = MaTLS;
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenTL() {
        return TenTL;
    }

    public void setTenTL(String TenTL) {
        this.TenTL = TenTL;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
}
