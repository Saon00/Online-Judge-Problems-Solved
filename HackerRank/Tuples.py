n = int(input())
int_list = map(int, input().split())
list = [i for i in int_list]
print(hash(tuple(list)))
