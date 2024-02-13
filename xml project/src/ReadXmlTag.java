import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class ReadXmlTag {

    public static final String FILENAME = "/c:/xml/customer.xml";
    public static void main (String[]args)  {
        //1.DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //2.Document Builder
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();

            //3.parse the xml file
            Document document = builder.parse(new File(FILENAME));

            //4.rootElement
            Element rootElement = document.getDocumentElement();

            System.out.println(" Root element = "+ rootElement.getNodeName());

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }


    }
}
