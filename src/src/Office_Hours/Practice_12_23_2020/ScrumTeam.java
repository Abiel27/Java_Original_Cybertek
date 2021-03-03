package src.Office_Hours.Practice_12_23_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private ProductOwner productOwner;  // ScrumTeam Has A Product Owner
    private ScrumMaster scrumMaster; // ScrumTeam Has A ScrumMaster
    private BusinessAnalyst businessAnalyst; // ScrumTeam Has A Business Analyst

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner productOwner) {
        setProductOwner(productOwner);
    }

    public ScrumTeam(ProductOwner productOwner, ScrumMaster scrumMaster) {
       this(productOwner);
       setScrumMaster(scrumMaster);
    }

    public ScrumTeam(ProductOwner productOwner, ScrumMaster scrumMaster, BusinessAnalyst businessAnalyst){
        this(productOwner, scrumMaster);
        setBusinessAnalyst(businessAnalyst);
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTester(Tester[] testers){
       this.testers.addAll( Arrays.asList(testers) );

      //  for(Tester each : testers ) addTester(each);
    }

    public void addDeveloper(Developer[] developers){

       // for( Developer each: developers) addDeveloper(each);
        this.developers.addAll( Arrays.asList(developers) );

    }

    public void removeTester(String ID){
        testers.removeIf( p ->  p.ID.equals(ID) );
    }

    public void removeDeveloper(String ID){
        developers.removeIf( p -> p.ID.equals(ID));
    }

    public ProductOwner getProductOwner(){
        return productOwner;
    }

    public void setProductOwner(ProductOwner productOwner){
        this.productOwner = productOwner;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMaster scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public BusinessAnalyst getBusinessAnalyst() {
        return businessAnalyst;
    }

    public void setBusinessAnalyst(BusinessAnalyst businessAnalyst) {
        this.businessAnalyst = businessAnalyst;
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "Product Owner= " + productOwner.name +
                ", Scrum Master= " + scrumMaster.name +
                ", Business Analyst= " + businessAnalyst.name +
                ", testers= " + testers.size() +
                ", developers= " + developers.size() +
                '}';
    }


}
