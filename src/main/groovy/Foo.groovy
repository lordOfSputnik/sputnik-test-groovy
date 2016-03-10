class Foo {

    private static int methodWithInappropriateAssertion(int count) {
        try {
            print "An assertion in finally clause"
        } finally {
            assert count > 0        // violation
        }
    }
}
