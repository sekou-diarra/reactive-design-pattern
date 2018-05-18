import Build._

libraryDependencies ++= Seq(akkaActor, akkaTestkit, scalaAsync, junit, scalatest)

//spray.boilerplate.BoilerplatePlugin.Boilerplate.settings
enablePlugins(spray.boilerplate.BoilerplatePlugin)
