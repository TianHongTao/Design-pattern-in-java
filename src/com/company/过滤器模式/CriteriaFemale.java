package 过滤器模式;

import 原型模式.Circle;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    public List<Person> femaleList = new ArrayList<>();

    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        for (Person person:personList) {
            if (person.getGender().equalsIgnoreCase("Female"))
                femaleList.add(person);
        }

        return femaleList;
    }
}
