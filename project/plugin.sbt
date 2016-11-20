addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8" % "0.7.1")

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
