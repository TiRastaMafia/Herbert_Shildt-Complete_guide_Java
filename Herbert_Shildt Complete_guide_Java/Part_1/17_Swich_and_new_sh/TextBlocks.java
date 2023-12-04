class TextBlocks {
    public static void main(String[] args) {
        String str = """
        это 
                        новый
                                текстовый
                        блок""";

        String str2 = """
        это 
                        новый \
        текстовый
                        блок""";

        System.out.println(str);
        System.out.println(str2);
    }
}
