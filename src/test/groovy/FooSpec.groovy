import spock.lang.Specification


class FooSpec extends Specification {
    def "should run dummy test"() {
        given:
        Foo.printIfPositive(1)
        Foo.isOdd(5)
        Foo.checkAndPrint(2)

        expect:
        true
    }
}
