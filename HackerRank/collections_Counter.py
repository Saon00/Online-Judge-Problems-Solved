from collections import Counter

shoes = input()
shoes_sizes = list(map(int,input().split()))
dict = Counter(shoes_sizes)
customer_number = int(input())
sum = 0
for i in range(customer_number):
    size,price = map(int,input().split())
    if size not in shoes_sizes:
        continue
    else:
        if dict[size] !=0:
            sum += price
            dict[size] -= 1

print(sum)
