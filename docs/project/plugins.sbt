lazy val plugins = (project in file(".")).dependsOn(sbtPlayEbean)
  .settings(
    scalaVersion := "2.12.17"
  )

lazy val sbtPlayEbean = ProjectRef(Path.fileProperty("user.dir").getParentFile, "plugin")

resolvers ++= DefaultOptions.resolvers(snapshot = true)

addSbtPlugin("com.typesafe.play" % "play-docs-sbt-plugin" % sys.props.getOrElse("play.version", "2.9.0-M2"))
