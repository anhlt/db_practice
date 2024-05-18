val scala3Version = "3.4.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "aldb",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )



val commonSettings = Seq(
  scalacOptions -= "-Xfatal-warnings",
  scalacOptions += "-source:future",
  scalacOptions += "-rewrite",
  scalacOptions += "-indent",
  scalacOptions += "-Yexplicit-nulls",
  scalacOptions += "-explain",
  scalacOptions += "-Wunused:all",
  libraryDependencies ++= Seq(
    Dependencies.catsCore.value,
    Dependencies.scribe.value,
    Dependencies.scribeCats.value,
    Dependencies.catsEffect.value,
    Dependencies.fs2.value,
    Dependencies.scalaCheckEffect.value,
    Dependencies.munit.value,
    Dependencies.munitCatsEffect.value,
    Dependencies.munitScalaCheck.value,
    Dependencies.munitScalaCheckEffect.value,
  ),
)

