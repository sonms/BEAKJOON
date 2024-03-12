answer = list()
while(True):
    n = int(input())
    if n == 0:
        break
    
    name = list()
    checkList = list()
    for i in range(n):
        name.append(str(input()))
    for i in range(2 * n - 1):
        temp = input().split(" ")
        if (int(temp[0])-1) in checkList:
            checkList[checkList.index((int(temp[0])-1))] = "c"
        else:
            checkList.append((int(temp[0])-1))

    for k in range(len(checkList)):
        if checkList[k] != "c":
            answer.append(name[checkList[k]])


for l in range(len(answer)):
    print(l+1, answer[l], sep=" ")