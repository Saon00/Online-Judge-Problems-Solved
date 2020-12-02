# Saon Sikder
# Dhaka, Bangladesh

def print_rangoli(size):
    n = size    
    l1 = list(map(chr, range(97,123)))
    l2 = l1[(n-1)::-1]+l1[1:n]
    re = '-'.join(l2)
    re_len = len(re)
    for i in range(1,n):
        line1 = ('-'.join(l1[n-1:n-i:-1]+l1[n-i:n]).center(re_len,'-'))
        print(line1)
    for i in range(n,0,-1):
        line1 = ('-'.join(l1[n-1:n-i:-1]+l1[n-i:n]).center(re_len,'-'))
        print(line1)

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
