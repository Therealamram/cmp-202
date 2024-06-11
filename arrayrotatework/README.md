Problem Statement

Given an array a of n integers and a number d, the task is to perform d left rotations on the array and return the updated array.

Approach

Calculate Effective Rotations:

To avoid unnecessary rotations beyond the length of the array, calculate the effective number of rotations as effectiveRotations = d % n, where n is the length of the array.
Create Rotated Array:

Create a new array rotatedArray of the same length as the original array to hold the rotated elements.
Perform Left Rotations:

Iterate through each element of the original array.
Calculate the new index after rotation using the formula newIndex = (i - effectiveRotations + n) % n.
Place the element at the calculated index in the rotatedArray.
Return Rotated Array:

Return the rotatedArray, which now contains the elements after left rotations.
Complexity Analysis
Time Complexity: O(n)
The algorithm iterates through each element of the array once to perform the rotations.
Space Complexity: O(n)
Additional space is required to store the rotated elements in the rotatedArray.
Example
Consider the array [1, 2, 3, 4, 5] and d = 2.

Calculate effective rotations: effectiveRotations = 2 % 5 = 2.
Create rotatedArray of length 5.
Perform left rotations:
For i = 0, calculate newIndex = (0 - 2 + 5) % 5 = 3.
For i = 1, calculate newIndex = (1 - 2 + 5) % 5 = 4.
For i = 2, calculate newIndex = (2 - 2 + 5) % 5 = 0.
For i = 3, calculate newIndex = (3 - 2 + 5) % 5 = 1.
For i = 4, calculate newIndex = (4 - 2 + 5) % 5 = 2.
Place elements in rotatedArray: [3, 4, 5, 1, 2].
Return [3, 4, 5, 1, 2].
Conclusion
The left rotation algorithm efficiently performs left rotations on an array, providing a straightforward solution to the problem.

