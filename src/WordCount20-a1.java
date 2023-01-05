class WordCount {
    public static void main(String[] args) {
        String str = "Hi, I am Sudip!";
        String[] words = str.split("\\s");
        System.out.println("Word count "+words.length);
    }
}
