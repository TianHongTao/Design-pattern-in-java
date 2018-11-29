package 过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> maleList = new ArrayList<>();

        for (Person person:personList) {
            if (person.getGender().equalsIgnoreCase("Male"))
                maleList.add(person);
        }
        return maleList;
    }
}
