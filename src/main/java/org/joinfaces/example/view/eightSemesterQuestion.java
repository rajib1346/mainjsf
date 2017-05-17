package semester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
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

@SessionScoped
@ManagedBean
public class eightSemesterQuestion {
    
     public List<tabelElement> getLocationQuestion() throws  FileNotFoundException, IOException {

        List<tabelElement> list = new ArrayList<tabelElement>();
       //  BufferedReader br=null;

      //  br=new BufferedReader(new FileReader("C:\\Users\\Acer\\Documents\\NetBeansProjects\\NuCseHome\\text"));
      
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fast", "root", "");
//
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("select id,location,fileName,Author,size from " + selectedname + "");
 URL oracle = new URL("http://shawonislam.com/rajib/eightques.txt");
    BufferedReader in = new BufferedReader(
    new InputStreamReader(oracle.openStream()));

    String inputLine;
        while((inputLine = in.readLine()) != null) {
            tabelElement elementquestion = new tabelElement();
              
           // element.setId(rs.getString("id"));
            elementquestion.setQlocation(inputLine);
//            element.setLocation(rs.getString("location"));
//            element.setAuthor(rs.getString("Author"));
//            element.setSize(rs.getString("size"));

            list.add(elementquestion);
        }

        return list;
    }
   public void downloadQuestion( String lo) {

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
}
