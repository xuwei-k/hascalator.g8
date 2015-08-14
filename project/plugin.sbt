addSbtPlugin("net.databinder.giter8" % "giter8-plugin" % "0.6.8")

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
