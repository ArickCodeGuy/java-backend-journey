# Technical interview common questions

## Java

- What is OOP. 3 postulates.
- SOLID
- Methods of `Object`
- Superclass `java.lang.Object`
- `java.lang.System` class
- Collections hierarchy
- Design patterns.
  - Singleton
  - Proxy
  - Builder
  - Chain of responsibility
  - Factory
  - SAGA
- Dependancy injection
- Overloading
- Overriding
- Comparing strings. Object equality
- Hashmap. Hashing. Hash collision
- Serialization, desiralization
- `hashCode()`, `equals()`
- Wrapper classes
- Annonymous inner class
- Aggregation
- RMI (Remote Method Invocation)
  - Why?
  - How to create?
- Typecasting. Implicit, explicit
- Hibernate `get()` `load()` methods
- Default value of local variable

## Exceptions

- Hierarchy
- `Throwable`
- `Exception`
- Checked
- Unchecked
- Exceptions handling
- Methods
- `try` with resources

## Threads

- `Thread`, `Runnable`. Asynchronous code
- Monitor, mutex, semaphore
- `ForkJoinPool`
- Create thread pool
- Lifecycle
- States
- Syncing 2 threads
- Daemon thread
- `volatale`, `Lock`, `sychronized`, atomics

## Garbage collection

- How it works
- DGC (Distributed Garbage Collection)

## Spring boot

- Why? What problem it solves?
- `@Transactional`
- `@Bean`
- `@PostConstruct` and business logic in constructor
- Synchronization
- bean lifecycle
- Dependancy injection in spring
- Cyclic dependancies
- Spring dependancies
  - Web
  - Security
  - jakarta
  - JPA Hibernate
  - Actuators
- Types of Spring Data
- Persistent context. `EntityManager`, `Session`
- How to map object to table item. `@Entity`, `@Id`. Why we need `@Id`
- Caching in `EntityManager`
- Different approaches to how to create controllers
- How to connect to db
- Config **TODO**

## Testing

**TODO**

## Databases

- ACID
  - Isolation Levels
- Query Optimization
- Indexes. Keys
- Locks. Optimistic, pessimistic

## System design

- Caching
- Scalability
- High-load
- Load-balancing
- Prioritization
