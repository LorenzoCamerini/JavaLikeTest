package main;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.stringtemplate.StringTemplateGroup;

import tree.test.Processor;

public class JavaLikeMain {
	public static StringTemplateGroup templates;
	
	private static Processor processor = new Processor();

	public static void main(String[] args) throws Exception {
        process("input", "StoresProcedure.stg");
    }

    private static void process(String input, String templateResourceName)
            throws IOException, RecognitionException, Exception {
      
    	InputStream stream = JavaLikeMain.class.getClassLoader().getResourceAsStream("input");
    	CommonTree ast = processor.getAST(stream);    

        System.out.println(ast);
        
      
    }

}
