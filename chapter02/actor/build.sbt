scalaVersion := "2.10.3"

name := "RDP-Ch2-Actor"

libraryDependencies ++= Seq(
          "com.typesafe.akka" %% "akka-actor" % "2.5.12",
          "com.typesafe.akka" %% "akka-slf4j" % "2.5.12",
          "ch.qos.logback" % "logback-classic" % "1.0.10",
          "com.typesafe.akka" %% "akka-testkit" % "2.5.12" % "test",
          "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)


