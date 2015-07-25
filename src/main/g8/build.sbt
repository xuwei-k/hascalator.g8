scalaVersion := "$scala_version$"

name := "$name$"

libraryDependencies += "com.chuusai" %% "shapeless" % "$shapeless_version$"
libraryDependencies += "com.github.scalaprops" %% "scalaprops-gen" % scalapropsVersion.value

licenses := Seq("MIT License" -> url("http://opensource.org/licenses/mit"))

scalapropsWithScalazlaws

scalapropsVersion := "$scalaprops_version$"

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  Nil
)
