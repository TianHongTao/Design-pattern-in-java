package 过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    public List<Person> singleList = new ArrayList<>();

    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        for (Person person:singleList) {
            if (person.getMaritalStatus().equalsIgnoreCase("Single"))
                singleList.add(person);
        }

        return singleList;
    }
}
