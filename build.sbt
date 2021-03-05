lazy val `hello-play-27` = project
  .in(file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "hello-play-28",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.13.5",
    libraryDependencies ++= Seq(
      guice,
      "com.h2database" % "h2" % "1.4.200",
      "org.flywaydb" %% "flyway-play" % "7.2.0",
      "org.scalatest" %% "scalatest" % "3.2.5" % "test"
    )
  )
