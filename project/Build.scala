import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "FullCalendar"
  val appVersion = "1.1.2-Snapshot"

  val appDependencies = Seq(
    javaCore, 
    javaJdbc, 
    javaEbean, 
    // Add your project dependencies here,
    "mysql" % "mysql-connector-java" % "5.1.18"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )

}
