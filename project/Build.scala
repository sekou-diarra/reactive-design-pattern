import sbt._

object Build {
  val akkaVersion = "2.5.12"

  val akkaActor   = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
  val akkaContrib = "com.typesafe.akka" %% "akka-contrib" % akkaVersion
  val akkaSharding= "com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion
  val akkaDData   = "com.typesafe.akka" %% "akka-distributed-data" % akkaVersion
  val akkaStream  = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  val akkaTyped   = "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion
  val akkaPersistence = "com.typesafe.akka" %% "akka-persistence" % akkaVersion
  val akkaPersistenceQuery = "com.typesafe.akka" %% "akka-persistence-query" % akkaVersion

  val levelDb     = "org.iq80.leveldb" % "leveldb" % "0.10"

  val amazonAWS = "com.amazonaws" % "aws-java-sdk" % "1.11.331"

  val sbtIO = "org.scala-sbt" %% "io" % "1.1.4"


  val scalaAsync = "org.scala-lang.modules" %% "scala-async" % "0.9.7"
  val scalaJava8 = "org.scala-lang.modules" %% "scala-java8-compat" % "0.9.0"


  val playJson = "com.typesafe.play" %% "play-json" % "2.6.7"

  val scalatest = "org.scalatest" %% "scalatest" % "3.0.0" % "test"
  val junit = "org.junit.jupiter" % "junit-jupiter-api" % "5.2.0" % "test"
}
