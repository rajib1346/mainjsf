
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class FifthSgpa {
    
     private String selectauto,selectmircro,selectmicroprac,selectengmath,selectsociology,selecttechnical;
     private ArrayList<String> list = new ArrayList<String>();
     float[] credit = {3.0f,3.0f,1.5f,3.0f,3.0f,3.0f};
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

    public String getSelectauto() {
        return selectauto;
    }

    public void setSelectauto(String selectauto) {
        this.selectauto = selectauto;
    }

    public String getSelectmircro() {
        return selectmircro;
    }

    public void setSelectmircro(String selectmircro) {
        this.selectmircro = selectmircro;
    }

    public String getSelectmicroprac() {
        return selectmicroprac;
    }

    public void setSelectmicroprac(String selectmicroprac) {
        this.selectmicroprac = selectmicroprac;
    }

    public String getSelectengmath() {
        return selectengmath;
    }

    public void setSelectengmath(String selectengmath) {
        this.selectengmath = selectengmath;
    }

    public String getSelectsociology() {
        return selectsociology;
    }

    public void setSelectsociology(String selectsociology) {
        this.selectsociology = selectsociology;
    }

    public String getSelecttechnical() {
        return selecttechnical;
    }

    public void setSelecttechnical(String selecttechnical) {
        this.selecttechnical = selecttechnical;
    }

 

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
     public void page(String auto,String micro,String microprac,String engmath,String socio,String technical){
    
    list.add(auto);
    list.add(micro);
    list.add(microprac);
    list.add(engmath);
    list.add(socio);
    list.add(technical);
    
    for(int i=0;i<6;i++){
 
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
