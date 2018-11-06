package id.go.kemendag.siup.aplikasisiup.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kelurahan"
})
@XmlRootElement(name = "daftarKelurahan")
public class DaftarKelurahan {

    protected List<Kelurahan> kelurahan;

    public List<Kelurahan> getKelurahan() {
        if (kelurahan == null) {
            kelurahan = new ArrayList<Kelurahan>();
        }
        return this.kelurahan;
    }
    
    public void setKelurahan(List<Kelurahan> data) {
        this.kelurahan = data;
    }

}
