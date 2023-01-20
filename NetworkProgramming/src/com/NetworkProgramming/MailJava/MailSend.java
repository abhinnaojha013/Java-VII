package com.NetworkProgramming.MailJava;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class MailSend {
    public static void main(String[] args) throws AddressException {
        String recipient = "abhinnaojha013@gmail.com";
        String sender =  "abhinnacsit18@oic.edu.np";

        final String username = "abhinnacsit18@oic.edu.np";
        final String password = "abhinna013";

        String smtpHost = "smtp.gmail.com";
        // relay.jangosmtp.net
        // smtp-relay.gmail.com

        Properties propertiesValues = new Properties();

        propertiesValues.put("mail.smtp.auth", "true");
        propertiesValues.put("mail.smtp.host", smtpHost);
        propertiesValues.put("mail.smtp.port", "465"); // use 25, 465, 587 for gmail
        propertiesValues.put("mail.stp.starttls.enable","true");

        Session session = Session.getInstance(propertiesValues,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication () {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sender));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject("Mail via Java");
            message.setText("Checking sending emails by using Java mail API");

            Transport.send(message);

            System.out.println("Mail sent successfully");
        } catch (MessagingException messagingException) {
            messagingException.printStackTrace();
        }
    }
}
