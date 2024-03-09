answer = list()

while(True):
    temp = 0
    tc = input()
    if(tc == "#"):
        break

    for i in tc:
        if (i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u' or
            i == 'A' or i == 'E' or i == 'I' or i == 'O' or i == 'U'    
            ):
            temp = temp + 1
    answer.append(temp)

for j in answer:
    print(j)
