public class Sach {
    String ten_sach;
    String tac_gia;
    int nam_xuat_ban;

    public Sach(String ten_sach, String tac_gia, int nam_xuat_ban) {
        this.ten_sach = ten_sach;
        this.tac_gia = tac_gia;
        this.nam_xuat_ban = nam_xuat_ban;


        }
    public void hienthi(){
        System.out.println(ten_sach);
        System.out.println(tac_gia);
        System.out.println(nam_xuat_ban);
    }
}
