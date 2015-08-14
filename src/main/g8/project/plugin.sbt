addSbtPlugin("com.github.scalaprops" % "sbt-scalaprops" % "$scalaprops_plugin_version$")

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
