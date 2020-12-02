# i am using py 3.8.3 so this version sometimes doesn't support on URI and you will get error. But code is right 

user_input = (input())
dic = {'0':'aaaaaa','1':'aa','2':'aaaaa','3':'aaaaa','4':'aaaa','5':'aaaaa','6':'aaaaaa','7':'aaa','8':'aaaaaaa','9':'aaaaaa'}

result = ''
for i in user_input:
    result += dic.get(i,'Invalid')
print(len(result),'leds')
