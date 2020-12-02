# Saon Sikder
# Dhaka, Bangladesh

def average(array):
    unique = list(set(array))
    unique_len = len(unique)
    unique_sum = sum(unique)
    return unique_sum/unique_len
    # return sum(set(array))/len(set(array))  # it is for one line solution

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
