name := "ixirc-schemas"

organization := "com.funny"

version := "0.0.1"

scalaVersion := "2.13.3"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value / "scalapb"
)

crossScalaVersions := Seq("2.13.3", "2.12.12")

publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)

libraryDependencies ++= { Seq(
  "com.thesamet.scalapb"     %% "scalapb-runtime"     % scalapb.compiler.Version.scalapbVersion % "protobuf",
)}

githubOwner := "kaaquist"
githubRepository := "ixirc-schemas"