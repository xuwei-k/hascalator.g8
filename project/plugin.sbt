addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8" % "0.12.0-M2")

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
