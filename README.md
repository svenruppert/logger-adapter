# logger-adapter
A Core Java Logger Adapter


## Status
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.rapidpm/rapidpm-logger-adapter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.rapidpm/rapidpm-logger-adapter)

[![](http://drone.rapidpm.org/api/badges/RapidPM/logger-adapter/status.svg?branch=develop)](http://drone.rapidpm.org/api/badges/RapidPM/logger-adapter/status.svg?branch=develop)

![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=functional-reactive_functional-reactive-lib&metric=security_rating)
![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=functional-reactive_functional-reactive-lib&metric=sqale_rating)

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/a0b7d530374d400fa9a79d270cf95c1a)](https://www.codacy.com/app/sven-ruppert/functional-reactive-lib?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=functional-reactive/functional-reactive-lib&amp;utm_campaign=Badge_Grade)

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


