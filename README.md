# logger-adapter
A Core Java Logger Adapter

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

# Release Notes
This Lib is working with
 * Java 08 (open/oracle/ibm/zulu/graalvm)
 * Java 09 (open/oracle/ibm/zulu)
 * Java 10 (open/oracle/zulu)
 * Java 11 (open/oracle/zulu)
 * Java 12 (open/oracle/zulu)
 
Since version 01.00.02-RPM I will start using JitCI to make my life easier.
SO, please add the following dependency to your pom.xml

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

## Why?
Every time you have to define/decide what will be your logger.. But you are writing a lib?
What ever you will choose, it will be wrong.

Other projects will make other decisions.. So let them decide what is right for them.

This means for you: Write an Adapter, that will decide at runtime what is the right 
logger-implementation.

## How to use?
To use this you can go two ways.
First of all, add the dependency.

Second, choose the way you want to define a Logger.

### Way One:
Define a class attribute.

```java
LoggerService logger = Logger.getLogger(getClass());
```

### Way Two:
You can implement an interface, that will give you a method to get the logger.
The interface provides a default - implementation, so there is nothing to do for you..

```java
MyClass implements HasLogger {}

```


