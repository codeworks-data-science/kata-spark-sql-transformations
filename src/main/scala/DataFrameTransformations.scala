import org.apache.spark.rdd.RDD
import org.apache.spark.sql.DataFrame

/** Main class */
object DataFrameTransformations {

  /** Main function */
  def main(args: Array[String]): Unit = {
    println("hello world")
  }

  /**
    *
    * @param df containing some persons
    * @return a DataFrame containing the names of the persons in the initial rdd
    */
  def selectNames(df: DataFrame): DataFrame = {
    ???
  }


  /**
    * Represents a human being with some of its characteristics
    * @param name
    * @param age
    * @param sex
    */
  case class Person (
    name: String,
    age: Int,
    sex: String
  )
}
