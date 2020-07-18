package J29_3;

public class Uczestnik extends ImieNazwisko{
    public String telefon;
    public String email;

    public Uczestnik(){
    }
    public Uczestnik(String imie,String nazwisko,String telefon,String email){
        super(imie,nazwisko);
        this.telefon=telefon;
        this.email=email;
    }
    public String getTelefon(){
        return telefon;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void getUczestnik(){
        System.out.print(imie+" "+nazwisko+", tel:"+telefon+" ,@:"+email+", ");
    }
}
