//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import programlama.business.ProgrammingLanguageService;
import programlama.business.TechnologyService;
import programlama.entities.ProgrammingLanguage;
import programlama.entities.Technology;
import programlama.repository.InMemoryProgrammingLanguage;
import programlama.repository.InMemoryTechnologyRepository;
import programlama.repository.ProgrammingLanguageRepository;
import programlama.repository.TechnologyRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ProgrammingLanguageRepository programmingLanguageRepository = new InMemoryProgrammingLanguage();
        TechnologyRepository technologyRepository =  new InMemoryTechnologyRepository();


        ProgrammingLanguageService programmingLanguageService = new ProgrammingLanguageService(programmingLanguageRepository);
        TechnologyService technologyService = new TechnologyService(technologyRepository);

        // Ana menü
        while (true) {
            System.out.println("\nAna Menü:");
            System.out.println("1. Programlama Dili Ekle");
            System.out.println("2. Teknoloji Ekle");
            System.out.println("3. Programlama Dillerini Listele");
            System.out.println("4. Teknolojileri Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Programlama dili adı: ");
                    String languageName = scanner.nextLine();
                    int languageId = programmingLanguageRepository.getAll().size() + 1;
                    programmingLanguageService.add(new ProgrammingLanguage(languageId, languageName));
                    break;

                case 2:

                    System.out.print("Teknoloji adı: ");
                    String technologyName = scanner.nextLine();
                    System.out.print("Programlama dili ID'si: ");
                    int languageIdForTech = scanner.nextInt();
                    scanner.nextLine();  // boşluğu temizle
                    ProgrammingLanguage programmingLanguage = programmingLanguageService.getById(languageIdForTech);
                    int technologyId = technologyRepository.getAll().size() + 1;
                    technologyService.add(new Technology(technologyId, technologyName, programmingLanguage));
                    break;

                case 3:

                    System.out.println("Programlama Dilleri:");
                    programmingLanguageService.getAll().forEach(System.out::println);
                    break;

                case 4:

                    System.out.println("Teknolojiler:");
                    technologyService.getAll().forEach(System.out::println);
                    break;

                case 5:

                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçenek.");
            }
        }
    }
}