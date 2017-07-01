addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8" % "0.9.0")

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
