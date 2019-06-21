# Logger Adapter
A Core Java Logger Adapter that will give you the possibility to write Logger independent 
code. 

## Status
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.rapidpm/rapidpm-logger-adapter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.rapidpm/rapidpm-logger-adapter)
[![Release](https://jitpack.io/v/svenruppert/logger-adapter.svg)](https://jitpack.io/#svenruppert/logger-adapter)

[![](https://jitci.com/gh/svenruppert/logger-adapter/svg)](https://jitci.com/gh/svenruppert/logger-adapter)

![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=svenruppert_logger-adapter&metric=security_rating)
![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=svenruppert_logger-adapter&metric=sqale_rating)

## JDK8 or JDK9 and above
I compiled this with the Open JDK8.
Previous versions at maven central are build ith JDK10.
I went away from the JDK10, because most projects I know, are using JDK8 in production right know.
But, if you want to use this with JDK9/10/11/... you can use it.. it is working perfect!
Only if you start using the JMS, it could be helpful to add a **module-info.java**
Add the following lines, switch inside the pom.xml to the JDK version you prefer,
start a **mvn clean install** and be happy ;-)

```java
module rapidpm.dependencies.core.logger {
  requires log4j;
  requires transitive java.logging;
  requires slf4j.api;
  requires org.apache.logging.log4j;
  exports org.rapidpm.dependencies.core.logger;
}
```

## Supported Versions and vendors
### Vendors
* OpenJDK
* Oracle
* Oracle - GraalVM
* Amazon
* IBM
* Adopt-OpenJ9
* Zulu
* Liberica

### JDK Versions 
* JDK 6
* JDK 7
* JDK 8
* JDK 9
* JDK 10
* JDK 11
* JDK 12
* JDK 13

## Distribution Management
The final releases are available in maven central.
But additionally I am using JITPack and JitCI.
To used JitPack as well you have to add the JitPack Repository to your *pom.xml*

```xml
  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>
``` 

The snapshot dependencies are now available as well as releases under

```xml
	<dependency>
	    <groupId>com.github.svenruppert</groupId>
	    <artifactId>logger-adapter</artifactId>
	    <version>--version--</version>
	</dependency>
```

## Why do we need a Core Java Logger Adapter?
In every project, there is the decision of what logger framework should be used.
The bad thing here is, whatever you are choosing, it will be the wrong one. Other projects or frameworks are using different logger frameworks.
So I decided to create a simple, robust solution that will give me the freedom to stop worrying about it. At runtime, this Adapter will check what logging framework is available 
in the classpath and will transparently use this.


## How to use?
To use this you have two possibilities.
However, the first step is to add the dependency to your *pom.xml*.
Second step is, chooseing the way you want to define a Logger.

### Way One:
Define a class attribute.

```java
LoggerService logger = Logger.getLogger(getClass());
```

### Way Two:
You can implement an interface, that will give you a method to get the logger.
The interface provides a default - implementation, so there is nothing additional to do for you.
This solution is perfect for web apps as well because you don´t have to worry about Serializable.

```java
MyClass implements HasLogger {}

```


