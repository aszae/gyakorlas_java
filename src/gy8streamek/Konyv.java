package gy8streamek;

import java.time.LocalDate;

public class Konyv {
    private int azon;
    private String cim;
    private String isbn;
    private String kiado;
    private LocalDate kiadasDatuma;
    private Integer ar;
    private String mufaj;
    private Integer oldalhossz;

    public Konyv(int azon, String cim, String isbn, String kiado, LocalDate kiadasDatuma, Integer ar, String mufaj, Integer oldalhossz) {
        this.azon = azon;
        this.cim = cim;
        this.isbn = isbn;
        this.kiado = kiado;
        this.kiadasDatuma = kiadasDatuma;
        this.ar = ar;
        this.mufaj = mufaj;
        this.oldalhossz = oldalhossz;
    }

    public int getAzon() {
        return azon;
    }

    public String getCim() {
        return cim;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getKiado() {
        return kiado;
    }

    public LocalDate getKiadasDatuma() {
        return kiadasDatuma;
    }

    public Integer getAr() {
        return ar;
    }

    public String getMufaj() {
        return mufaj;
    }

    public Integer getOldalhossz() {
        return oldalhossz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Konyv{");
        sb.append("azon=").append(azon);
        sb.append(", cim='").append(cim).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", kiado='").append(kiado).append('\'');
        sb.append(", kiadasDatuma=").append(kiadasDatuma);
        sb.append(", ar=").append(ar);
        sb.append(", mufaj='").append(mufaj).append('\'');
        sb.append(", oldalhossz=").append(oldalhossz);
        sb.append('}');
        return sb.toString();
    }
}
