package com.elraiz.memyselfandi;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF5

//15 Mei 2020 pembuatan class app untuk menampung format daily list pada acitivity daily

public class App2 {
    String aktivitas;
    String jam;

    public App2(String aktivitas, String jam) {
        this.aktivitas = aktivitas;
        this.jam = jam;
    }

    public String getAktivitas() {
        return aktivitas;
    }

    public void setAktivitas(String aktivitas) {
        this.aktivitas = aktivitas;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
