class Foo {

    // Few methods containing some violations that should be detected by CodeNarc launched via Sputnik

    // method with assertion in finally clause
    private static void printIfPositive(int count) {
        try {
            println "Your number: ${count}"
        } finally {
            assert count > 0
        }
    }

    // method with broken odness rule
    private static boolean isOdd(int x) {
        if (x % 2 == 1) {
            println "You're lucky to confirm ${x} as an odd number, but don't expect the same result with negative numbers."
            return true;
        }
        return false
    }

    // method with duplicate case statement
    private static void checkAndPrint(int x) {
        switch (x) {
            case 0: println "Zero"; break
            case 1: println "One"; break
            case 2: println "Two"; break
            case 2: println "Another two, hm ...."; break
            default: println "Other numbers but not 0, 1 or 2"; break
        }
    }

}
