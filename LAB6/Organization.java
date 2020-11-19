import java.util.*;

public class Organization {
    
    static class Hospital{
        String name;
        String address;
        String phone;
        
        Departament[] departaments;
        Hospital(){};
    }
    
    static class Departament{
        Staff[] staff;
    }
    
    static class Person{
        String title;
        String givenName;
        String middleName;
        String familyName;
        String name;
        Date birthDate;
        String gender;
        String address;
        String Phone;
        
        String getName(){
            return givenName + " " + middleName + " " + familyName;
        }
    }
    
    static class Patient extends Person{
        String id;
        Integer age;
        Date accepted;
        String sickness;
        String prescriptions;
        String allergies;
        String specialReqs;
        
        int getAge(){
            int birthYear = this.birthDate.getYear() + 1900;
            int currentYear = new Date().getYear() + 1900;
            return currentYear - birthYear;
        }
    }
    static class Staff extends Person {
        Date joined;
        String education;
        String certification;
        String languages;
    }
    static class OperationsStaff extends Staff {};
    static class Doctor extends OperationsStaff {
        String specialty;
        String locations;
    }
    static class Surgeon extends Doctor {};
    static class Nurse extends OperationsStaff {};
    
    static class AdministrativeStaff extends Staff{};
    static class FrontDeskStaff extends AdministrativeStaff{};
    static class Receptionist extends FrontDeskStaff {};
    
    static class TechnicalStaff extends Staff{};
    static class Technician extends TechnicalStaff{};
    static class Technologist extends TechnicalStaff{};
    static class SurgicalTechnologist extends Technologist{};
    

}

