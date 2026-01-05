int LinearSearch(int[] arr, int target)
{
  for (int i = 0; i < arr.Length; i++)
  {
    if (arr[i] == target)
      return i;
  }
  return -1;
}

int[] nums = { 10, 20, 30, 40 };
int index = LinearSearch(nums, 30);

Console.WriteLine(index);