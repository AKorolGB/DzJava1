package les3;

public class Main {
    public static void main(String[] args) {
       Service service = new Service();

        service.addStudent("Паша", 18);
        service.addStudent("Даша", 19);
        service.addStudent("Саша", 17);
        service.addStudent("Наташа", 20);


        System.out.println(service.info());
    }
}
