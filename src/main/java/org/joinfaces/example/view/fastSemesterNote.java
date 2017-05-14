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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@SessionScoped
@ManagedBean

public class fastSemesterNote {

    private String selectedname;
private Scanner x;

String line;
    public String getSelectedname() {
        return selectedname;
    }

    public void setSelectedname(String selectedname) {
        this.selectedname = selectedname;
    }

    public ArrayList<String> getTabelElement() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("book");
        list.add("note");
        return list;
    }

    public List<tabelElement> getLocation() throws  FileNotFoundException, IOException {

        List<tabelElement> list = new ArrayList<tabelElement>();
       //  BufferedReader br=null;

      //  br=new BufferedReader(new FileReader("C:\\Users\\Acer\\Documents\\NetBeansProjects\\NuCseHome\\text"));
      
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fast", "root", "");
//
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("select id,location,fileName,Author,size from " + selectedname + "");
 URL oracle = new URL("http://shawonislam.com/rajib/fast.txt");
    BufferedReader in = new BufferedReader(
    new InputStreamReader(oracle.openStream()));

    String inputLine;
        while((inputLine = in.readLine()) != null) {
            tabelElement element = new tabelElement();
              
           // element.setId(rs.getString("id"));
            element.setLocation(inputLine);
//            element.setLocation(rs.getString("location"));
//            element.setAuthor(rs.getString("Author"));
//            element.setSize(rs.getString("size"));

            list.add(element);
        }

        return list;
    }

    public void download( String lo) {

        String l = lo;
      //  String n = name;
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            ExternalContext externalContext = context.getExternalContext();

            externalContext.responseReset();
            externalContext.setResponseContentType("application/pdf");
            externalContext.setResponseHeader("Content-Disposition", "attachment;filename=\"" + l + "\"");

            InputStream inputStream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/images/" + l + "");
            OutputStream outputStream = externalContext.getResponseOutputStream();

            byte[] buffer = new byte[2048];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();
            context.responseComplete();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

//    public String page(String tab) throws ClassNotFoundException, SQLException {
//
//        setSelectedname(tab);
//        return "1SS.xhtml";
//    }
}
