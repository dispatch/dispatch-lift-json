import sbt._
import Keys._

object Build extends sbt.Build {
  lazy val dispatchLiftJson =
    Project("dispatch-lift-json",
            file("."),
            settings = Defaults.defaultSettings
    )
}
