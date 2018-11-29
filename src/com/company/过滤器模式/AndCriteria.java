package 过滤器模式;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria cirteria;
    private Criteria otherCirteria;

    public AndCriteria(Criteria cirteria, Criteria otherCirteria){
        this.cirteria = cirteria;
        this.otherCirteria = otherCirteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersonList = cirteria.meetCriteria(personList);
        return otherCirteria.meetCriteria(firstCriteriaPersonList);
    }
}
