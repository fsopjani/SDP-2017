import factorymethod._
import org.scalatest.{FunSpec, GivenWhenThen}

/**
  * Created by fatos on 04/04/2017.
  */
class FactoryUnitTest  extends FunSpec with GivenWhenThen {

  describe("Creator") {
    val creator : Creator = new Creator
    it("Create an instance of ConcreteProduct/Product") {
      Given("class creator")

      When("creating a product object via creator")
      val c = creator.apply("one")

      Then("create an instance of Product, Concrete Product")
      assert(c.isInstanceOf[Product])
      assert(c.isInstanceOf[ConcreteProduct1])
    }

    it("Create an instance of ConcreteProduct1/Product") {
      Given("class creator")

      When("creating a product object via creator")
      val c = creator.apply("one")

      Then("create an instance of Product, Concrete Product")
      assert(c.isInstanceOf[Product])
      assert(c.isInstanceOf[ConcreteProduct1])
    }

    it("Create an instance of ConcreteProduct2/Product") {
      Given("class creator")

      When("creating a product object via creator")
      val c = creator.apply("two")

      Then("create an instance of Product, Concrete Product")
      assert(c.isInstanceOf[Product])
      assert(c.isInstanceOf[ConcreteProduct2])
    }
  }

  describe("ConcreteCreator") {
    val concreteCreator : ConcreteCreator = new ConcreteCreator
    it("create an instance of product via concrete class") {
      Given("concreteCreator")

      When("calling concreteCreator.getConcreteInstance")
      val cc = concreteCreator.getConcreteInstance("one")

      Then("create an instance of Product and ConcreteProduct2")
      assert(cc.isInstanceOf[Product])
      assert(cc.isInstanceOf[ConcreteProduct1])

    }
  }
}
