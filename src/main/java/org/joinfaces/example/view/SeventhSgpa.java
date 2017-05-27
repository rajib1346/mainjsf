
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
public class SeventhSgpa {
      
     private String snet,snetp,sai,spdp,spi,spip,sdsp;
     private ArrayList<String> list = new ArrayList<String>();
     float[] credit = {3.0f,1.5f,3.0f,3.0f,3.0f,1.0f,3.0f};
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

    public String getSnet() {
        return snet;
    }

    public void setSnet(String snet) {
        this.snet = snet;
    }

    public String getSnetp() {
        return snetp;
    }

    public void setSnetp(String snetp) {
        this.snetp = snetp;
    }

    public String getSai() {
        return sai;
    }

    public void setSai(String sai) {
        this.sai = sai;
    }

    public String getSpdp() {
        return spdp;
    }

    public void setSpdp(String spdp) {
        this.spdp = spdp;
    }

    public String getSpi() {
        return spi;
    }

    public void setSpi(String spi) {
        this.spi = spi;
    }

    public String getSpip() {
        return spip;
    }

    public void setSpip(String spip) {
        this.spip = spip;
    }

    public String getSdsp() {
        return sdsp;
    }

    public void setSdsp(String sdsp) {
        this.sdsp = sdsp;
    }

   
 

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
     public void page(String net,String netp,String ai,String pd,String pi,String pip,String dsp){
    
    list.add(net);
    list.add(netp);
    list.add(ai);
    list.add(pd);
    list.add(pi);
    list.add(pip);
    list.add(dsp);
   
    
    for(int i=0;i<7;i++){
 
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
      
     total=sum/17.5f;
     list.clear();
     sum=0.0f;
     //return "show.xhtml";
    }
}
