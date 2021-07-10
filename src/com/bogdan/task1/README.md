# Balanced Brackets

A practical task from the interview. The essence of the task is to check all the brackets in the example. A correct example is considered if the brackets begin and end accordingly.

A bracket is considered to be any of the following characters – “(“, “)”, “[“, “]”, “{“, “}”.

A set of brackets is considered to be a matched pair if an opening bracket, “(“, “[“, and “{“, occurs to the left of the corresponding closing bracket, “)”, “]”,  and “}”, respectively.

```java
    String: 10 + (12 - 5)   ---> is valid? true
    String: 10 + 2 - 5)   ---> is valid? false
    String: 10 + ((2 - 5)   ---> is valid? false
    String: 10 + ()2 - 5   ---> is valid? true
    String: 10 + (2 - 5) + (20 + 2)   ---> is valid? true
    String: ()   ---> is valid? true
    String: ())   ---> is valid? false
    String: 10 + (2 * (7 - 3 + (10 : 2) - 1)) + 100   ---> is valid? true
    String: 10 + (2 * (7 - 3 + (10 : 2) - 1))) + 100   ---> is valid? false
    String: 10 + ((2 * (7 - 3 + (10 : 2) - 1)) + 100   ---> is valid? false
```
