# ixirc schemas
All protocol buffer files and the ability to create a `.jar`.

Right now the `.jar` file will only get published to local maven and ivy repositories.

```bash
> $ sbt clean compile +publishLocal
```

To include it in your project add

```sbtshell
libraryDependencies += "com.funny" %% "ixirc-schemas" % "x.y.z"
```