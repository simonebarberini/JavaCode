import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome.");
        String nome = scanner.nextLine();
        System.out.println("Inserisci l'etá.");
        int age = scanner.nextInt();

        Person persona = new Person(nome, age);
        if(Person.class.isAnnotationPresent(Info.class)){
            Info info = Person.class.getAnnotation(Info.class);
            System.out.println(info.author()+ " "+info.version());
        }
        Method[] metodi = Person.class.getMethods();
        for(Method metodo:metodi){
            if(metodo.isAnnotationPresent(DeprecatedCustom.class)){
                DeprecatedCustom custom = metodo.getAnnotation(DeprecatedCustom.class);
                System.out.println(custom.message());
            }
        }

        serializeToXML(persona, "infopersona");

        readFromXML("infopersona.xml");

        scanner.close();
    }

    public static void serializeToXML(Person personIn, String fileName) throws DOMException, NoSuchMethodException{
        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();



            Element root = document.createElement("Persone");
            document.appendChild(root);

            Element person = document.createElement("Person");
            root.appendChild(person);

            person.setAttribute("id", "1");

            Element name = document.createElement("name");
            name.appendChild(document.createTextNode(personIn.getName()));
            person.appendChild(name);

            Element age = document.createElement("age");
            age.appendChild(document.createTextNode(personIn.getAge()));
            person.appendChild(age);

            Element info = document.createElement("info");
            info.appendChild(document.createTextNode(personIn.getInfo()));
            person.appendChild(info);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            StreamResult streamResult = new StreamResult(new File(fileName+".xml"));
            transformer.transform(domSource, streamResult);

            System.out.println("File XML creato con successo!");

            
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    public static void readFromXML(String fileName){
         try {
            File file = new File(fileName);
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);

            document.getDocumentElement().normalize();

            Element root = document.getDocumentElement();

            String name = root.getElementsByTagName("name").item(0).getTextContent();
            int age = Integer.parseInt(root.getElementsByTagName("age").item(0).getTextContent());
            String info = root.getElementsByTagName("info").item(0).getTextContent();

            System.out.println("Nome: " + name);
            System.out.println("Eta': " + age);
            System.out.println("Info: "+ info);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
