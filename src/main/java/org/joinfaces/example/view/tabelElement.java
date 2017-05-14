/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester;

/**
 *
 * @author Acer
 */

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@SessionScoped
@ManagedBean

public class tabelElement {
  
    private String selectedname,id,location,fileName,Author,size,semester;
    
    
    public List<String> getAllsemester(){
    
    List<String> list=new ArrayList<String>();
    
    list.add("1st semester");
    list.add("2nd semester");
    list.add("3rd semester");
    list.add("4th semester");
    list.add("5th semester");
    list.add("6th semester");
    list.add("7th semester");
    list.add("8th semester");
    
    return list;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSelectedname() {
        return selectedname;
    }

    public void setSelectedname(String selectedname) {
        this.selectedname = selectedname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

public String page(){

if(semester.toLowerCase().equals("1st semester")){

    return "1S.xhtml";
}else if(semester.toLowerCase().equals("2nd semester")){
    return "2S.xhtml";
}else if(semester.toLowerCase().equals("3rd semester")){
    return "3S.xhtml";
}else if(semester.toLowerCase().equals("4th semester")){
    return "4S.xhtml";
}else if(semester.toLowerCase().equals("5th semester")){
    return "5S.xhtml";
}else if(semester.toLowerCase().equals("6th semester")){
    return "6S.xhtml";
}else if(semester.toLowerCase().equals("7th semester")){
    return "7S.xhtml";
}else if(semester.toLowerCase().equals("8th semester")){
    return "8S.xhtml";
}
return null;
}
    
}
