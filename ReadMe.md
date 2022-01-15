We have a simple java project with unit tests written in scalatest:   

- no scala library in compile scope (autoScalaLibrary := false)
- scala-compiler added to test scope to compile unit tests written in scala using scalatest
- scala-library, scalatest added to test scope for unit tests   


Getting below error when executing unit tests from **intellij as well as from commandline sbt console**:-

```
scalac: error while loading package, class file '/Users/loc/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.8/scala-library-2.13.8.jar(scala/reflect/package.class)' is broken
(class java.lang.RuntimeException/error reading Scala signature of package.class: Scala signature package has wrong version
 expected: 5.0
 found: 5.2 in package.class)
```

---

Stackoverflow link :-   
https://stackoverflow.com/questions/70724032/pure-java-project-with-unit-tests-written-using-scalatest-having-compiler-compat

Gitter Link :-   
https://gitter.im/sbt/sbt?at=61e30f06f5a3947800088f3d