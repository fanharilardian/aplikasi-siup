package id.go.kemendag.siup.aplikasisiup.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "kode",
    "nama",
    "kodepos"
})
@XmlRootElement(name = "kelurahan")
public class Kelurahan {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String kode;
    @XmlElement(required = true)
    protected String nama;
    @XmlElement(required = true)
    protected BigInteger kodepos;

   
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger value) {
        this.id = value;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String value) {
        this.kode = value;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String value) {
        this.nama = value;
    }

    public BigInteger getKodepos() {
        return kodepos;
    }

    public void setKodepos(BigInteger value) {
        this.kodepos = value;
    }

}
