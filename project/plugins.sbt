// Comment to get more information during initialization
logLevel := Level.Warn

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.6")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")

// The Typesafe repository 
//resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers ++= Seq("Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
				"sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/")
				

                 