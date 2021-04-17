package com.example.vnews.modelJ;

public class Banner {
    public String ID;
    public String Title;
    public String NgayDang;
    public String Nguon;
    public String Img;

    public Banner(String ID, String title, String ngayDang, String nguon, String img) {
        this.ID = ID;
        Title = title;
        NgayDang = ngayDang;
        Nguon = nguon;
        Img = img;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getNgayDang() {
        return NgayDang;
    }

    public void setNgayDang(String ngayDang) {
        NgayDang = ngayDang;
    }

    public String getNguon() {
        return Nguon;
    }

    public void setNguon(String nguon) {
        Nguon = nguon;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }
}
