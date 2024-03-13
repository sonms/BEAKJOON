lr = list(map(int, input().split()))
l = str(lr[0])  # l을 문자열로 변환
r = str(lr[1])  # r을 문자열로 변환
minNum = 0

if len(l) != len(r) or l[0] != r[0]:  # l과 r이 다른 자릿수를 갖거나 첫 번째 자릿수가 다르면
    minNum = 0
##else:
##    minNum = l.count("8")  # l에 포함된 "8"의 개수를 최소값으로 설정
##
##if len(l) != len(r):
##    minNum = 0

elif len(l) == len(r):
    for i in range(0, len(l)):
        if l[i] == r[i]:
            if l[i] == "8":
                minNum += 1

        else:
            break
        
        
print(minNum)
