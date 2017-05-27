
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
public class EightSgpa {
        
     private String swe,swep,scms,ses,sp;
     private ArrayList<String> list = new ArrayList<String>();
     float[] credit = {3.0f,1.5f,3.0f,3.0f,6.0f};
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

    public String getSwe() {
        return swe;
    }

    public void setSwe(String swe) {
        this.swe = swe;
    }

    public String getSwep() {
        return swep;
    }

    public void setSwep(String swep) {
        this.swep = swep;
    }

    public String getScms() {
        return scms;
    }

    public void setScms(String scms) {
        this.scms = scms;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

 
 

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
     public void page(String we,String wep,String cns,String es,String pro){
    
    list.add(we);
    list.add(wep);
    list.add(cns);
    list.add(es);
    list.add(pro);
 
    
    for(int i=0;i<5;i++){
 
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
      
     total=sum/16.5f;
     list.clear();
     sum=0.0f;
     //return "show.xhtml";
    }
}
