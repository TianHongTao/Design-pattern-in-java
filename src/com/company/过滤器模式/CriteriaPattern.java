package 过滤器模式;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CriteriaPattern {
    public static void main(String[] args){

        List<Person> list = new ArrayList<>();

        list.add(new Person("Robert","Male", "Single"));
        list.add(new Person("John","Male", "Married"));
        list.add(new Person("Laura","Female", "Married"));
        list.add(new Person("Diana","Female", "Single"));
        list.add(new Person("Mike","Male", "Single"));
        list.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(list));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(list));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(list));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(list));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }


}
