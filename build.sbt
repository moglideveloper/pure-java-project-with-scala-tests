name := "pure-java-project-with-scala-tests"

//this is added for packaging
enablePlugins(PackPlugin)

//this will not add scala library to compile classpath, as our project is a pure java project
//this will also not add scala library when "sbt pack" is triggered
autoScalaLibrary := false
//this will disable cross-building, as our project is a pure java project
crossPaths := false

//this will add scalatest to test classpath, as our project unit tests will be written using scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % Test
//this will add scala library classes to test classpath, as our project unit tests will be written using scalatest
libraryDependencies += "org.scala-lang" % "scala-library" % "2.13.8" % Test

//our assumption is scala-compiler, it is required to compile scala unit tests
//but it is giving below error, when I try to execute unit test from intellij as well as sbt
libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.13.8"




