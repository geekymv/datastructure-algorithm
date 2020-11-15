package com.geekymv.datastructure.statck;

public class MathExpress {

    public static void main(String[] args) {

        String express = "4 + 2 + 3 * 10 / 5";

        // 操作数栈
        ArrayStack<Double> numStack = new ArrayStack(10);
        // 运算符栈
        ArrayStack<Character> opStack = new ArrayStack(10);

        // 记录数字开始位置，用于从字符串中截取数字
        int index = 0;

        for(int i = 0, len = express.length(); i < len; i++) {
            char c = express.charAt(i);
            if(c == '+' || c == '-' || c == '*' || c == '/') {
                // 从字符串中截取出数字
                String value = express.substring(index, i).trim();
                Double num = Double.parseDouble(value);
                numStack.push(num);
                index = i + 1;

                // 如果运算符栈为空，直接入栈
                if(opStack.isEmpty()) {
                    opStack.push(c);
                    // 继续下一次循环
                    continue;
                }

                // 取出栈顶运算符
                Character op = opStack.peek();

                if(compare(c, op) > 0) {
                    // 当前运算符优先级高于栈顶运算符优先级，则直接将当前运算符入栈
                    opStack.push(c);

                } else {
                    // 当前运算符优先级低于或等于栈顶运算符，则从操作数栈取出2个操作数与栈顶运算符执行计算
                    Double v1 = numStack.pop();
                    Double v2 = numStack.pop();
                    double res = calc(v1, v2, opStack.pop());
                    // 将计算结果入操作数栈
                    numStack.push(res);
                    // 将当前运算符入栈
                    opStack.push(c);
                }
            }

            // 最后一个数字
            if(i == len - 1) {
                Double num = Double.parseDouble(express.substring(index, len).trim());
                numStack.push(num);
            }
        }

        // 计算最终结果
        while (!opStack.isEmpty()) {
            Double v1 = numStack.pop();
            Double v2 = numStack.pop();
            double res = calc(v1, v2, opStack.pop());
            numStack.push(res);
        }

        System.out.println(express +" = " + numStack.pop());

    }

    /**
     * 计算
     * @param v1
     * @param v2
     * @param c
     * @return
     */
    public static double calc(double v1, double v2, char c) {
        switch (c) {
            case '+':
                return v2 + v1;
            case '-':
                return v2 - v1;
            case '*':
                return v2 * v1;
            case '/':
                return v2 / v1;

            default:
                throw new IllegalArgumentException("不支持的运算符" + c);
        }
    }

    /**
     * 比较运算符优先级
     * @param c1
     * @param c2
     * @return
     */
    public static int compare(char c1, char c2) {
        return priority(c1) - priority(c2);
    }

    /**
     * 获取运算符优先级
     * @param c
     * @return
     */
    private static int priority(char c) {
        if(c == '+' || c == '-') {
            return 0;
        }else if(c == '*' || c == '/') {
            return 1;
        }
        throw new IllegalArgumentException("不支持的运算符" + c);
    }
}
