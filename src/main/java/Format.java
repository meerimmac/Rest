import kg.salyk.ettn.generator.Fakers;

public class Format {
    public static void main(String[] args) {

        Fakers f = new Fakers();
        String name = f.getName();
        String sentence = String.format("Hello %s", name);

        System.out.println(sentence);

        String sentence1 = String.format("Hello %d", 12);
        System.out.println(sentence1);

    }
}
