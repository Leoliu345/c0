import analyser.Analyser;
import instruction.Operation;
import tokenizer.StringIter;
import tokenizer.Token;
import tokenizer.TokenType;
import tokenizer.Tokenizer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Compiler {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File(args[0]));
        StringIter it=new StringIter(sc);
        Tokenizer tokenizer=new Tokenizer(it);
        Analyser analyser=new Analyser(tokenizer);
        analyser.analyse(args[1]);
    }
}
