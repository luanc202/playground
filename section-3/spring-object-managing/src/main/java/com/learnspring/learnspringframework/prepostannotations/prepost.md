# What did I learn this class?

### Post creation and pre destruction annotations

@PostConstruct - executes code after the Bean is initialized by the Spring Container
@PreDestroy - executes code before the Bean is destroyed by the Spring Container

<details>
  <summary>Code</summary>
  
```java
@Component
class SomeClass {
    private SomeDependency someDependency;
    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
    }
    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }
    @PreDestroy
    public void cleanup() {
        System.out.println("Cleanup");
    }
}
@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Some logic using SomeDepedency");
    }
}
```

</details>