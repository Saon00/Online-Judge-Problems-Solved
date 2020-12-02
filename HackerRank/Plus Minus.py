# Saon Sikder
# Dhaka Bangladesh

import math
import os
import random
import re
import sys

def plusMinus(arr):
    p = ne = z = 0
    for i in range(n):
        if arr[i] > 0:
            p += 1
        elif arr[i] < 0:
            ne += 1
        elif arr[i] == 0:
            z += 1
    print('{:.6f}'.format(p / n))
    print('{:.6f}'.format(ne / n))
    print('{:.6f}'.format(z / n))

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().rstrip().split()))
    plusMinus(arr)


# Easy way using Lambda Function ------
def plusMinus(arr):
    print(format(len([x for x in arr if x > 0])/n,".6f"))
    print(format(len([x for x in arr if x < 0])/n,".6f"))
    print(format(len([x for x in arr if x == 0])/n,".6f"))
