n = int(input())
answers = list()
for i in range(n):
    tc = input().split(" ")
    w = int(int(tc[0]) * (int(int(tc[2]) - 1)) + int(tc[1]))
    answers.append(w)


for j in answers:
    print(j)
    
