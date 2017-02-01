addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8" % "0.7.2")

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
