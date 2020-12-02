# Saon Sikder
# Dhaka, Bangladesh

from itertools import permutations

string,size = input().split()
permu = (sorted(list(permutations(string, int(size)))))
for i in permu:
    print(''.join(i))

