package DropDown_Select_Class;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
 
public class ReadXML {
    public static void main(String[] args) throws Exception  {
 
        //The two lines below are just for getting an
        //instance of DocumentBuilder which we use
        //for parsing XML data
        DocumentBuilderFactory factory =
        DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
 
        //Parsing of Book.xml is done here
        Document doc = builder.parse(new File("D:\\Automation\\Story_17399_TestCases.xlsx"));
 
        //Here we get the root element of XML and print out
        Element rootElement = doc.getDocumentElement();
 
        //Here we get a list of all elements named 'child'
        NodeList list = rootElement.getElementsByTagName("author");
 
        //Traversing all the elements from the list and printing
        //out its data
        for (int i = 0; i < list.getLength(); i++) {
             
            //Getting one node from the list.
            Node childNode = list.item(i);
           
            System.out.println("Name of the Author : " + childNode.getTextContent());
        }
    }
}