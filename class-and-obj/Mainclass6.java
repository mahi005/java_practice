class Email{
    String from;
    String to;
    void readEmail(){
        System.out.println("Reading email from" +from);
    }
    void sentEmail(){
        System.out.println("sending email to "+to);
    }
}

public class Mainclass6 {
    public static void main(String[] args) {
        Email e1 = new Email();
        e1.from="abc@gmail.com";
        e1.to="pqr@gmail.com";
        e1.readEmail();
        e1.sentEmail();
    }
}
