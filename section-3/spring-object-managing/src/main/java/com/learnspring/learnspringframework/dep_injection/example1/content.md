 # What did I learn this class?

 There are three ways to use dependecy injection in Spring

 ### 1. Constructor Injection (Recommended)

 In this example, the dependecies are injected in the constructor of the class. This is recommended by the Spring team.

<details>
  <summary>Code</summary>
  ```java
  @Autowired
    public BusinessClass(Dependecy1 dependecy1, Dependecy2 dependecy2) {
        System.out.println("Constructor Injection - Dependency 1");
        this.dependecy1 = dependecy1;
        System.out.println("Constructor Injection - Dependency 2");
        this.dependecy2 = dependecy2;
    }
  ```
</details>

###  2. Setter Injection
In this example, the dependecies are injected in the setters of the class.

<details>
  <summary>Code</summary>

```java
@Autowired
    public void setDependecy1(Dependecy1 dependecy1) {
        System.out.println("Setter Injection - Dependency 1");
        this.dependecy1 = dependecy1;
    }

    @Autowired
    public void setDependecy2(Dependecy2 dependecy2) {
        System.out.println("Setter Injection - Dependency 2");
        this.dependecy2 = dependecy2;
    }
```
</details>

### 1. Field Injection

In this example, the dependecies are injected in the fields of the class.

<details>
  <summary>Code</summary>

```java
@Autowired
    private Dependecy1 dependecy1;

    @Autowired
    private Dependecy2 dependecy2;
```
</details>



## Important Terminology

### @Component annotation

This annotation is used to mark a class as a bean and let Spring create a instance of that class and control it in the application.

### Dependency

A class being an implementation of an interface is called a dependency. For example, if we have a class called `BusinessClass` that implements the interface `BusinessInterface`, then `BusinessClass` is a dependency of `BusinessInterface`.

### Component Scan

This is a feature of Spring that allows it to scan the packages for classes that are marked with the `@Component` annotation and create instances of them.

### Dependency Injection

This is a feature of Spring that allows it to inject dependencies into a class. This is done by marking the class with the `@Autowired` annotation. Spring will then look for a class that implements the interface of the dependency and inject it into the class.

## @Component vs. @Bean
| Syntax      | @Component | @Bean     |
    | :---        |    :---   |          :--- |
    | Header      | Can by used in any Java class       | Generally used on methods in Spring Configuration classes   |
    | Paragraph   | Text        | And more      |
