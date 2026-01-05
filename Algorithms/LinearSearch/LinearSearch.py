print("Linear Search Algorithm in Python")

def linear_search(arr, target):
    for i in range(len(arr)):
      if arr[i] == target:
        return i
    return -1
  
print(linear_search([1,4,3,5,23,32], 23))