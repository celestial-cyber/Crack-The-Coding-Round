# PROBLEM STATEMENT: Compare Adjacent Digits-Spec
# You are given a string 'num' consisting only of digits (0–9).
# Compare each pair of adjacent digits and generate a result string:
# '>' -> if current digit > next digit
# '<' -> if current digit < next digit
# '=' -> if both digits are equal
#
# Input Format:
# A single string num
#
# Constraints:
# 2 <= |num| <= 10^5
#
# Output Format:
# Print the resulting comparison string.
#
# ALGORITHM:
# 1. Read the input string 'num' and strip any trailing whitespace.
# 2. Initialize an empty list 'result' to collect the comparison symbols 
#    (using a list and joining at the end is efficient in Python).
# 3. Loop through the string from index 0 up to len(num) - 2.
# 4. In each iteration, compare num[i] with num[i + 1]:
#    - If num[i] > num[i + 1], append '>'
#    - If num[i] < num[i + 1], append '<'
#    - Otherwise, append '='
# 5. Join the list into a single string and print it.
#
# Time Complexity: O(N) - We loop through the string of length N exactly once.
# Space Complexity: O(N) - To store the resulting characters.

import sys

def solve():
    # Read all input from standard input
    input_data = sys.stdin.read().split()
    if not input_data:
        return
    
    num = input_data[0]
    result = []
    
    # Loop until the second-to-last character
    for i in range(len(num) - 1):
        if num[i] > num[i + 1]:
            result.append('>')
        elif num[i] < num[i + 1]:
            result.append('<')
        else:
            result.append('=')
            
    # Print the final joined string
    print("".join(result))

if __name__ == '__main__':
    solve()