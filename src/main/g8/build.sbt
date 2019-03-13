scalaVersion := "$scala_version$"

name := "$name$"

libraryDependencies += "com.github.scalaprops" %% "scalaprops-gen" % scalapropsVersion.value
libraryDependencies += "com.github.scalaprops" %% "scalaprops-shapeless" % "$scalaprops_shapeless_version$"

licenses := Seq("MIT License" -> url("http://opensource.org/licenses/mit"))

scalapropsWithScalaz

scalapropsVersion := "$scalaprops_version$"

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)

val unusedWarnings = (
  "-Ywarn-unused" ::
  Nil
)

scalacOptions ++= PartialFunction.condOpt(CrossVersion.partialVersion(scalaVersion.value)){
  case Some((2, v)) if v >= 11 => unusedWarnings
}.toList.flatten

Seq(Compile, Test).flatMap(c =>
  scalacOptions in (c, console) ~= {_.filterNot(unusedWarnings.toSet)}
)

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
