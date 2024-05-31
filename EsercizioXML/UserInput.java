import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public interface UserInput {
    public static User createUser(){
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        String firstName = scannerS.nextLine();
        System.out.println("Inserisci il tuo cognome: ");
        String lastName = scannerS.nextLine();
        System.out.println("Inserisci il tuo email: ");
        String email = scannerS.nextLine();
        System.out.println("Inserisci la tua eta : ");
        int age = scannerN.nextInt();
        if(firstName!=null && lastName!=null && email != null && age>0){
            User user = new User(firstName, lastName, email, age);
            return user;
        }else{
            System.out.println("Dati inseriti mancanti, reinseriscili");
            return createUser();
        }
    }

    public static void serializeToXML(User userIn, String fileName){
        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();



            Element root = document.createElement("Users");
            document.appendChild(root);

            Element user = document.createElement("User");
            root.appendChild(user);

            user.setAttribute("id", "1");

            Element firstName = document.createElement("firstName");
            firstName.appendChild(document.createTextNode(userIn.getFirstName()));
            user.appendChild(firstName);

            Element lastName = document.createElement("lastName");
            lastName.appendChild(document.createTextNode(userIn.getLastName()));
            user.appendChild(lastName);

            Element email = document.createElement("email");
            email.appendChild(document.createTextNode(userIn.getEmail()));
            user.appendChild(email);

            Element age = document.createElement("age");
            age.appendChild(document.createTextNode(userIn.getAge()));
            user.appendChild(age);

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
}
