public class StringConcatenationComparison {

    static void usingString(int n){
        String s = "";
        for(int i = 0;i<n;i++){
            s = s + "a";
        }
    }

    static void usingStringBuilder(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++){
            sb.append("a");
        }
    }

    static void usingStringBuffer(int n){
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<n;i++){
            sb.append("a");
        }
    }

    public static void main(String[] args){

        int n = 1000000;

        long startString = System.nanoTime();
        usingString(n);
        long endString = System.nanoTime();

        System.out.println("String Time (ns): " + (endString - startString));

        long startBuilder = System.nanoTime();
        usingStringBuilder(n);
        long endBuilder = System.nanoTime();

        System.out.println("StringBuilder Time (ns): " + (endBuilder - startBuilder));

        long startBuffer = System.nanoTime();
        usingStringBuffer(n);
        long endBuffer = System.nanoTime();

        System.out.println("StringBuffer Time (ns): " + (endBuffer - startBuffer));
    }
}
