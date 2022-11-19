## Run main file

javac -cp sodium.jar:swidgets.jar:. Tracker.java
java Tracker
(sodium import results in an import error sometimes, but it can be run on eclipse)


## Run test files

javac -cp junit-4.12.jar:. DatCheck.java
java -cp junit-4.12.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore fileCheck

javac -cp junit-4.12.jar:. TestEvent.java
java -cp junit-4.12.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore testName