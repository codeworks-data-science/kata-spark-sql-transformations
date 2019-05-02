import DataFrameTransformations.Person
import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

trait RddTestTrait {
  lazy val dft = DataFrameTransformations

  lazy val persons = List (
    Person("Edwin", 28, "M")
  )

  val spark: SparkSession =
    SparkSession
      .builder()
      .appName("DataFrame Transformations Kata")
      .config("spark.master", "local")
      .getOrCreate()

  lazy val df = spark.createDataFrame(persons)
}

//----------------------------------------------------------------------------
//       selectNames
//----------------------------------------------------------------------------

@RunWith(classOf[JUnitRunner])
class SelectNamesTest extends FunSuite with RddTestTrait {

  test("should_return_the_names_in_the_rdd") {
    //GIVEN
    val names = Array("Edwin")

    //WHEN
    val result = dft.selectNames(df)

    //THEN
    assert(result.collect() == names)
  }

}
