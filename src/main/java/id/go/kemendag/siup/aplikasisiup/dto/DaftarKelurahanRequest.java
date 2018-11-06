package id.go.kemendag.siup.aplikasisiup.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pencarian"
})
@XmlRootElement(name = "daftarKelurahanRequest")
public class DaftarKelurahanRequest {

    @XmlElement(required = true)
    protected Pencarian pencarian;
    
    public Pencarian getPencarian() {
        return pencarian;
    }

    public void setPencarian(Pencarian value) {
        this.pencarian = value;
    }

}
