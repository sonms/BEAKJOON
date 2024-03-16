numList = dict() #,dict key,value
answer = 0
answerIndexList = list()
for i in range(8):
    n = int(input())
    numList[i] = n

sorted_item = sorted(numList.items(),  key=lambda x: x[1], reverse=True)
#sorted의 key 매개변수가 바로 '무엇을 기준으로 정렬하냐'입니다.
#x[1]은 value를 의미한다. x[1](value)을 기준으로 정렬

for key, value in sorted_item[:5]:
    answerIndexList.append(key+1)
    answer += value
answerIndexList = sorted(answerIndexList)
print(answer)
print(' '.join(map(str, answerIndexList)))
