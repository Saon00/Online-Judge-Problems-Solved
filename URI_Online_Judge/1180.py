# you will get run time error. But output is correct

limit = int(input())
num_list = []
for i in range(0,limit):
    num = int(input())
    num_list.append(num)

min_output = min(num_list)
print("Menor valor:",min_output)
min_output_index = num_list.index(min_output)
print("Posicao:",min_output_index)

