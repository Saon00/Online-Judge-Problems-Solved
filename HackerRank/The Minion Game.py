# Saon Sikder
# Dhaka, Bangladesh

def minion_game(string):
    s = string
    s1 = 0
    s2 = 0
    vow = 'AEIOU'
    for i in range(len(s)):
        if s[i] not in vow:
            # s1 = s1 + len(s[i:])  using this occurs time limit exceed
            s1 = s1 + (len(s) - i)
        else:
            # s2 = s2 + len(s[i:])  using this occurs time limit exceed
            s2 = s2 + (len(s) - i)
    if s1 > s2:
        print("Stuart", s1)
    elif s1 < s2:
        print("Kevin", s2)
    else:
        print("Draw")

    

if __name__ == '__main__':
    s = input()
    minion_game(s)
