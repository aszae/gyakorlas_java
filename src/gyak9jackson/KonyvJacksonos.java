package gyak9jackson;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class KonyvJacksonos {
    private String cim;
    private String szerzo;
    @JsonFormat(pattern = "yyyy.MM.dd")
    private LocalDate kiadasDatuma;
    private int oldalszam;
    private String kiado;
    @JsonProperty
    private String ISBN;
    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public LocalDate getKiadasDatuma() {
        return kiadasDatuma;
    }

    public void setKiadasDatuma(LocalDate kiadasDatuma) {
        this.kiadasDatuma = kiadasDatuma;
    }

    public int getOldalszam() {
        return oldalszam;
    }

    public void setOldalszam(int oldalszam) {
        this.oldalszam = oldalszam;
    }

    public String getKiado() {
        return kiado;
    }

    public void setKiado(String kiado) {
        this.kiado = kiado;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("KonyvJacksonos{");
        sb.append("cim='").append(cim).append('\'');
        sb.append(", szerzo='").append(szerzo).append('\'');
        sb.append(", kiadasDatuma=").append(kiadasDatuma);
        sb.append(", oldalszam=").append(oldalszam);
        sb.append(", kiado='").append(kiado).append('\'');
        sb.append(", ISBN='").append(ISBN).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
