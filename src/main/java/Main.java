import java.io.InputStream;

public class Main {


    private void sendEmail(String to) {
        try {
            // all values as variables to clarify its usage
            //InputStream inputStream = Main.class.getClass().getResourceAsStream("/lineer.pdf");

            InputStream inputStream = getClass().getResourceAsStream("/pdf/myfile.pdf");

            String from = "me@mymail.com";
            String subject = "Your PDF";
            String text = "Here there is your <b>PDF</b> file!";
            String fileName = "file.pdf";
            String mimeType = "application/pdf";

            // call the mail service to send the message
            Mail.send(from, to, subject, text, inputStream, fileName, mimeType);

            inputStream.close();

            System.out.println("Email sent");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error sending the email" + e.toString());
        }
    }

    public static void main(String[] args) {

        Main m = new Main();
        m.sendEmail("yo@yourmail.com");

    }
}
