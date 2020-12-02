limit = int(input())
count = 0
for i in range(limit):
    number = int(input())
    while (number > 1):
        temp = number / 2
        count +=1
        number = temp
    print(count,"dias")
    count = 0

