arr={4, 2, 1, 5, 3}
def immediateSmaller(arr):
    for i in range(len(arr)-1):
        if arr[i] > arr[i+1]: #print smallest
	        print(arr[i+1],end=" ")
        else : #print -1
          print(-1,end=" ")
print(-1,end=" ") #for last element as mentioned is always -1
immediateSmaller(arr)

               
