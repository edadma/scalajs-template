ThisBuild / licenses += "ISC" -> url("https://opensource.org/licenses/ISC")
ThisBuild / versionScheme := Some("semver-spec")

publish / skip := true

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "sjs-template",
    version := "0.0.1",
    scalaVersion := "3.3.1",
//    libraryDependencies += "com.raquo" %%% "laminar" % "16.0.0",
//    libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.5.0",
    libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.17" % "test",
//    libraryDependencies += "com.lihaoyi" %%% "pprint" % "0.8.1" % "test",
    jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv(),
    Test / scalaJSUseMainModuleInitializer := true,
    Test / scalaJSUseTestModuleInitializer := false,
//    Test / scalaJSUseMainModuleInitializer := false,
//    Test / scalaJSUseTestModuleInitializer := true,
    scalaJSUseMainModuleInitializer := true,
//    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
    publishMavenStyle := true,
    Test / publishArtifact := false,
    licenses += "ISC" -> url("https://opensource.org/licenses/ISC"),
  )
