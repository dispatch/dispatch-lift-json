import sbt._
object Appy extends Build
{
  lazy val root =
    Project("dispatch-lift-json", file(".")) dependsOn(reboot)
  lazy val reboot =
    uri("../reboot")
}
