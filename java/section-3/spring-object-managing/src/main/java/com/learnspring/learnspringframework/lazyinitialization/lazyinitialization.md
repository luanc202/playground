# What did I learn this class?

### Lazy initialization in Spring

 In this example, the class managed by Spring is only initialized when called  and not at startup, which is the usual way. Lazy initialization is not recommended by Spring team unless you really have a reason to do so.

<details>
  <summary>Code</summary>
    
  ```java
@Component
class ClassA {}
@Component
@Lazy
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA) {
        System.out.println("Some initialization logic");
        this.classA = classA;
    }
    public void doSomething() {
        System.out.println("Do something");
    }
}
  ```

</details>

## Comparison with Eager initialization
| Syntax      | @Component | @Bean     |
    | :---        |    :---   |          :--- |
    | Header      | Can by used in any Java class       | Generally used on methods in Spring Configuration classes   |
    | Paragraph   | Text        | And more      |
