import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wyświetl wszystkich studentów z pliku");
        System.out.println("3. Wyjście");
        String opcja = br.readLine();
        switch (opcja) {
          case "1":
            System.out.println("Podaj imię studenta:");
            String imię = br.readLine();
            System.out.println("Podaj wiek studenta:");
            int wiek = Integer.parseInt(br.readLine());
            s.addStudent(new Student(imię, wiek));
            break;
          case "2":
            var students = s.getStudents();
            for (Student student : students) {
              System.out.println(student.ToString());
            }
            break;
          case "3":
            System.out.println("Wyjście z programu.");
            return;
          default:
            System.out.println("Niepoprawna opcja. Wybierz ponownie.");
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}