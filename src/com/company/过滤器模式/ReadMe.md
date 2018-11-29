## 过滤器模式
### 模式
过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。

### 实现示意图
![](http://www.runoob.com/wp-content/uploads/2014/08/filter_pattern_uml_diagram.jpg)

### JAVA8中自带过滤器模式识别(分组操作)
``` JAVA
Map<Integer, List<Person >> groupMap = persons.stream().collect(Collectors.groupingBy(Person::getMaritalStatus));
groupMap.forEach((k, v) -> {
    System.out.println(k);
    for(Person person:v){
        System.out.println(
        "Person : [ Name : " + person.getName()+
        ",Gender : " + person.getGender() +
        ", Marital Status : " + person.getMaritalStatus()+" ]");
    }
});

/*
    得到的结果形式是:
    k: 分组的指标，上述代码中为MaritalStatus(婚姻状况)
    v: 为一个list集合，就是list
*/
```
