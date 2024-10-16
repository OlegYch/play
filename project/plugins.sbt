addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.8.0")
addSbtPlugin("ch.epfl.scala" % "sbt-version-policy" % "2.0.1")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.5")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.4.1")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.9.2")
addSbtPlugin("io.github.jonas" % "sbt-paradox-material-theme" % "0.6.0")
addSbtPlugin("com.github.sbt" % "sbt-unidoc" % "0.5.0")

libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % "always"
