package 过滤器模式;

import java.util.List;

public class OrCriteria implements Criteria {

    Criteria criteria;
    Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        List<Person> firstCriteriaItemList = criteria.meetCriteria(personList);
        List<Person> otherCriteriaItemList = otherCriteria.meetCriteria(personList);

        for (Person person:otherCriteriaItemList) {
            if (!firstCriteriaItemList.contains(person))
                firstCriteriaItemList.add(person);
        }

        return firstCriteriaItemList;
    }
}
