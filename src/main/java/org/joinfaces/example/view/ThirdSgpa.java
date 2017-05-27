
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */

@ManagedBean
@SessionScoped
public class ThirdSgpa {
    
    
     private String scplus,scplusprac,sos,sdld,sdldprac,smath,sedc,sedcprac,sacc;
     private ArrayList<String> list = new ArrayList<String>();
     float[] credit = {3.0f,1.5f,3.0f,3.0f,1.5f,3.0f,3.0f,1.5f,3.0f};
     private float total;
     float sum=0.0f;
     public List<String> getAllgrade(){
    
    List<String> list=new ArrayList<String>();
    
    list.add("A+");
    list.add("A");
    list.add("A-");
    list.add("B+");
    list.add("B");
    list.add("B-");
    list.add("C+");
    list.add("C");
    list.add("D");
    list.add("F");
    
    return list;
    }

    public String getScplus() {
        return scplus;
    }

    public void setScplus(String scplus) {
        this.scplus = scplus;
    }

    public String getScplusprac() {
        return scplusprac;
    }

    public void setScplusprac(String scplusprac) {
        this.scplusprac = scplusprac;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public String getSdld() {
        return sdld;
    }

    public void setSdld(String sdld) {
        this.sdld = sdld;
    }

    public String getSdldprac() {
        return sdldprac;
    }

    public void setSdldprac(String sdldprac) {
        this.sdldprac = sdldprac;
    }

    public String getSmath() {
        return smath;
    }

    public void setSmath(String smath) {
        this.smath = smath;
    }

    public String getSedc() {
        return sedc;
    }

    public void setSedc(String sedc) {
        this.sedc = sedc;
    }

    public String getSedcprac() {
        return sedcprac;
    }

    public void setSedcprac(String sedcprac) {
        this.sedcprac = sedcprac;
    }

    public String getSacc() {
        return sacc;
    }

    public void setSacc(String sacc) {
        this.sacc = sacc;
    }

   
 

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
     public void page(String cp,String cpp,String os,String dld,String dldp,String math,String edc,String edcp,String ac){
    
    list.add(cp);
    list.add(cpp);
    list.add(os);
    list.add(dld);
    list.add(dldp);
    list.add(math);
    list.add(edc);
    list.add(edcp);
    list.add(ac);
    
    for(int i=0;i<9;i++){
 
        if(list.get(i).toLowerCase().equals("a+")){
        
            sum=sum+(4.00f*credit[i]);
        }else if(list.get(i).toLowerCase().equals("a")){
            sum=sum+(3.75f*credit[i]);
        }else if(list.get(i).toLowerCase().equals("a-")){
            sum=sum+(3.50f*credit[i]);
        }else if(list.get(i).toLowerCase().equals("b+")){
            sum=sum+(3.25f*credit[i]);
        }else if(list.get(i).toLowerCase().equals("b")){
            sum=sum+(3.00f*credit[i]);
        }else if(list.get(i).toLowerCase().equals("b-")){
            sum=sum+(2.75f*credit[i]);
        }else if(list.get(i).toLowerCase().equals("c+")){
            sum=sum+(2.50f*credit[i]);
        }else if(list.get(i).toLowerCase().equals("c")){
            sum=sum+(2.25f*credit[i]);
        }else if(list.get(i).toLowerCase().equals("d")){
            sum=sum+(2.00f*credit[i]);
        }else if(list.get(i).toLowerCase().equals("f")){
            sum=sum+(0.00f*credit[i]);
        }
        
        
       
     }
      
     total=sum/22.5f;
     list.clear();
     sum=0.0f;
     //return "show.xhtml";
    }
}
