test = int(input())

while(test>0):
    max = 0
    result = 0
    l = []
    num = int(input())
    l = list(map(int, input().split()))
    for i in range(num-1):
        max = l[i] * l[i+1]
        result = result if result > max else max
    print(result)

    test = test -1

# https://codeforces.com/contest/1554/problem/A
