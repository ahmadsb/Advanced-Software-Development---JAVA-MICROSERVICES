package IOFiles.src;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class Directories {
    public static void main(String [] args) throws ParserConfigurationException, TransformerException {
        //1. create folder
        String dirPath = "IOFiles/src/myDir";
        File fileDir = new File(dirPath);
        fileDir.mkdir();
        //2. create XML file
        // What is XML file?
        // structure such as <tag> value </tag>

        //2.a create a document
        DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = doc.newDocumentBuilder();
        Document myDoc = docBuilder.newDocument();
        //2.b create element <students> </students>
        Element root = myDoc.createElement("students");
        //2.c inject root inside myDoc
        myDoc.appendChild(root);
        //random data
        String[] data = {"Ahmad", "Mahmoud", "Majed"};
        //3.create 3 student with name for each one
        for(int i =0; i < 3 ; ++i){
            Element student = myDoc.createElement("student");
            // value
            Element studentName  = myDoc.createElement("name");
            studentName.setTextContent(data[i]);
            //<student id= "1" ><name> data[0]</name> </student?
            student.setAttribute("id",String.valueOf(i));
            student.appendChild(studentName);
            root.appendChild(student);
        }


        //4. write the content to XML file
        String filePath = dirPath+"/index.xml";
        DOMSource source = new DOMSource(myDoc);
        StreamResult result = new StreamResult(new File(filePath));

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        transformer.transform(source,result);




    }
}
