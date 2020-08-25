# ixirc schemas
All protocol buffer files, and the ability to create a `.jar`.

Publish to local ivy local directories.

```bash
> $ sbt clean compile +publishLocal
```

Publish to github packages. (Be sure to read about [credentials needed to publish to Github](#github-credentials-for-github-packages))
```bash
> $ sbt clean compile +publish
```


To include it in your project add the following
```sbtshell
externalResolvers += "Schema Library package" at "https://maven.pkg.github.com/<user>/ixirc-schemas"
libraryDependencies += "com.funny" %% "ixirc-schemas" % "x.y.z"
```


#### Github Credentials for Github Packages
For the Github Package Plugin to work we need to set credentials. Here I assume you use the Manual Approach.  
Add the following to a file in `~/.sbt/1.0/github.sbt`. 
```text
credentials += 
  Credentials(
    "GitHub Package Registry",
    "maven.pkg.github.com",
    "USERNAME",
    "TOKEN")
```
You also need to add an env variable to your `.profile` file or its like.
```text
# Github settings for github packages
export GITHUB_TOKEN="<token>"
```
**Be aware**, that the token you use needs the right permissions. E.g. Github Packages admin rights.