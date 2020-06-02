package au.csiro.data61.aap.samples;

import java.net.URL;

import au.csiro.data61.aap.elf.Generator;

/**
 * GeneratorTest
 */
public class GeneratorTest {

    public static void main(String[] args) {
        Generator extractor = new Generator();
        SampleUtils.getGeneratorResources().forEach(url -> test(extractor, url));
    }

    private static void test(Generator extractor, URL url) {
        System.out.println(url.getFile());

        try {
            String code = extractor.generateLoggingFunctionality(url.getFile());
            System.out.println(code);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }

        System.out.println("\n");
    }
}
