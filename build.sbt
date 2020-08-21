import sbtassembly.AssemblyKeys._

name := "ixirc-schemas"

organization := "com.funny"

version := "0.0.1"

scalaVersion := "2.13.3"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value / "scalapb"
)

crossScalaVersions := Seq("2.13.3", "2.12.12")

publishTo := Some(Resolver.file("local-ivy", file("$HOME/.ivy2/local/")))
publishTo := Some(MavenCache("local-maven", file("$HOME/.m2/repository/")))

libraryDependencies ++= { Seq(
  "com.thesamet.scalapb"     %% "scalapb-runtime"     % scalapb.compiler.Version.scalapbVersion % "protobuf",
)}