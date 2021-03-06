lazy val `sbt-rjs` = project in file(".")
description := "Allows RequireJS to be used from within sbt"

scalacOptions += "-feature"

libraryDependencies ++= Seq(
  "org.webjars" % "rjs" % "2.3.5"
)

addSbtJsEngine("1.2.2")

scalaVersion := "2.12.2"
