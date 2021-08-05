t = int(input())
sum = 0
sum += t // 100
sum += (t % 100) // 20
sum += (t % 20) // 10
sum += (t % 10) // 5
sum += (t % 5)
print(sum)

# https://codeforces.com/problemset/problem/996/A

""" OR using floor operator
t = int(input())
print(t // 100 + (t % 100) // 20 + (t % 20) // 10 + (t % 10) // 5 + (t % 5))
"""
