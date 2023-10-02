 
# What did I learn this class?

### Bean Scopes

Singleton - One object instance per Spring IoC container
Prototype - One or more instances per Spring IoC container

 In this example, we use Bean Scopes to define which beans are created multiple instances of when called. This is commonly applied to web applications where a Bean is created for each unique action.
 
Examples:
- Request: one object instance per HTTP request
- Session: one object instance per HTTP session
- Application: one object instance per application runtime
- WebSocket: one object instance per  WebSocket instance

Differently from Java Singleton (GOF), Spring Singletons creates one instance per container, and not per JVM as Java SG does.

<details>
  <summary>Code</summary>
  ```java
@Component
class NormalClass {
}
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
}
  ```
</details>
