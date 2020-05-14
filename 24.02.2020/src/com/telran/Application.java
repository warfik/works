package com.telran;

import com.telran.operation.*;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
public class Application {

    public static final String INPUT_FILENAME = "input.txt";
    public static final String OUTPUT_FILENAME = "output.txt";

    public static void main(String[] args) throws FileNotFoundException {

        String inputFilename = args.length > 0 ? args[0] : INPUT_FILENAME;
        String outputFilename = args.length > 1 ? args[1] : OUTPUT_FILENAME;
        final String DELIMITER = "#";

        IOperation uppercase = new UpperCaseOperation();
        IOperation lowercase = new LowerCaseOperation();
        IOperation reverse = new ReverseOperation();

        Map<String, IOperation> operationByName = new HashMap<>();
        //TODO fill operationByName via put method

        OperationProvider op = new OperationProvider(operationByName);
        Deque<String> deque = new ConcurrentLinkedDeque<>();
        //TODO read the input file into the deque

        for (int i = 0; i < 5; i++) {
            Thread th = new TextHandler(op, deque, DELIMITER);
            th.start();
        }
    }
}
