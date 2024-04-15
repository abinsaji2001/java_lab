import java.util.Stack;
public class Stackpos {
public static void removeElementAtPosition(Stack<String> stack, int position) {
if (position >= 1 && position <= stack.size()) {
Stack<String> tempStack = new Stack<>();
// Remove elements from the original stack until the desired position is reached
for (int i = 1; i < position; i++) {
tempStack.push(stack.pop());
}
// Remove the element at the desired position
stack.pop();
// Restore the remaining elements back to the original stack
while (!tempStack.isEmpty()) {
stack.push(tempStack.pop());
}
System.out.println("Element at position " + position + " removed successfully.");
} else {
System.out.println("Invalid position. Please provide a valid position within the stack range.");
}
}
public static void main(String[] args) {
System.out.println("Abin Saji");
System.out.println("23MCA003");
System.out.println("16/03/2024");
System.out.println();
Stack<String> stack = new Stack<>();
stack.push("Apple");
stack.push("Grapes");
stack.push("Orange");
stack.push("Strawberry");
stack.push("Mango");
int positionToRemove = 3;
System.out.println("Before removal: " + stack);
removeElementAtPosition(stack, positionToRemove);
System.out.println("After removal: " + stack);
}
}
