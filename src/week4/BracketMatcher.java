public class BracketMatcher{
    public static void main(String[] args) {
        String str ="((())())";
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            System.out.println("현재 스택 상태: " + stack);
            //c가 '('라면 stack에 push.
            if(c == '(') {
                stack.push(c);
            // ')' && stack 값ok && stack의 맨 위가 '('라면 stack에서 '(' 제거. (상쇄개념)
            } else if(!stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            // 이것도 아니라면 stack에 push.
            } else {
                stack.push(c);
            }
        }

        System.out.println("최종 스택 상태: " + stack);
        System.out.println("결과: " + stack.isEmpty());
    }
}
