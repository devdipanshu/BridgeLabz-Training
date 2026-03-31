public class StringBufferVsStringBuilder {

    public static void testStringBuffer() {
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();
        for(int i = 0;i < 1000000;i++) {
            sb.append("hello");
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime));
    }

    public static void testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();
        for(int i = 0;i < 1000000;i++) {
            sb.append("hello");
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime));
    }

    public static void main(String[] args) {

        testStringBuffer();
        testStringBuilder();
    }
}
