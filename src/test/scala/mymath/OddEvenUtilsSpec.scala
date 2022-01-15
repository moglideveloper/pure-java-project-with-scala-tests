package mymath

import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatest.matchers.should.Matchers

class OddEvenUtilsSpec extends AnyFlatSpecLike with Matchers{

  "OddEvenUtils isOdd" should "return true for 3" in {
    OddEvenUtils.isOdd(3) should be(true)
  }

  it should "return false for 4" in {
    OddEvenUtils.isOdd(4) should be(false)
  }
}
