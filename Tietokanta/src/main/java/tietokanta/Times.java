package tietokanta;

import javax.persistence.*;

@Entity
public class Times {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String Auto;
private String Rata;
private String Aika;
private String pvm;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAuto() {
	return Auto;
}
public void setAuto(String auto) {
	this.Auto = auto;
}
public String getRata() {
	return Rata;
}
public void setRata(String rata) {
	this.Rata = rata;
}
public String getAika() {
	return Aika;
}
public void setAika(String aika) {
	this.Aika = aika;
}
public String getPvm() {
	return pvm;
}
public void setPvm(String pvm) {
	this.pvm = pvm;
}


}
