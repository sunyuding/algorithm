import java.util.Stack;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
//public class NestedIterator {
//    Stack<NestedInteger> stack = new Stack<>();
//
//    public NestedIterator(List<NestedInteger> nestedList) {
//        for (int i = nestedList.size() - 1; i >= 0; i--) {
//            stack.push(nestedList.get(i));
//        }
//    }
//
//    @Override
//    public Integer next() {
//        return stack.pop().getInteger();
//    }
//
//    @Override
//    public boolean hasNext() {
//        while(!stack.isEmpty()) {
//            NestedInteger cur = stack.pop();
//            if (cur.isInteger()) {
//                return true;
//            } else {
//                for (int i = cur.getList().size() - 1; i >= 0; i--) {
//                    stack.push(cur.getList().get(i));
//                }
//            }
//        }
//        return false;
//    }
//}
