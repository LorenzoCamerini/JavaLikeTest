package tree.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

public class Processor {

	
	private CommonTree getAST(Reader reader) throws IOException, RecognitionException {
		JavaLikeToAstParser tokenParser = new JavaLikeToAstParser(getTokenStream(reader));
		JavaLikeToAstParser.compilationUnit_return parserResult = tokenParser.compilationUnit(); // start rule method
		reader.close();
		return (CommonTree) parserResult.getTree();
	}

	private CommonTokenStream getTokenStream(Reader reader) throws IOException {
		JavaLikeToAstLexer lexer = new JavaLikeToAstLexer(new ANTLRReaderStream(reader));
		return new CommonTokenStream(lexer);
	}

	// This is only used by unit tests and that's why it's public.
	public CommonTree getAST(InputStream input) throws IOException, RecognitionException {		
		InputStreamReader reader = new  InputStreamReader(input);
		CommonTree ast = getAST(reader);
		reader.close();
		return ast;
	}

	// This is only used by unit tests and that's why it's public.
	public CommonTokenStream getTokenStream(String script) throws IOException {
		StringReader sr = new StringReader(script);
		CommonTokenStream ts = getTokenStream(sr);
		sr.close();
		return ts;
	}

} // end of Processor class
