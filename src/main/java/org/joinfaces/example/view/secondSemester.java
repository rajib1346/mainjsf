/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Acer
 */

@ManagedBean
@SessionScoped
public class secondSemester {
    
        private String selectedname;

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

    public List<tabelElement> getLocation() throws ClassNotFoundException, SQLException {

        List<tabelElement> list = new ArrayList<tabelElement>();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/second", "root", "");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select id,location,fileName,Author,size from " + selectedname + "");

        while (rs.next()) {
            tabelElement element = new tabelElement();

            element.setId(rs.getString("id"));
            element.setFileName(rs.getString("fileName"));
            element.setLocation(rs.getString("location"));
            element.setAuthor(rs.getString("Author"));
            element.setSize(rs.getString("size"));

            list.add(element);
        }

        return list;
    }

    public void download(String lo, String name) {

        String l = lo;
        String n = name;
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            ExternalContext externalContext = context.getExternalContext();

            externalContext.responseReset();
            externalContext.setResponseContentType("application/pdf");
            externalContext.setResponseHeader("Content-Disposition", "attachment;filename=\"" + n + "\"");

            InputStream inputStream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/second/" + l + "");
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

    public String page(String tab) throws ClassNotFoundException, SQLException {

        setSelectedname(tab);
        return "2SS.xhtml";
    }
}
