public class Student{
    String emri;
    int nota;
    String email;

    public void afishoTeDhenat(){
        System.out.println("Emri: " + emri);
        System.out.println("Nota: " + nota);
        System.out.println("Email: " + email);
    }

    public boolean kaKaluar(){
        return nota >= 5;
    }

    public String rezultati() {
        if (nota >= 5) {
            return "Kalues";
        }
        return "Jo kalues";
    }
}