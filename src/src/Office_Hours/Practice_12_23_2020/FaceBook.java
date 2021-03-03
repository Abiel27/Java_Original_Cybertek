package src.Office_Hours.Practice_12_23_2020;

public class FaceBook {

    public static void main(String[] args) {
        ProductOwner PO = new ProductOwner("Aysel", "A01", 'F', 180000, true);
        BusinessAnalyst BA = new BusinessAnalyst("Ayse", "A02", 'F', 150000, true);
        ScrumMaster SM = new ScrumMaster("Yalcin", "A03", 'M', 135000, true);

        Tester tester = new Tester("Sayyohat", "QE","B01", 'F', 115000, false);
        Tester[] testers = {
                new Tester("Elvira", "QA", "B02", 'F', 115001, true),
                new Tester("Ekaterina", "SDET", "B03", 'F', 115002, false)
        };

        Developer developer = new Developer("Afrooz", "Java Developer", "C01", 'F', 120000, true);

        Developer[] developers = {
             new Developer("Erjon", "Software Developer", "C02", 'M', 120000, false),
             new Developer("Necdet", "Senior Developer", "C03", 'M', 120001, true)  ,
        };




        ScrumTeam scrumTeam = new ScrumTeam(PO, SM, BA);
        System.out.println(scrumTeam);

        scrumTeam.addTester(tester);
        scrumTeam.addDeveloper(developer);

        System.out.println(scrumTeam);

        scrumTeam.addDeveloper(developers);
        scrumTeam.addTester(testers);

        System.out.println(scrumTeam);

      //  scrumTeam.removeTester("B02");
      //  scrumTeam.removeDeveloper("C02");
     //   System.out.println(scrumTeam);

        System.out.println("===================================================================");

        for(Developer each : scrumTeam.developers){
            System.out.println(each.name +" : "+each.salary);
        }

        System.out.println("=============================================================");

        System.out.println( scrumTeam.getProductOwner()  );
        System.out.println( scrumTeam.getBusinessAnalyst());
        System.out.println(scrumTeam.getScrumMaster());

    }
}
