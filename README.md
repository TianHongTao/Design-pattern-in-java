# 设计模式
---

*特别感谢![参考菜鸟教程](http://www.runoob.com/design-pattern/design-pattern-tutorial.html)*

## 模式
工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一．这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式．

在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象．

### 具体方法
**意图**：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

**主要解决**：主要解决接口选择的问题。

**何时使用**：我们明确地计划不同条件下创建不同实例时。

**如何解决**：让其子类实现工厂接口，返回的也是一个抽象的产品。

**关键代码**：创建过程在其子类执行(在其工厂类中进行返回)

### 优缺点
**优点**
+ 调用者想要得到一个实例只需要明白其名称即可;
+ 可拓展性高，添加产品只需要添加产品类，更改工厂类即可;
+ 屏蔽产品的实现过程，仅需要维护接口即可.

**缺点**
每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。

###注意事项
作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。

###实现示意图
![](http://www.runoob.com/wp-content/uploads/2014/08/factory_pattern_uml_diagram.jpg)

##抽象工厂模式
###模式
抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂．该超级工厂又称为其他工厂的工厂．这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式．

在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类．每个生成的工厂都能按照工厂模式提供对象．

###具体方法
**意图**：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

**主要解决**：主要解决接口选择的问题。

**何时使用**：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。

**如何解决**：在一个产品族里面，定义多个产品。

**关键代码**：在一个工厂里聚合多个同类产品。

###优缺点
**优点**
当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象．

**缺点**
产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码．

###注意事项
产品族难扩展，产品等级易扩展。

###实现示意图
![](http://www.runoob.com/wp-content/uploads/2014/08/abstractfactory_pattern_uml_diagram.jpg)

##单例模式

###模式

###具体方法

###优缺点

###建议
一般情况下,不建议使用第1种和第2种懒汉方式,建议使用第3种饿汉方式.只有在要明确实现lazyloading效果时,才会使用第5种登记方式。如果涉及到反序列化创建对象时,可以尝试使用第6种枚举方式。如果有其他特殊的需求,可以考虑使用第4种双检锁方式.
