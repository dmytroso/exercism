# Remote Control Competition

Welcome to Remote Control Competition on Exercism's Java Track.
If you need help running the tests or submitting your code, check out `HELP.md`.
If you get stuck on the exercise, check out `HINTS.md`, but try and solve it without using those first :)

## Introduction

An interface is a type containing members defining a group of related functionality. It distances the uses of a class from the implementation allowing multiple different implementations or support for some generic behavior such as formatting, comparison or conversion.

The syntax of an interface is similar to that of a class except that methods appear as the signature only and no body is provided.

```java
public interface Language {
    String getLanguageName();
    String speak();
}

public class ItalianTraveller implements Language, Cloneable {

    // from Language interface
    public String getLanguageName() {
        return "Italiano";
    }

    // from Language interface
    public String speak() {
        return "Ciao mondo";
    }

    // from Cloneable interface
    public Object clone() {
        ItalianTaveller it = new ItalianTaveller();
        return it;
    }
}
```

All operations defined by the interface must be implemented by the implementing class.

Interfaces usually contain instance methods.

An example of an interface found in the Java Class Library, apart from `Cloneable` illustrated above, is `Comparable<T>`. The `Comparable<T>` interface can be implemented where a default generic sort order in collections is required.

## Instructions

In this exercise you will be doing some more work on remote control cars.

An experimental car has been developed and the test track needs to be adapted to handle both production and experimental models. The two types of car have already been built and you need to find a way to deal with them both on the test track.

In addition, production cars are beginning to have some success. The team boss is keen to maintain the competitive spirit by publishing a ranking of the production cars.

## 1. Enable cars to be driven on the same test track

Please add a method to the `RemoteControlCar` interface to encapsulate the behavior of `drive()` for the two types of car.

```java
TestTrack.race(new ProductionRemoteControlCar());
TestTrack.race(new ExperimentalRemoteControlCar());
// this should execute without an exception being thrown
```

## 2. Enable the distance travelled by different models on the test track to be compared

Please add a method to the `RemoteControlCar` interface to encapsulate the behavior of the `getDistanceTravelled()` method for the two types of car. Notice that the Experimental model has a different speed than the Production model. 

```java
ProductionRemoteControlCar prod = new ProductionRemoteControlCar();
TestTrack.race(prod);
ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();
TestTrack.race(exp);
prod.getDistanceTravelled();
// => 10
exp.getDistanceTravelled();
// => 20
```

## 3. Allow the production cars to be ranked

Please implement the `Comparable<T>` interface in the `ProductionRemoteControlCar` class. The default sort order for cars should be ascending order of victories.

Implement the static `TestTrack.getRankedCars()` to return the cars passed in, sorted in ascending order of number of victories.

```java
ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
prc1.setNumberOfVictories(3);
prc2.setNumberOfVictories(2);
int rankings = TestTrack.getRankedCars(prc1, prc2);
// => rankings[1] == prc1
```

## Source

### Created by

- @mikedamay