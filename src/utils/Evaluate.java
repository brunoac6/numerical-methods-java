/*
 * Dijkstra's Two-Stack Algorithm for Expression Evaluation
 * From Sedgwick
 */
package utils;

import java.util.Stack;

/**
 *
 * @author Bruno
 */
public class Evaluate {
    
    public static Double expression(String expr) {
    Stack<String> ops = new Stack<>();
    Stack<Double> vals = new Stack<>();
    
        while(!expr.isEmpty()) {
            switch (expr) {
                case "(":
                    ;
                    break;
                case "+":
                    ops.push(expr);
                    break;
                case "-":
                    ops.push(expr);
                    break;
                case "*":
                    ops.push(expr);
                    break;
                case "/":
                    ops.push(expr);
                    break;
                case "sqrt":
                    ops.push(expr);
                    break;
                case ")":
                    String op = ops.pop();
                    Double v = vals.pop();
                    switch (op) {
                        case "+":
                            v = vals.pop() + v;
                            break;
                        case "-":
                            v = vals.pop() - v;
                            break;
                        case "*":
                            v = vals.pop() * v;
                            break;
                        case "/":
                            v = vals.pop() / v;
                            break;
                        case "sqrt":
                            v = Math.sqrt(v);
                            break;
                    }
                    vals.push(v);
                    break;
                default:
                    System.out.println(expr);
                    vals.push(Double.parseDouble(expr));
            }
        }
        return vals.pop();
    }
}
