package homework_1.task_1;

public class Park_Miller_Random_Numbers {
    // m is coprime to seed r_seed
    static final long m = 2147483647L;

    // constants
    static final long a = 48271L;
    static final long q = 44488L;
    static final long r = 3399L;

    // take a r_seed that is coprime to m
    static long r_seed = 12345678L;

    public static double uniform() {
        // highest and lowest for
        // a random number generation
        // range
        long hi = r_seed / q;
        long lo = r_seed - q * hi;

        // calculate random number
        long t = a * lo - r * hi;

        // if positive
        if (t > 0 )
            r_seed = t;
        else
            r_seed = t + m;
        return r_seed;
    }
}