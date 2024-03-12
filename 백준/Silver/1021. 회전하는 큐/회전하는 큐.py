class ListQueue(object):
    def __init__(self):
        self.queue = []
    def dequeue(self):
        if len(self.queue) == 0:
            return -1
        return self.queue.pop(0)
    def enqueue(self, n):
        self.queue.append(n)
        pass #continue
    def printQueue(self):
        print(self.queue)
    def searchQueue(self, n):
        if n in self.queue:
            return self.queue.index(n)
        else:
            return -1
    def sizeOfQueue(self):
        return len(self.queue)
    def rightDequeue(self):
        if len(self.queue) == 0:
            return -1
        return self.queue.pop(-1)
    def leftEnqueue(self, n):
        self.queue.insert(0, n)
        pass
    

lq = ListQueue()
temp =input().split(" ")
n = int(temp[0])
m = int(temp[1])
cnt = 0
numberList = list(map(int, input().split()))
for i in range(n):
    lq.enqueue(i+1)




while True:
    check = 0
    if len(numberList) != 0 :
        check = numberList[0]
        numberList.remove(numberList[0])
    else:
        break


    if lq.searchQueue(check) <= lq.sizeOfQueue() // 2:
        
        for j in range(lq.searchQueue(check)):
            lq.enqueue(lq.dequeue())
            cnt += 1
            
        lq.dequeue()
        

        
    elif lq.searchQueue(check) > lq.sizeOfQueue() // 2:
        
        for k in range(lq.sizeOfQueue() - (lq.searchQueue(check))):
            lq.leftEnqueue(lq.rightDequeue())
            cnt +=1
        
        lq.dequeue()
        
        
print(cnt)   
